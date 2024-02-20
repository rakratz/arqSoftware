package com.empresa.model;

import java.util.List;

public class Departamento {
	private int id;
	private String nome;
	private List<Funcionario> funcionarios;
	
	public Departamento() {
	}
	
	public Departamento(int id, String nome, List<Funcionario> funcionarios) {
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
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	
}
