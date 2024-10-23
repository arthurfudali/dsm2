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

    private Integer codigo;
    private String nome;
    private String telefone;
    private String login;
    private String senha;
    Conexao con = new Conexao();

    public Usuario() {
    }

    public Usuario(Integer codigo, String nome, String telefone, String login, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.login = login;
        this.senha = senha;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public void cadastrarUsuario() {
        String sql = "Insert into usuario(Codigo,Nome,Telefone,Login,Senha)values "
                + "(" + this.getCodigo()+ ", '" + this.getNome() + "','" + this.getTelefone() + "','" + this.getLogin() + "','" + this.getSenha() + "' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }

    public ResultSet consultar() {
        ResultSet tabela;
        tabela = null;

        String sql = "Select * from usuario";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }

    public void excluir() {
        String sql;
        sql = "Delete from usuario where codigo=" + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }

    public void alterar() {
        String sql;
        sql = "Update usuario set nome='" + getNome() + "',telefone='" + getTelefone() + "' where codigo=" + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }

     public ResultSet consultarCampoEspecifico(){
        ResultSet tabela;
        tabela = null;
    
        try{
          String sql="Select * from usuario where nome like '"+ getNome()+"%'";
          tabela= con.RetornarResultset(sql);                  
       
           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }
     

//método para login
    public ResultSet logar()
      {
          ResultSet tabela;
          tabela = null;

           String sql = "select * from usuario where login= '" + getLogin() + "' and senha= '" + getSenha() + "' " ;
            tabela= con.RetornarResultset(sql);  
            return tabela;
      }   




}
