package entities;

import java.util.Scanner;

public class Loja {
	private String razaoSocial;
	private String cpfCliente;
	private Double valorCompra;
	private Double qtdItensComp;
	private Double valorTotalCompra;
	Scanner sc = new Scanner(System.in);

	public Loja() {
	}

	public Loja(String razaoSocial, String cpfCliente, Double valorCompra, Double qtdItensComp,
			Double valorTotalCompra) {
		this.razaoSocial = razaoSocial;
		this.cpfCliente = cpfCliente;
		this.valorCompra = valorCompra;
		this.qtdItensComp = qtdItensComp;
		this.valorTotalCompra = valorTotalCompra;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public Double getQtdItensComp() {
		return qtdItensComp;
	}

	public void setQtdItensComp(Double qtdItensComp) {
		this.qtdItensComp = qtdItensComp;
	}

	public Double getValorTotalCompra() {
		return valorTotalCompra;
	}

	public void setValorTotalCompra(Double valorTotalCompra) {
		this.valorTotalCompra = valorTotalCompra;
	}

	public void inserirDadosLoja() {
		System.out.print("Digite a razao social da loja: ");
		setRazaoSocial(sc.next());
		System.out.print("Digite o CPF do cliente: ");
		setCpfCliente(sc.next());
		System.out.print("Digite o valor do item comprado: ");
		setValorCompra(sc.nextDouble());
		System.out.print("Digite a quantidade de itens: ");
		setQtdItensComp(sc.nextDouble());
	}
	public double calcularCompraLoja() {
		setValorTotalCompra(getValorCompra()*getQtdItensComp());
		return getValorTotalCompra();
	}
	public String mostrarDadosLoja() {
		return "Razão Social: " + getRazaoSocial() +"\nCPF: " + getCpfCliente();
	}

}
