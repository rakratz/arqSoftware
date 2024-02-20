package com.empresa.controller.view;

import java.util.List;

import com.empresa.dto.DepartamentoDTO;
import com.empresa.dto.FuncionarioDTO;

public class DepartamentoView {
	public void displayDepartamentos(List<DepartamentoDTO> departamentos) {
		for (DepartamentoDTO departamento : departamentos) {
			System.out.println("Departamento: " + departamento.getNome());
			System.out.println("Funcionários:");
			for (FuncionarioDTO funcionario : departamento.getFuncionarios()) {
				System.out.println("  - Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo());
			}
			System.out.println();
		}
	}
}
