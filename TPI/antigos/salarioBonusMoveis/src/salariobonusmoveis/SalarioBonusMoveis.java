/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salariobonusmoveis;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class SalarioBonusMoveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de moveis vendidos: ");
        int nMoveis = sc.nextInt();
        double salario = 1000 + (nMoveis * 50);
        System.out.println("O salario é: " + salario);

        sc.close();
    }

}
