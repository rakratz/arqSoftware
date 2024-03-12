package com.empresa.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
