package com.empresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.empresa.application.dto.UsuarioDTO;
import com.empresa.application.service.UsuarioService;

import java.util.List;

@SpringBootApplication
public class AulaSingletonEx01Application {

	 public static void main(String[] args) {
	        ApplicationContext context = SpringApplication.run(AulaSingletonEx01Application.class, args);

	        // Obtendo o serviço de usuários do contexto
	        UsuarioService usuarioService = context.getBean(UsuarioService.class);

	        // Obtendo todos os usuários e imprimindo seus detalhes
	        List<UsuarioDTO> usuarios = usuarioService.getAllUsuarios();
	        for (UsuarioDTO usuario : usuarios) {
	            System.out.println("ID: " + usuario.getId());
	            System.out.println("Nome: " + usuario.getNome());
	            System.out.println("Email: " + usuario.getEmail());
	            System.out.println();
	        }
	    }
}
