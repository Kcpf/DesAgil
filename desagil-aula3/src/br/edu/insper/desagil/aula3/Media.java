package br.edu.insper.desagil.aula3;

import java.util.List;
import java.util.Map;

public class Media {

	public double calcula(List<Map<String, Integer>> notas) {
		double somaPesos = 0;
		double somaValores = 0;
		for (Map<String, Integer> nota : notas) {
			somaValores += nota.get("peso")*nota.get("valor");
			somaPesos += nota.get("peso");
		}
		return (double) somaValores/somaPesos;
	}

}
