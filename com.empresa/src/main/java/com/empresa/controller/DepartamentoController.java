package com.empresa.controller;

import java.util.ArrayList;
import java.util.List;

import com.empresa.dto.DepartamentoDTO;
import com.empresa.dto.FuncionarioDTO;
import com.empresa.model.Departamento;
import com.empresa.model.Funcionario;

public class DepartamentoController {
	private List<Departamento> departamentos;
	
	public DepartamentoController() {
		this.departamentos = new ArrayList<>(); 
	}
	
	public void addDepartamento(Departamento departamento) {
		departamentos.add(departamento);
	}
	
	public List<DepartamentoDTO> getAllDpartamentosDTO(){
		List<DepartamentoDTO> departamentoDTOs = new ArrayList<>();
		for (Departamento departamento : departamentos) {
			DepartamentoDTO dto = new DepartamentoDTO();
			dto.setId(departamento.getId());
			dto.setNome(departamento.getNome());
			
			List<FuncionarioDTO> funcionarioDTOs = new ArrayList<>();
			for (Funcionario funcionario : departamento.getFuncionarios()) {
				FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
				funcionarioDTO.setId(funcionario.getId());
				funcionarioDTO.setNome(funcionario.getNome());
				funcionarioDTO.setCargo(funcionario.getCargo());
				funcionarioDTOs.add(funcionarioDTO);
			}
			dto.setFuncionarios(funcionarioDTOs);
			departamentoDTOs.add(dto);
		}
		return departamentoDTOs;
	}
	
	
	
	
	
	
	
	
	
	
	
}
