/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimretangulo;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class AreaPerimRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double lado1, lado2, perim, area;
        System.out.println("Digite o primeiro lado do retangulo: ");
        lado1 = sc.nextDouble();
        System.out.println("Digite o segundo lado do retangulo: ");
        lado2 = sc.nextDouble();
        perim = lado1*2 + lado2*2;
        area = lado1*lado2;
        System.out.println("A área do retangulo é: " + area + "ua e o perimetro é: " + perim);
        
        
        sc.close();
    }
    
}
