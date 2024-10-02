package calculo;

import java.util.Scanner;

public class Prova {
	private String nome;
	private Double pontos;
	private String nivel;
	Scanner sc = new Scanner(System.in);

	public Prova() {

	}

	public Prova(String nome, Double pontos, String nivel) {

		this.nome = nome;
		this.pontos = pontos;
		this.nivel = nivel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPontos() {
		return pontos;
	}

	public void setPontos(Double pontos) {
		this.pontos = pontos;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public void nivelProva() {
		System.out.print("Digite o nome: ");
		setNome(sc.next());
		System.out.print("Digite a quantidade de pontos: ");
		setPontos(sc.nextDouble());
		if (getPontos() <= 100) {
			setNivel("Nível 1");
		} else if (getPontos() > 100 && getPontos() < 200) {
			setNivel("Nível 2");
		} else {
			setNivel("Nível 3");
		}
	}
	public void listarSituacao() {
		System.out.println("Resultados: ");
		System.out.println("Nome: " + getNome());
		System.out.println("Pontos: " + getPontos());
		System.out.println("Nível: " + getNivel());
	}
}
