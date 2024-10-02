package entities;

import java.util.Scanner;

public class Multiplicacao {
	
	private Integer valor;
	private Integer resultado;
	Scanner sc = new Scanner(System.in);
	
	public Multiplicacao() {
		this(0,0);
	}

	public Multiplicacao(Integer valor, Integer resultado) {
		this.valor = valor;
		this.resultado = resultado;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
	
	public void multiplicacao() {
		System.out.print("Digite um valor a ser multiplicado por 4: ");
		setValor(sc.nextInt());
		setResultado(getValor()*4);
	}
	public void mostrarMultiplicação() {
		System.out.println("O resultado da multiplicação é: " + getResultado());
	}
	
}
