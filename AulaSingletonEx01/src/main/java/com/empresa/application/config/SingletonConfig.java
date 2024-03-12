package com.empresa.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.empresa.application.service.UsuarioService;
import com.empresa.persistence.UsuarioRepository;

@Configuration
public class SingletonConfig {

    @Bean
    public UsuarioService usuarioService(UsuarioRepository usuarioRepository) {
        return new UsuarioService(usuarioRepository);
    }
}