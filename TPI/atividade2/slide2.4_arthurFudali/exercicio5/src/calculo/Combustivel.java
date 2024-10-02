package calculo;

import java.util.Scanner;

public class Combustivel {
	private Double litros;
	private Double totalGasto;
	private Double km;
	private Double valorComb;

	public Combustivel() {

	}

	public Combustivel(Double litros, Double totalGasto, Double km, Double valorComb) {

		this.litros = litros;
		this.totalGasto = totalGasto;
		this.km = km;
		this.valorComb = valorComb;
	}

	public Double getLitros() {
		return litros;
	}

	public void setLitros(Double litros) {
		this.litros = litros;
	}

	public Double getTotalGasto() {
		return totalGasto;
	}

	public void setTotalGasto(Double totalGasto) {
		this.totalGasto = totalGasto;
	}

	public Double getKm() {
		return km;
	}

	public void setKm(Double km) {
		this.km = km;
	}

	public Double getValorComb() {
		return valorComb;
	}

	public void setValorComb(Double valorComb) {
		this.valorComb = valorComb;
	}

	public void calcularLitros(double km) {
		this.setLitros(km / 12);
		System.out.println("A quantidade de litros usada foi: " + getLitros() + "L");
	}

	public double calcularTotalGasto(double valorComb) {
		this.setTotalGasto(this.getLitros() * valorComb);
		return getTotalGasto();
	}
}
