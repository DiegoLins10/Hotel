package Entities;

import java.util.ArrayList;

public class Hospede extends Pessoa {

	private long matricula;

	public Hospede(Pessoa pessoa, long matricula) {
		super(pessoa.nome, pessoa.cpf);
		this.matricula = matricula;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Hospede [matricula: " + matricula + ", Nome: " + nome + " CPF: "+ cpf + "]";
	}

	
	
	
	
}
