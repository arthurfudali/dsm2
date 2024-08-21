/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Usuario {

    private String nome;
    private String email;
    private Integer idade;
    private String endereco;

    public Usuario() {
    }

    public Usuario(String nome, String email, Integer idade, String endereco) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void guardarDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do usuario: ");
        setNome(sc.next());
        System.out.println("Digite o email: ");
        setEmail(sc.next());
        System.out.println("Digite a idade: ");
        setIdade(sc.nextInt());
        System.out.println("Digite o endereco: ");
        sc.nextLine();
        setEndereco(sc.nextLine());

    }

    public void mostrarDados() {
        System.out.println("\n Dados do user: \n");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Endereco: " + getEndereco());
    }

}
