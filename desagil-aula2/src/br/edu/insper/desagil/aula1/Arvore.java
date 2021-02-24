package br.edu.insper.desagil.aula1;

public class Arvore {

	public String constroi(int n) {
		
		if (n == 1) return "|\n";
		
		String resultado = "";
		resultado += " ".repeat(n-1);
		resultado += "|";
		resultado += "\n";
		for (int i = 1; i < n; i++) {
			resultado += " ".repeat(n-i-1);
			resultado += "/".repeat(i);
			resultado += "|";
			resultado += "\\".repeat(i);
			resultado += "\n";
			
		}
		return resultado;
	}

}
