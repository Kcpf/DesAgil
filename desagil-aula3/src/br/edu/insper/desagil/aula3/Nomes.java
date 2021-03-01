package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Nomes {

	public Map<String, List<String>> inverte(Map<String, List<String>> d) {
		Map<String, List<String>> sobrenomeMap = new HashMap<>();

		for (String nome : d.keySet()) {
			List<String> sobrenomes = d.get(nome);
			for (String sobrenome : sobrenomes) {
				
				if (!sobrenomeMap.containsKey(sobrenome)) sobrenomeMap.put(sobrenome, new ArrayList<String>());
				sobrenomeMap.get(sobrenome).add(nome);
			}
			
			
		}
		System.out.println(sobrenomeMap);
		return sobrenomeMap;
	}

}
