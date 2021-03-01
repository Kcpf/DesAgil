package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.Map;

public class Contador {

	public Map<Character, Integer> calcula(String palavra) {
		Map<Character, Integer> d = new HashMap<>();

		for (int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i);
			if (!d.containsKey(letra)) d.put(letra, (int) palavra.chars().filter(ch -> ch ==letra).count());
		}

		return d;
	}

}
