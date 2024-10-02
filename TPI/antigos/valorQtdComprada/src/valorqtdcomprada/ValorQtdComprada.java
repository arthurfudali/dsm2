/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valorqtdcomprada;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class ValorQtdComprada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int qtdCom;
        double valorUn, total;
        System.out.println("Digite o nome do produto: ");
        nome = sc.next();
        System.out.println("Digite o valor unitario: ");
        valorUn = sc.nextDouble();
        System.out.println("Digite a quantidade comprada: ");
        qtdCom = sc.nextInt();
        total = qtdCom*valorUn;
        System.out.println("O preco a ser pago pelo produto " + nome + " é: R$" + total);
        
        
        sc.close();
    }
    
}
