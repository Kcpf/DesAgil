package br.edu.insper.desagil.blackbeard.model.base;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.insper.desagil.blackbeard.model.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelTest {
	
	private Model model;
	
	@BeforeEach
	public void setUp() {
		model = new Model();
	}
	
	@Test
	public void testNaoAdicionaAluno() {
		assertEquals(model.getAluno(1), null);
	}
	
	@Test
	public void testAdicionaUmAluno() {
		model.adicionaAluno(1, "João");
		assertEquals(model.getAluno(1).getNome(), "João");
	}
	
	@Test
	public void testNaoAdicionaDisciplina() {
		assertEquals(model.getDisciplina("DESSOFT"), null);
	}
	
	@Test
	public void testAdicionaUmaDisciplina() {
		model.adicionaDisciplina("DESSOFT", "Design de Software");
		assertEquals(model.getDisciplina("DESSOFT").getNome(), "Design de Software");
	}
}
