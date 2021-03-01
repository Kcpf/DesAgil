package br.edu.insper.desagil.aula3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tabulacao {

	public Map<String, Double> monta(List<Map<String, String>> alunos) {
		Map<String, Double> totais = new HashMap<>();
		int totalPessoas = 0;

		for (Map<String, String> aluno: alunos) {
			String curso = aluno.get("curso");
			
			if (!totais.containsKey(curso)) totais.put(curso, (double) 0);
			
			totais.put(curso, (double) totais.get(curso) + 1);
			totalPessoas++;
		}
		
		for (String cursoDic: totais.keySet()) {
			
			totais.put(cursoDic, (double) totais.get(cursoDic)*100/totalPessoas);
		}

		return totais;
	}

}
