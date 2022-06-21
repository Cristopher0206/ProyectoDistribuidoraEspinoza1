/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proydistrespinoza1.pkg1;

import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestorSistema gestor = new GestorSistema();
        gestor.inicializarArchivos();
        System.out.println("Bienvenido al Sistema de Gestión de Empleados y Productos\n"
                + "de la Distribuidora Espinoza");
        gestor.iniciarSistema();
        

    }

}
