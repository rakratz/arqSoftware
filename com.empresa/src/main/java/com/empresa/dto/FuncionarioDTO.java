package com.empresa.dto;

public class FuncionarioDTO {
	private int id;
	private String nome;
	private String cargo;

	public FuncionarioDTO() {

	}
	
	// Construtor com todos os parametros
	public FuncionarioDTO(int id, String nome, String cargo) {
		this.id = id;
		this.nome = nome;
		this.cargo = cargo;
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
