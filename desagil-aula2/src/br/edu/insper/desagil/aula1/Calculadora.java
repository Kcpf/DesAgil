package br.edu.insper.desagil.aula1;

public class Calculadora {

	public double executa(int a, int b, char op) {
		if (op == '+') {
			return (double) a + b;
		} 
		if (op == '-') {
			return (double) a - b;
		}
		if (op == '*') {
			return (double) a * b;
		}
		if (op == '/') {
			if (b == 0) return 0.0;
			return (double) a / b;
		}
		return 1.0;
	}

}
