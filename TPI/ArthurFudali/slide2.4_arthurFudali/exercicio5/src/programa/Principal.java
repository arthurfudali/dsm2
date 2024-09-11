package programa;

import java.util.Scanner;

import calculo.Combustivel;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combustivel comb = new Combustivel();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de kms rodados: ");
		double km = sc.nextDouble();
		System.out.println("Digite o valor do litro do combustivel: ");
		double valor = sc.nextDouble();
		comb.calcularLitros(km);
		System.out.println("Valor total gasto: R$" + comb.calcularTotalGasto(valor));
		

		sc.close();
	}

}
