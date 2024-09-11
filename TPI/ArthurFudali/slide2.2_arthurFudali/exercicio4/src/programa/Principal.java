package programa;

import entities.Loja;

public class Principal {

	public static void main(String[] args) {
		Loja l = new Loja();
		l.inserirDadosLoja();
		l.calcularCompraLoja();
		System.out.println(l.mostrarDadosLoja() + "\nValor total: R$" + l.calcularCompraLoja());
		
	}

}
