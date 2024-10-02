/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        double n1, n2, media;
        String nome;
        
        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        System.out.println("Digite o nome do aluno: ");
        sc.nextLine();
        nome = sc.nextLine();
        media = (n1+n2)/2;
        
        
        System.out.println("A média do aluno " + nome + " é: " + conv.format(media));
        
        
        sc.close();
    }
    
}
