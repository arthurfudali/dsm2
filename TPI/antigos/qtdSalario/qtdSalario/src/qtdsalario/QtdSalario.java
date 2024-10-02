/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qtdsalario;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class QtdSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salM,salF, qtdSal;
        System.out.println("Digite o valor do salario minimo: ");
        salM = sc.nextDouble();
        System.out.println("Digite o valor do salario do funcionario: ");
        salF = sc.nextDouble();
        qtdSal = salF/salM;
        System.out.println("A quantidade de salários que esse funcionario ganha é de : " + qtdSal);
        
        sc.close();
    }
    
}
