package com.forumhub.controller;

import com.forumhub.dto.TopicoDTO;
import com.forumhub.model.Topico;
import com.forumhub.model.Usuario;
import com.forumhub.repository.TopicoRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/topicos")
@RequiredArgsConstructor
public class TopicoController {

    private final TopicoRepository topicoRepository;

    @GetMapping
    public List<Topico> listar() {
        return topicoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Topico> detalhar(@PathVariable Long id) {
        return topicoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?> criar(@RequestBody @Valid TopicoDTO dto, @AuthenticationPrincipal Usuario usuario) {
        if (topicoRepository.findByTituloAndMensagem(dto.getTitulo(), dto.getMensagem()).isPresent()) {
            return ResponseEntity.badRequest().body("Tópico duplicado");
        }

        Topico topico = new Topico();
        topico.setTitulo(dto.getTitulo());
        topico.setMensagem(dto.getMensagem());
        topico.setCurso(dto.getCurso());
        topico.setAutor(usuario);
        topico.setDataCriacao(LocalDateTime.now());

        topicoRepository.save(topico);
        return ResponseEntity.ok(topico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody @Valid TopicoDTO dto, @AuthenticationPrincipal Usuario usuario) {
        return topicoRepository.findById(id)
                .map(topico -> {
                    if (!topico.getAutor().getId().equals(usuario.getId())) {
                        return ResponseEntity.status(403).body("Acesso negado");
                    }
                    topico.setTitulo(dto.getTitulo());
                    topico.setMensagem(dto.getMensagem());
                    topico.setCurso(dto.getCurso());
                    topicoRepository.save(topico);
                    return ResponseEntity.ok(topico);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id, @AuthenticationPrincipal Usuario usuario) {
        return topicoRepository.findById(id)
                .map(topico -> {
                    if (!topico.getAutor().getId().equals(usuario.getId())) {
                        return ResponseEntity.status(403).body("Acesso negado");
                    }
                    topicoRepository.delete(topico);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
