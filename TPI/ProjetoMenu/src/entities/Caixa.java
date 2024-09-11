package entities;

import javax.swing.JOptionPane;

public class Caixa {

	private Double saldo;
	private Double valor;

	public Caixa() {
		this(0.0,0.0);
	}

	public Caixa(Double saldo, Double valor) {

		this.saldo = saldo;
		this.valor = valor;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void depositar() {
		setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito!"))); // usa o input dialog
																									// para ler um valor
																									// e converte para
																									// double
		// usando casting

		setSaldo(getSaldo() + getValor()); // atualiza o saldo
	}

	public void sacar() {
		setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque!")));

		setSaldo(getSaldo() - getValor()); // atualiza o saldo
	}

	public double mostrarSaldo() {
		return getSaldo();
	}

}
