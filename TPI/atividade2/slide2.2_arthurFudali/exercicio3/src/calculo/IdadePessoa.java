package calculo;

import java.time.LocalDate;
import java.util.Scanner;

public class IdadePessoa {
	private Integer ano;
	private Integer idade;
	Scanner sc = new Scanner(System.in);
	LocalDate dataAtual = LocalDate.now();
	private Integer anoAtual = dataAtual.getYear();

	public IdadePessoa() {
		this(0, 0);
	}

	public IdadePessoa(Integer ano, Integer idade) {
		this.ano = ano;
		this.idade = idade;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public void calcularIdade() {
		System.out.print("Digite o ano que voce nasceu: ");
		setAno(sc.nextInt());
		setIdade(anoAtual-getAno());
	}
	public void mostrarIdade() {
		System.out.println("A sua idade é: " + getIdade());
	}
}
