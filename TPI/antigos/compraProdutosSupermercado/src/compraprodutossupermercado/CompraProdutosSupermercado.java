/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compraprodutossupermercado;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CompraProdutosSupermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double qtdMax, qtdEstoque, qtdCompra;
        System.out.println("Digite o nome do produto: ");
        nome = sc.next();
        System.out.println("Digite a quantidade em estoque de " + nome);
        qtdEstoque = sc.nextDouble();
        System.out.println("Digite a quantidade maxima desse produto: ");
        qtdMax = sc.nextDouble();
        qtdCompra = qtdMax - qtdEstoque;
        System.out.println("A quantidade a ser comprada de " + nome + " é: " + qtdCompra);
        sc.close();
    }

}
