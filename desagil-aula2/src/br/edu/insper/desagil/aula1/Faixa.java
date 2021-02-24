package br.edu.insper.desagil.aula1;

public class Faixa {

	public String calcula(int idade) {
		if (idade < 18) {
			return "jovem";
		} else if (18 <= idade && idade < 60) {
			return "adulto";
		} else {
			return "idoso";
		}
	}

}
