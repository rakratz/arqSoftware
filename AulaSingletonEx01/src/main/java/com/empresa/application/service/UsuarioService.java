package com.empresa.application.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.empresa.application.dto.UsuarioDTO;
import com.empresa.domain.Usuario;
import com.empresa.persistence.UsuarioRepository;

@Service
public class UsuarioService {
    private static UsuarioService instance;

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Método estático para obter a instância única da classe
    public static UsuarioService getInstance(UsuarioRepository usuarioRepository) {
        if (instance == null) {
            instance = new UsuarioService(usuarioRepository);
        }
        return instance;
    }

    public List<UsuarioDTO> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    private UsuarioDTO mapToDTO(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(usuario.getId());
        dto.setNome(usuario.getNome());
        dto.setEmail(usuario.getEmail());
        return dto;
    }
}
