/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valortotalcompraprodutos;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class ValorTotalCompraProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n1, n2, n3;
        double v1, v2, v3, q1, q2, q3;
        System.out.println("Digite o nome do primeiro produto: ");
        n1 = sc.next();
        System.out.println("Digite o valor do primeiro produto: ");
        v1 = sc.nextDouble();
        System.out.println("Digite a quantidade do primeiro produto: ");
        q1 = sc.nextDouble();
        
        System.out.println("Digite o nome do segundo produto: ");
        n2 = sc.next();
        System.out.println("Digite o valor do segundo produto: ");
        v2 = sc.nextDouble();
        System.out.println("Digite a quantidade do segundo produto: ");
        q2 = sc.nextDouble();
        
        System.out.println("Digite o nome do terceiro produto: ");
        n3 = sc.next();
        System.out.println("Digite o valor do terceiro produto: ");
        v3 = sc.nextDouble();
        System.out.println("Digite a quantidade do terceiro produto: ");
        q3 = sc.nextDouble();
        
        double vt1, vt2, vt3, total;
        vt1 = q1*v1;
        vt2 = q2*v2;
        vt3 = q3*v3;
        total = vt1+vt2+vt3;
        
        System.out.println("Valor do produto " + n1);
        System.out.println(vt1);
        System.out.println("Valor do produto " + n2);
        System.out.println(vt2);
        System.out.println("Valor do produto " + n3);
        System.out.println(vt3);
        System.out.println("Valor total geral: ");
        System.out.println(total);
        sc.close();
    }
    
}
