package br.com.trabalho.os.pessoa.model;

import java.util.List;

import br.com.trabalho.os.pessoa.dao.PessoaDao;

public class PessoaService {
	
	PessoaDao dao = new PessoaDao();
	
	public void salvar(PessoaPo pessoa) throws Exception {
		dao.salvar(pessoa);
	}
	
	public void alterar(PessoaPo pessoa) throws Exception {
		dao.alterar(pessoa);
	}
	public void excluir(PessoaPo pessoa) throws Exception {
		dao.excluir(pessoa);
	}
	public List<PessoaPo> filtrar() throws Exception {
		return dao.filtrar();
    }
	public PessoaPo filtrarPorId(Long id) throws Exception {
		return dao.filtrarPorId(id);
	}
}
