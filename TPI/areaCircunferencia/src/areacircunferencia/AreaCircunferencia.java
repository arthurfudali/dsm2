/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacircunferencia;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class AreaCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double r = sc.nextDouble();
        double area = (Math.PI*(r*r));
        System.out.println("Area da circunferencia: " + area);
        
        sc.close();
    }
    
}
