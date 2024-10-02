package entidades;

import javax.swing.JOptionPane;

public class Quadrado {
	private Double areaQuadrado;
	private Double perimetroQuadrado;

	public Quadrado() {

	}

	public Quadrado(Double areaQuadrado, Double perimetroQuadrado) {

		this.areaQuadrado = areaQuadrado;
		this.perimetroQuadrado = perimetroQuadrado;
	}

	public Double getAreaQuadrado() {
		return areaQuadrado;
	}

	public void setAreaQuadrado(Double areaQuadrado) {
		this.areaQuadrado = areaQuadrado;
	}

	public Double getPerimetroQuadrado() {
		return perimetroQuadrado;
	}

	public void setPerimetroQuadrado(Double perimetroQuadrado) {
		this.perimetroQuadrado = perimetroQuadrado;
	}

	public double calcularArea(double lado) {
		setAreaQuadrado(Math.pow(lado, 2));
		return getAreaQuadrado();
	}

	public double calcularPerimetro(double lado) {
		setPerimetroQuadrado(lado * 4);
		return getPerimetroQuadrado();
	}

	public void mostrarValores() {
		JOptionPane.showMessageDialog(null, "O valor da area do quadrado é: " + getAreaQuadrado()
				+ "\nO Valor do perímetro do quadrado é:" + getPerimetroQuadrado());
	}

}
