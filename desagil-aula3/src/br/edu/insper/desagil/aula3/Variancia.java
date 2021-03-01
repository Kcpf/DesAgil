package br.edu.insper.desagil.aula3;

import java.util.List;

public class Variancia {

	public double calcula(List<Integer> numeros) {
		double average = numeros.stream().mapToInt(val -> val).average().orElse(0.0);
		
		double variancia = 0;
		
		for (int number : numeros) {
			variancia += Math.pow((number-average), 2);
		}
		
		return variancia/numeros.size();
	}

}
