/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idadeemdias;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class IdadeEmDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade, dias;
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        dias = idade * 365;
        System.out.println("Você viveu " + dias + " dias");
        
        sc.close();
    }

}
