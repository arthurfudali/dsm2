package valorpacelaatraso;
import java.util.Scanner;
public class ValorPacelaAtraso {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorPrestacao, taxa, valorAtraso;
        int tempo;
        System.out.println("Digite o valor da parcela: ");
        valorPrestacao = sc.nextDouble();
        System.out.println("Digite o valor da taxa: ");
        taxa = sc.nextDouble();
        System.out.println("Digite o tempo de atraso: ");
        tempo = sc.nextInt();
        valorAtraso = valorPrestacao + (valorPrestacao * (taxa / 100) * tempo);
        System.out.println("O valor a ser pago é: " + valorAtraso); 
        sc.close();
    }
}
