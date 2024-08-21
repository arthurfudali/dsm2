/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nelevadoquadrado;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class NElevadoQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero a ser elevado ao quadrado: ");
        int n = sc.nextInt();
        double quadrado = Math.pow(n, 2);
        System.out.println("O quadrado do numero é: " + quadrado);
        
        sc.close();
    }
    
}
