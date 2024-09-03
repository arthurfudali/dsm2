/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import java.util.Scanner;



/**
 *
 * @author fatec-dsm2
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       public static void main(String[] args) {
       int n1, n2, n3, media1, n4, n5, n6, media2, soma;
      
       Scanner sc = new Scanner(System.in);
      
       System.out.print("Digite a primeira nota: ");
       n1 = sc.nextInt();     
       System.out.print("Digite a segunda nota: ");
       n2 = sc.nextInt();     
       System.out.print("Digite a terceira nota: ");
       n3 = sc.nextInt();
      
       media1 = (n1 + n2 + n3) /3;
       System.out.println("O resultado da primeira média é: " + media1);
      
      
       System.out.print("Digite a quarta nota: ");
       n4 = sc.nextInt();       
       System.out.print("Digite a quinta nota: ");
       n5 = sc.nextInt();       
       System.out.print("Digite a sexta nota: ");
       n6 = sc.nextInt();
      
       media2 = (n4 + n5 + n6) /3;     
       System.out.println("O resultado da segunda média é: " + media1);
      
       soma = media1 + media2;
       System.out.println("O resultado da soma das duas médias é: " + soma);
   }
  
}
 
        
  
