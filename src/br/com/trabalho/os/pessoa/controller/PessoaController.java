package br.com.trabalho.os.pessoa.controller;

import java.util.List;

import br.com.trabalho.os.pessoa.model.PessoaPo;
import br.com.trabalho.os.pessoa.model.PessoaService;

public class PessoaController {

	PessoaService service = new PessoaService();
	private PessoaPo pessoa;

	public void salvar(PessoaPo pessoa) throws Exception {
		service.salvar(pessoa);
	}
	
	public void alterar(PessoaPo pessoa) throws Exception {
		service.alterar(pessoa);
	}
	public void excluir(PessoaPo pessoa) throws Exception {
		service.excluir(pessoa);
	}
	public List<PessoaPo> filtrar() throws Exception {
		return service.filtrar();
    }
	public PessoaPo filtrarPorId(Long id) throws Exception {
		return service.filtrarPorId(id);
	}

	public PessoaPo getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaPo pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
