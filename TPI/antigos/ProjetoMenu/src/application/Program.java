package application;

import javax.swing.JOptionPane;

import entities.Caixa;

public class Program {

	public static void main(String[] args) {

		// instanciar o objeto
		Caixa cx = new Caixa();
		int opcao;
		do {
			// entrada de dados usando JOptionPane
			opcao = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha uma opção: \n 1 - Depositar \n 2 - Sacar \n 3 - Consultar saldo \n 0 - sair"));
			// switch para condicoes:
			switch (opcao) {
			case 1:
				cx.depositar();
				break;
			case 2: 
				cx.sacar();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Saldo atual: " + cx.mostrarSaldo());
				break;
			case 0: 
				JOptionPane.showMessageDialog(null, "Encerrando as atividades...");
				break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida");
				break;
			}
			

		} while (opcao != 0);

	}

}
