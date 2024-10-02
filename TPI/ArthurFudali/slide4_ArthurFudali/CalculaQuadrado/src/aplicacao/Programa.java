package aplicacao;

import javax.swing.JOptionPane;

import entidades.Quadrado;

public class Programa {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Quadrado quad = new Quadrado();
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha uma opção: \n 1 - Calcular area do quadrado \n 2 - Calcular perimetro do quadrado \n 3 - Mostrar valores \n 0 - sair"));
            // switch para condicoes:
            switch (op) {
                case 1:
                    quad.calcularArea(
                            Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para o lado do quadrado: ")));
                    break;
                case 2:
                    quad.calcularPerimetro(
                            Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para o lado do quadrado: ")));
                    break;
                case 3:

                    quad.mostrarValores();
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
