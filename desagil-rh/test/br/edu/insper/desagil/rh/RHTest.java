package br.edu.insper.desagil.rh;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RHTest {
	
	@Test
	public void verificaMediaNenhum() {
		RH rh = new RH();
		
		assertEquals(rh.calculaMedia(), (double) 0, 0.00001);
		
	}
	
	@Test
	public void verificaMedia3Func() {
		
		RH rh = new RH();
		
		Funcionario func1 = new Funcionario(0, "Fernando", 3000);
		Funcionario func2 = new Funcionario(1, "Sampas", 3000);
		Funcionario func3 = new Funcionario(2, "Francisco", 3000);
		
		rh.contrata(func1);
		rh.contrata(func2);
		rh.contrata(func3);
		
		assertEquals(rh.calculaMedia(), (double) 3000, 0.00001);
	}
	
	@Test
	public void verificaMedia3Gerentes() {
		
		RH rh = new RH();
		
		Gerente func1 = new Gerente(0, "Fernando", 3000);
		Gerente func2 = new Gerente(1, "Sampas", 4000);
		Gerente func3 = new Gerente(2, "Francisco", 3500);
		
		rh.contrata(func1);
		rh.contrata(func2);
		rh.contrata(func3);
		
		assertEquals(rh.calculaMedia(), (double) 3500, 0.00001);
	}
	
	@Test
	public void verificaMedia3Diretores() {
		
		RH rh = new RH();
		
		DiretorDeMarketing func1 = new DiretorDeMarketing(0, "Fernando", 3000);
		DiretorDeVendas func2 = new DiretorDeVendas(1, "Sampas", 0);
		DiretorDeVendas func3 = new DiretorDeVendas(2, "Francisco", 3000); 
		
		rh.contrata(func1);
		rh.contrata(func2);
		rh.contrata(func3);
		
		assertEquals(rh.calculaMedia(), (double) 4000, 0.00001);
	}
	
	@Test
	public void verificaMediaMisto() {
		
		RH rh = new RH();
		
		Funcionario func1 = new Funcionario(0, "Fernando", 3000);
		Gerente func2 = new Gerente(1, "Sampas", 4000);
		DiretorDeMarketing func3 = new DiretorDeMarketing(2, "Francisco", 3500); 
		DiretorDeVendas func4 = new DiretorDeVendas(3, "Arthur", 0); 
		
		rh.contrata(func1);
		rh.contrata(func2);
		rh.contrata(func3);
		rh.contrata(func4);
		
		assertEquals(rh.calculaMedia(), (double) 3500, 0.00001);
	}
}
