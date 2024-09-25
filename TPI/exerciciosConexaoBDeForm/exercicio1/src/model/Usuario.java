/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Usuario {
    Conexao con = new Conexao();
    
    private String nome;
    private String email;
    private String login;
    private String senha;

    public Usuario() {
    }

    public Usuario( String nome, String email, String login, String senha) {
        
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void cadastrarUsuario(){
        String sql = "INSERT INTO Usuario(nome, email, login, senha) VALUES"+
                "( '" + 
                getNome()+ "' , '" + getEmail() + "', '" + getLogin()+ "', '" + getSenha()+ "') ";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro salvo com sucesso");
    }
    public ResultSet listarUsuario(){
        ResultSet tabela = null;
        String sql = "select * from Usuario";
        tabela = con.RetornarResultset(sql);
            return tabela;
    }
}
