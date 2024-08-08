/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valorpagogas;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class ValorPagoGas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      double numL, valorPg;
        System.out.println("Digite a quantidade abastecida em litros: ");
        numL = sc.nextDouble();
        valorPg = numL*5.89;
        System.out.println("O valor a ser pago é: R$" + valorPg);
      
      sc.close();
    }
    
}
