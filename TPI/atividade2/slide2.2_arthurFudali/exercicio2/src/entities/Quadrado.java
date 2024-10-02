package entities;

import java.util.Scanner;

public class Quadrado {
	private Double numero;
	private Double resultado;
	Scanner sc = new Scanner(System.in);

	public Quadrado() {
		this(0.0, 0.0);
	}

	public Quadrado(Double numero, Double resultado) {

		this.numero = numero;
		this.resultado = resultado;
	}
	
	public Double getNumero() {
		return numero;
	}

	public void setNumero(Double numero) {
		this.numero = numero;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public void calcularQuadrado() {
		System.out.print("Digite um valor para ser calculado seu quadrado: ");
		setNumero(sc.nextDouble());
		setResultado(getNumero()*getNumero());
	}
	public void mostrarQuadrado() {
		System.out.println("O valor do quadrado é: " + getResultado());
	}
}
