package com.forumhub.service;

import com.forumhub.entity.Topico;
import com.forumhub.entity.Usuario;
import com.forumhub.repository.TopicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TopicoService {

    private final TopicoRepository topicoRepository;

    public TopicoService(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    public List<Topico> listarTodos() {
        return topicoRepository.findAll();
    }

    public Topico buscarPorId(Long id) {
        return topicoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Tópico não encontrado"));
    }

    @Transactional
    public Topico criar(Topico topico) {
        if (topicoRepository.existsByTituloAndMensagem(topico.getTitulo(), topico.getMensagem())) {
            throw new IllegalArgumentException("Tópico duplicado");
        }
        return topicoRepository.save(topico);
    }

    @Transactional
    public Topico atualizar(Long id, Topico dadosAtualizados, Usuario usuarioLogado) {
        Topico topico = buscarPorId(id);

        if (!topico.getAutor().getUsername().equals(usuarioLogado.getUsername())) {
            throw new AccessDeniedException("Você não tem permissão para alterar este tópico.");
        }

        topico.setTitulo(dadosAtualizados.getTitulo());
        topico.setMensagem(dadosAtualizados.getMensagem());
        topico.setCurso(dadosAtualizados.getCurso());

        return topicoRepository.save(topico);
    }

    @Transactional
    public void excluir(Long id, Usuario usuarioLogado) {
        Topico topico = buscarPorId(id);

        if (!topico.getAutor().getUsername().equals(usuarioLogado.getUsername())) {
            throw new AccessDeniedException("Você não tem permissão para excluir este tópico.");
        }

        topicoRepository.deleteById(id);
    }
}
