package calculo;

public class Temperatura {
	private Double celcius;
	private Double fahrenheit;

	public Temperatura() {

	}

	public Temperatura(Double celcius, Double fahrenheit) {

		this.celcius = celcius;
		this.fahrenheit = fahrenheit;
	}

	public Double getCelcius() {
		return celcius;
	}

	public void setCelcius(Double celcius) {
		this.celcius = celcius;
	}

	public Double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(Double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}

	public void calcularTempCelcius(double f) {
		this.setCelcius((f - 32) * (5 / 9.0));
		System.out.println("O valor de " + f + "°F convertido para Celcius é: " + getCelcius()+ "°C");
	}

	public void calcularTempFahrenheit(double c) {
		this.setFahrenheit(c * 1.8 + 32);
		System.out.println("O valor de " + c + "°C convertido para Fahrenheit é: " + getFahrenheit()+"°F");
	}
}
