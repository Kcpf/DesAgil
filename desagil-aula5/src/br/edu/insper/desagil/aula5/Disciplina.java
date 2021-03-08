package br.edu.insper.desagil.aula5;

import java.util.List;

public class Disciplina {
	
	private String codigo;
	private String nome;
	private List<String> ementa;
	
	public Disciplina(String codigo, String nome, List<String> ementa) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.ementa = ementa;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getEmenta() {
		return ementa;
	}

	public void setEmenta(List<String> ementa) {
		this.ementa = ementa;
	}
	

}
