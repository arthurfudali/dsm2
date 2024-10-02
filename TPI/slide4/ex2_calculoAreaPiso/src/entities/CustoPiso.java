package entities;

import javax.swing.JOptionPane;

public class CustoPiso {
	private Double comprimentoComodo;
	private Double larguraComodo;
	private Double precoPorArea;
	private Double custoTotalComodo;

	public CustoPiso() {
		this(0.0,0.0,0.0,0.0);
	}

	public CustoPiso(Double comprimentoComodo, Double larguraComodo, Double precoPorArea, Double custoTotalComodo) {

		this.comprimentoComodo = comprimentoComodo;
		this.larguraComodo = larguraComodo;
		this.precoPorArea = precoPorArea;
		this.custoTotalComodo = custoTotalComodo;
	}

	public Double getComprimentoComodo() {
		return comprimentoComodo;
	}

	public void setComprimentoComodo(Double comprimentoComodo) {
		this.comprimentoComodo = comprimentoComodo;
	}

	public Double getLarguraComodo() {
		return larguraComodo;
	}

	public void setLarguraComodo(Double larguraComodo) {
		this.larguraComodo = larguraComodo;
	}

	public Double getPrecoPorArea() {
		return precoPorArea;
	}

	public void setPrecoPorArea(Double precoPorArea) {
		this.precoPorArea = precoPorArea;
	}

	public Double getCustoTotalComodo() {
		return custoTotalComodo;
	}

	public void setCustoTotalComodo(Double custoTotalComodo) {
		this.custoTotalComodo = custoTotalComodo;
	}

	public void inserirValores() {
		setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do comodo: ")));
		setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do comodo: ")));
	}

	public void calcularPrecoArea() {
		setPrecoPorArea(Double.parseDouble(JOptionPane.showInputDialog("Digite o preco por area: ")));
		setCustoTotalComodo(getComprimentoComodo() * getLarguraComodo() * getPrecoPorArea());
		JOptionPane.showMessageDialog(null, "O valor da área é: R$" + getCustoTotalComodo());
	}

	public void mostrarValores() {
		JOptionPane.showMessageDialog(null,
				"Valor do comprimento: " + getComprimentoComodo() + "\nValor da largura: " + getLarguraComodo()
						+ "\n Valor do preco por area: " + getPrecoPorArea() + "\n Valor total: "
						+ "R$"+getCustoTotalComodo());
	}
}
