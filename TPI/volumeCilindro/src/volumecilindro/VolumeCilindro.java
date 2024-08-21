/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumecilindro;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class VolumeCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio do cilindro: ");
        double r = sc.nextDouble();
        System.out.println("Digite o valor da altura do cilindro: ");
        double h = sc.nextDouble();
        double vol = (Math.PI*(r*r)*h);
        System.out.println("O volume do cilindro é: " + vol);
        
        
        sc.close();
    }
    
}
