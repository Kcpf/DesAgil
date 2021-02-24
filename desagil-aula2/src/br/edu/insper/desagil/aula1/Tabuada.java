package br.edu.insper.desagil.aula1;

public class Tabuada {

	public String constroi(int n) {
		String resultado = "";
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				resultado += Integer.toString(i*j);
				resultado += " ";
			}
			resultado += "\n";
		}
		return resultado;
	}

}
