package br.edu.insper.desagil.aula4;

public class Primo {

	public int conta(int limite) {
		int total = 0;

		int n = 2;
		while (n <= limite) {
			boolean temDivisor = ehPrimo(n);
			
			if (!temDivisor) {
				total += 1;
			}

			n++;
		}

		return total;
	}

	public boolean ehPrimo(int n) {
		int d = 2;
		while (d < n) {
			if (n % d == 0) {
				return true;
			}
			d++;
		}
		return false;
	}
}
