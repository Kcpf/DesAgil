package br.edu.insper.desagil.aula4;

import java.util.ArrayList;
import java.util.List;

public class Cumulativo {

	public List<Integer> calcula(List<Integer> v) {
		List<Integer> c = new ArrayList<>();
		int total = 0;
		
		for (int number : v) {
			total += number;
			c.add(total);
		}

		return c;
	}

}
