package calculo;

import java.util.Scanner;

public class OlimpiadaMatematica {
	private String nome;
	private String endereco;
	private Double media;
	private Double notaMenor;
	private Double notaMaior;
	Scanner sc = new Scanner(System.in);

	public OlimpiadaMatematica() {

	}

	public OlimpiadaMatematica(String nome, String endereco, Double media, Double notaMenor, Double notaMaior) {

		this.nome = nome;
		this.endereco = endereco;
		this.media = media;
		this.notaMenor = notaMenor;
		this.notaMaior = notaMaior;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public Double getNotaMenor() {
		return notaMenor;
	}

	public void setNotaMenor(Double notaMenor) {
		this.notaMenor = notaMenor;
	}

	public Double getNotaMaior() {
		return notaMaior;
	}

	public void setNotaMaior(Double notaMaior) {
		this.notaMaior = notaMaior;
	}

	public void calcularMedia() {
		System.out.print("Digite o nome do aluno: ");
		setNome(sc.next());
		System.out.print("Digite o endereco:");
		setEndereco(sc.next());
		System.out.print("Digite a menor nota: ");
		setNotaMenor(sc.nextDouble());
		System.out.print("Digite a maior nota: ");
		setNotaMaior(sc.nextDouble());
		setMedia((getNotaMaior() + getNotaMenor()) / 2);
	}

	public void verificarMedia() {
		if (getMedia() > 9) {
			System.out.println("Aluno inscrito! ");
			System.out.println("Dados: ");
			System.out.println("Nome: " + getNome());
			System.out.println("Endereco: " + getEndereco());
			System.out.println("Media: " + getMedia());
		} else {
			System.out.println("Media insuficiente! ");
		}
	}

}
