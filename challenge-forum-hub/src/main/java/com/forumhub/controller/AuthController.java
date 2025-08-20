package com.forumhub.controller;

import com.forumhub.dto.LoginDTO;
import com.forumhub.model.Usuario;
import com.forumhub.repository.UsuarioRepository;
import com.forumhub.service.TokenService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class AuthController {

    private final UsuarioRepository usuarioRepository;
    private final TokenService tokenService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping
    public ResponseEntity<?> autenticar(@RequestBody @Valid LoginDTO loginDTO) {
        return usuarioRepository.findByUsername(loginDTO.getUsername())
                .filter(u -> passwordEncoder.matches(loginDTO.getSenha(), u.getSenha()))
                .map(u -> ResponseEntity.ok().body(tokenService.gerarToken(u)))
                .orElse(ResponseEntity.status(401).body("Usuário ou senha inválidos"));
    }
}
