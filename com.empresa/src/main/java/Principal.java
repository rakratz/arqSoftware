import java.util.List;

import com.empresa.controller.DepartamentoController;
import com.empresa.controller.view.DepartamentoView;
import com.empresa.dto.DepartamentoDTO;
import com.empresa.model.Departamento;
import com.empresa.model.Funcionario;

public class Principal {

	public static void main(String[] args) {
		// Criando e populando o controlador de departamentos
		DepartamentoController departamentoController = new DepartamentoController();

		Departamento departamento1 = new Departamento(1, "TI", null);
		departamento1.addFuncionario(new Funcionario(1, "João", "Programador"));
		departamento1.addFuncionario(new Funcionario(2, "Maria", "Analista"));

		Departamento departamento2 = new Departamento(2, "RH", null);
		departamento2.addFuncionario(new Funcionario(3, "Pedro", "Recrutador"));
		departamento2.addFuncionario(new Funcionario(4, "Ana", "Gerente"));

		departamentoController.addDepartamento(departamento1);
		departamentoController.addDepartamento(departamento2);

		// Obtendo e exibindo departamentos e funcionários através dos DTOs
		List<DepartamentoDTO> departamentoDTOs = departamentoController.getAllDepartamentosDTO();
		DepartamentoView departamentoView = new DepartamentoView();
		departamentoView.displayDepartamentos(departamentoDTOs);
	}

}
