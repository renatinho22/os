package br.com.trabalho.os.teste;

import br.com.trabalho.os.pessoa.controller.PessoaController;
import br.com.trabalho.os.pessoa.model.PessoaPo;

public class TesteBackendPessoa {

	public static void main(String[] args) {
		
		PessoaPo pessoa = new PessoaPo();
		PessoaController controller = new PessoaController();
		
		pessoa.setNome("Gabriel Mendes");
		pessoa.setDocumento("42286248800");
		pessoa.setRg("425041414");
		
		try {
			controller.salvar(pessoa);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
