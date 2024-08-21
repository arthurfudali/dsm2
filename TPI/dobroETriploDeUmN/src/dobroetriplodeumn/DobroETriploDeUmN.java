/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobroetriplodeumn;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class DobroETriploDeUmN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = sc.nextInt();
        System.out.println("O dobro do primeiro número é: " + (n1*2));
        System.out.println("O triplo do segundo número é: " + (n2*3));
        sc.close();
    }
    
}
