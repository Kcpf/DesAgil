package br.edu.insper.desagil.cbf;

import java.util.ArrayList;
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

	public int getNumJogadores() {
		return jogadores.size();
	}
	
	public Jogador getJogador(int posicao) {
		return jogadores.get(posicao);
	}

	public void adicionaJogador(Jogador jogador) {
		this.jogadores.add(jogador);
	}
}
