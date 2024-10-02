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
public class Produto {
    private Integer codigo;
    private String nomeProduto;
    private String descricao;
    Conexao con = new Conexao();

    public Produto() {
    }

    public Produto(Integer codigo, String nomeProduto, String descricao) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void cadastrarProduto(){
         String sql = "INSERT INTO Produtos(codigo, nomeProduto, descricao) VALUES"+
                "( " + 
                getCodigo()+ " , '" + getNomeProduto() + "', '" + getDescricao()+"') ";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro salvo com sucesso");
        
    }
    public ResultSet listarProduto(){
          ResultSet tabela = null;
        String sql = "select * from Produtos";
        tabela = con.RetornarResultset(sql);
            return tabela;
    }
}
