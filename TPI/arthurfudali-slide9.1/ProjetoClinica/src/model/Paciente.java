/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class Paciente {
    private Integer codigo;
    private String nome;
    private String endereco;
    private String complemento;
    private String rg;
    private String cpf;
    private String dataNasc;
    
    private Conexao con = new Conexao();
    
    public Paciente(){}

    public Paciente(Integer codigo, String nome, String endereco, String complemento, String rg, String cpf, String dataNasc) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.complemento = complemento;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public Conexao getCon() {
        return con;
    }

    public void setCon(Conexao con) {
        this.con = con;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void cadastrarPaciente(){
        String sql = "Insert into paciente(codigoPaciente, nomePaciente, endereco, complemento, rg, cpf, dataNacs) values"
                + "(" + this.getCodigo() + ", '" + this.getNome() + ", '" + this.getEndereco() + ", '" + this.getComplemento() + ", '" + this.getRg() + ", '" + this.getCpf() + ", '" + this.getDataNasc()+ "' )";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }
    
    public ResultSet consultarPaciente(){
        ResultSet tabela;
        tabela = null;

        String sql = "Select * from pacientes";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void excluir() {
        String sql;
        sql = "Delete from pacientes where codigo=" + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    public void alterar() {
        String sql;
        sql = "Update pacientes set nomePaciente='" + getNome()+ "',endereco='" + getEndereco()+  "',complemento='" + getComplemento()+  "',rg='" + getRg()+  "',cpf='" + getCpf()+  "',dataNacs='" + getDataNasc()+ "' where codigo=" + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }
    public ResultSet consultarCampoEspecifico(){
        ResultSet tabela;
        tabela = null;
    
        try{
          String sql="Select * from pacientes where nomePaciente like '"+ getNome()+"%'";
          tabela= con.RetornarResultset(sql);                  
       
           }
           catch(Exception sqle){
                JOptionPane.showMessageDialog(null,"Atenção..."+sqle.getMessage());
           }
        return tabela;    
    }
    
}
