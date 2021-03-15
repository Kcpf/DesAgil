package br.edu.insper.desagil.cbf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipe {
	private String nome;
	private List<Jogador> jogadores;

	public Equipe(String nome) {
		this.nome = nome;
		this.jogadores = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Jogador> getJogadores() {
		return Collections.unmodifiableList(this.jogadores);
	}

	public void adicionaJogador(Jogador jogador) {
		this.jogadores.add(jogador);
	}
}
