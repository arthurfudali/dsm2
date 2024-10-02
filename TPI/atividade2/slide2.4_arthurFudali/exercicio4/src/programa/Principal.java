package programa;

import java.util.Scanner;

import calculo.Temperatura;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Temperatura temp = new Temperatura();
		System.out.println("Digite a temperatura em °C: ");
		temp.calcularTempFahrenheit(sc.nextDouble());
		System.out.println("Digite a temperatura em °F: ");
		temp.calcularTempCelcius(sc.nextDouble());

		sc.close();
	}

}
