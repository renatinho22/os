package br.com.trabalho.os.funcionario.controller;

import java.util.List;

import br.com.trabalho.os.funcionario.model.FuncionarioPo;
import br.com.trabalho.os.funcionario.model.FuncionarioService;

public class FuncionarioController {


	FuncionarioService service = new FuncionarioService();
	private FuncionarioPo funcionario ;
	
	public void salvar(FuncionarioPo funcionario) throws Exception {
		service.salvar(funcionario);
	}
	
	public void alterar(FuncionarioPo funcionario) throws Exception {
		service.alterar(funcionario);
	}
	public void excluir(FuncionarioPo funcionario) throws Exception {
		service.excluir(funcionario);
	}
	public List<FuncionarioPo> filtrar() throws Exception {
		return service.filtrar();
    }
	public FuncionarioPo filtrarPorId(Long id) throws Exception {
		return service.filtrarPorId(id);
	}

	public FuncionarioPo getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioPo funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
	
	
}
