package model;

import control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Cliente {
    private Integer codigo;
    private String nome;
    private String telefone;
    private String email;
    
    Conexao con = new Conexao();
    
    public Cliente() {
        this(0,"","","");
    }
    public Cliente(Integer codigo, String nome, String telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void cadastrar(){
        String sql = "INSERT INTO Cliente(codigo, nome, telefone, email) VALUES"+
                "(" + getCodigo() + ", '" + getNome() + "', '" + getTelefone() + "', '" + getEmail() + "') ";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro salvo com sucesso");
    }
    public ResultSet consultar(){
        ResultSet tabela = null;
        String sql = "select * from Cliente";
        tabela = con.RetornarResultset(sql);
        
            return tabela;
    }
}
