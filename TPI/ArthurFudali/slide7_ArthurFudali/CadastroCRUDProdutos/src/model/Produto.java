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
public class Produto {

    private Integer codigo;
    private String nomeProduto;
    private String descricao;
    Conexao con = new Conexao();

    public Produto() {
        this(0, "", "");
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

    public void cadastrar() {
        String sql = "INSERT INTO Produto(codigo, nomeProduto, descricao) VALUES"
                + "(" + getCodigo() + ", '" + getNomeProduto() + "', '" + getDescricao() + "') ";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro salvo com sucesso");
    }

    public ResultSet consultar() {
        ResultSet tabela = null;
        String sql = "select * from Produto";
        tabela = con.RetornarResultset(sql);

        return tabela;
    }
      public void excluir() {
        String sql;
        sql = "Delete from produto where codigo=" + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }

    public void alterar() {
        String sql;
        sql = "Update produto set nomeProduto ='" + getNomeProduto()+ "',descricao='" + getDescricao()+ "' where codigo=" + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }
}
