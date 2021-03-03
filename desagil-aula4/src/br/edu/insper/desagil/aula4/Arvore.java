package br.edu.insper.desagil.aula4;

public class Arvore {

	public String constroi(int n) {
		String arvore = "";
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 -i; j++) {
				arvore += " ";
			}
			for (int j = 0; j < i; j++) {
				arvore += "/";
			}
			
			arvore += "|";
			
			for (int j = 0; j < i; j++) {
				arvore += "\\";
			}
			
			arvore += "\n";
		}

		return arvore;
	}

}
