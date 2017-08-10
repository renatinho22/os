package br.com.trabalho.os.funcionario.model;

import java.util.List;

import br.com.trabalho.os.funcionario.dao.FuncionarioDao;

public class FuncionarioService {

	FuncionarioDao dao = new FuncionarioDao();
	
	public void salvar(FuncionarioPo funcionario) throws Exception {
		dao.salvar(funcionario);
	}
	
	public void alterar(FuncionarioPo funcionario) throws Exception {
		dao.alterar(funcionario);
	}
	public void excluir(FuncionarioPo funcionario) throws Exception {
		dao.excluir(funcionario);
	}
	public List<FuncionarioPo> filtrar() throws Exception {
		return dao.filtrar();
    }
	public FuncionarioPo filtrarPorId(Long id) throws Exception {
		return dao.filtrarPorId(id);
	}
	
}
