/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Usuario;

/**
 *
 * @author fatec-dsm2
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instanciar objeto USUARIO
        Usuario usuario = new Usuario();
        //chamar metodos
        usuario.guardarDados();
        usuario.mostrarDados();
        
    }
    
}
