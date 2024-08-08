/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reajustesalario;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class ReajusteSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double sal, novoSal, percent;
        System.out.println("Digite o salario atual: ");
        sal = sc.nextDouble();
        System.out.println("Digite o valor do reajuste em % :");
        percent = sc.nextDouble();
        novoSal = sal+(sal*percent)/100;
        System.out.println("O salario reajustado é: " + novoSal);
        
        sc.close();
    }
    
}
