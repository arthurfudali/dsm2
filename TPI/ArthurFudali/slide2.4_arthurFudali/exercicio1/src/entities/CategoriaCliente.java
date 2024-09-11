package entities;

import java.util.Scanner;

public class CategoriaCliente {
	private String nome;
	private Double numeroConta;
	private Double saldoMedio;
	Scanner sc = new Scanner(System.in);

	public CategoriaCliente() {
		this("", 0.0, 0.0);
	}

	public CategoriaCliente(String nome, Double numeroConta, Double saldoMedio) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.saldoMedio = saldoMedio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Double numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldoMedio() {
		return saldoMedio;
	}

	public void setSaldoMedio(Double saldoMedio) {
		this.saldoMedio = saldoMedio;
	}

	public void verificarSaldo() {
		System.out.print("Digite o nome: ");
		setNome(sc.next());
		System.out.print("Digite o numero da conta: ");
		setNumeroConta(sc.nextDouble());
		System.out.print("Digite o saldo medio: ");
		setSaldoMedio(sc.nextDouble());
		if (getSaldoMedio() < 1000) {
			System.out.println("Cliente comum.");
		} else if (getSaldoMedio() >= 1000 && getSaldoMedio() < 2500) {
			System.out.println("Cliente Prata.");
		} else if (getSaldoMedio() >= 2500) {
			System.out.println("Cliente Ouro.");
		} else {
			System.out.println("Valor invalido");
		}
	}

}
