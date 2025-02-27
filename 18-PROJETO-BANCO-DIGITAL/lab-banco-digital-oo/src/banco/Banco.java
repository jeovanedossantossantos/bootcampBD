package banco;

import java.util.ArrayList;
import java.util.List;

import conta.Conta;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco() {
		this.contas = new ArrayList<>();
	}

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
