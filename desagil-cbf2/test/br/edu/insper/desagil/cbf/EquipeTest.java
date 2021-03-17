package br.edu.insper.desagil.cbf;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class EquipeTest {
	
	@Test
	public void adicionaUmJogador() {
		Equipe equipe = new Equipe("Paris Saint German");
		Jogador jogador = new Jogador("Neymar", 70, 97, 98);
		equipe.adicionaJogador(jogador);
		
		assertEquals(equipe.getNumJogadores(), 1);
		assertEquals(equipe.getJogador(0).getNome(), "Neymar");
	}
	
	@Test
	public void adicionaDoisJogadores() {
		Equipe equipe = new Equipe("Paris Saint German");
		Jogador jogador = new Jogador("Neymar", 70, 97, 98);
		Jogador jogador2 = new Jogador("Mbappe", 80, 98, 99);
		equipe.adicionaJogador(jogador);
		equipe.adicionaJogador(jogador2);
		
		assertEquals(equipe.getNumJogadores(), 2);
		assertEquals(equipe.getJogador(0).getNome(), "Neymar");
		assertEquals(equipe.getJogador(1).getNome(), "Mbappe");
	}
}
