package br.com.trabalho.os.funcionario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.trabalho.os.pessoa.model.PessoaPo;

//@Entity
//@Table(name="funcionario")
public class FuncionarioPo extends PessoaPo {

//	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String setor;
	private String cargo;
	private String telefone;
	private String contato;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FuncionarioPo [id=");
		builder.append(id);
		builder.append(", setor=");
		builder.append(setor);
		builder.append(", cargo=");
		builder.append(cargo);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append(", contato=");
		builder.append(contato);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
