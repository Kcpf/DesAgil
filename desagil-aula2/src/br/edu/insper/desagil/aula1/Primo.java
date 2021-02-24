package br.edu.insper.desagil.aula1;

public class Primo {
	
	public boolean ehPrimo(int n) {
		if (n == 0 || n == 1) return false;
		
		for (int c = 2; c < n; c++) {
			if (c % 2 != 0 || c == 2) {
				if (n % c == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public int conta(int limite) {
		int num = 0;
		for (int c = 2; c <= limite; c++) {
			if (ehPrimo(c)) num += 1;
		}
		return num;
	}
}
