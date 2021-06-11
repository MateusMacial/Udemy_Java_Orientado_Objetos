package teste;

import java.util.Locale;

public class test {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println(String.format("%.2f", CalculaHeron(80.0, 8.0, 0.1)));

	}

	public static double CalculaHeron(double n, double chute, double erro) {

		double resultado;

		resultado = 0.0;

		do {
			resultado = (chute + (n / chute)) / 2;
			chute = resultado;
		} while (((resultado * resultado) - n) > erro);

		return resultado;
	}
}