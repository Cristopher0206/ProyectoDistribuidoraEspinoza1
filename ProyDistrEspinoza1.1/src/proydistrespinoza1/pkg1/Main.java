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
        Empleado emp = new Empleado();
        int bandera = 0;
        System.out.println("Bienvenido al sistema de gestión de empleados de la Distribuidora Espinoza");
        while (bandera == 0) {
            System.out.println("Seleccione una opción");
            System.out.println("1. Registro de empleados");
            System.out.println("2. Rotación de empleados");
            System.out.println("3. Salir\n");

            Scanner entrada = new Scanner(System.in);
            int iEntrada = Integer.parseInt(entrada.nextLine());

            switch (iEntrada) {
                case 1:
                    gestor.iniciarRegistroEmpleados(emp);
                    break;
                case 2:

                    break;
                case 3:
                    bandera = 1;
                    break;
            }

        }
    }

}
