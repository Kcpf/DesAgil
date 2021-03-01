package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Histograma {

	public List<Integer> calcula(List<Integer> numeros) {
		List<Integer> l = new ArrayList<>();

		for (int i = 0; i <= 9; i++) {
			l.add(Collections.frequency(numeros, i));
		}

		return l;
	}

}
