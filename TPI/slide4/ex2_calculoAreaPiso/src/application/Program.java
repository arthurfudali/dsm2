package application;

import javax.swing.JOptionPane;

import entities.CustoPiso;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustoPiso piso = new CustoPiso();
		int op;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha uma opção: \n 1 - Inserir valores do comodo \n 2 - Calcular preco por área \n 3 - Mostrar valores \n 0 - sair"));
			// switch para condicoes:
			switch (op) {
			case 1:
				piso.inserirValores();
				break;
			case 2: 
				piso.calcularPrecoArea();
				break;
			case 3:
				piso.mostrarValores();
				break;
			case 0: 
				JOptionPane.showMessageDialog(null, "Encerrando as atividades...");
				break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida");
				break;
			}
		} while (op != 0);
	}

}
