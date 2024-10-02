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
public class Venda {

    private Integer codigo;
    private String nomeVendedor;
    private String nomeProduto;
    Conexao con = new Conexao();

    public Venda() {
        this(0, "", "");
    }

    public Venda(Integer codigo, String nomeVendedor, String nomeProduto) {
        this.codigo = codigo;
        this.nomeVendedor = nomeVendedor;
        this.nomeProduto = nomeProduto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void cadastrarVenda() {
        String sql = "INSERT INTO vendas(codigo, nomeVendedor, nomeProduto) VALUES"
                + "( "
                + getCodigo() + " , '" + getNomeVendedor() + "', '" + getNomeProduto() + "') ";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro salvo com sucesso");

    }

    public ResultSet listarVenda() {
        ResultSet tabela = null;
        String sql = "select * from Vendas";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }

}
