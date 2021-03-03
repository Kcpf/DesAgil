package br.edu.insper.desagil.aula4;

public class Decimal {

	public double converte(String codigo) {
		char hA = codigo.charAt(0);
		int dA = switchNumbers(hA);

		char hB = codigo.charAt(1);
		int dB = switchNumbers(hB);

		return 10 * dA + dB;
	}

	public int switchNumbers(char hA) {
		int dA;
		switch (hA) {
		case '9':
			dA = 9;
			break;
		case '8':
			dA = 8;
			break;
		case '7':
			dA = 7;
			break;
		case '6':
			dA = 6;
			break;
		case '5':
			dA = 5;
			break;
		case '4':
			dA = 4;
			break;
		case '3':
			dA = 3;
			break;
		case '2':
			dA = 2;
			break;
		case '1':
			dA = 1;
			break;
		default:
			dA = 0;
			break;
		}
		return dA;
	}

}
