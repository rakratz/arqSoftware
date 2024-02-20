package com.empresa.dto;

import java.util.List;


public class DepartamentoDTO {
	private int id;
	private String nome;
	private List<FuncionarioDTO> funcionarios;
	
	public DepartamentoDTO() {
		
	}
	
	public DepartamentoDTO(int id, String nome, List<FuncionarioDTO> funcionarios) {
		this.id = id;
		this.nome = nome;
		this.funcionarios = funcionarios;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<FuncionarioDTO> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<FuncionarioDTO> funcionarios) {
		this.funcionarios = funcionarios;
	}
}
