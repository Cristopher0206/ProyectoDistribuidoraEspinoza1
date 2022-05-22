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
        Empleado emp = new Empleado();
        int bandera = 0;
        System.out.println("Bienvenido al sistema de gestión de empleados de la Distribuidora Espinoza");
        while (bandera == 0) {
            System.out.println("Seleccione una opción");
            System.out.println("1. Registro de empleados");
            System.out.println("2. Rotación de empleados");
            System.out.println("3. Salir\n");

            Scanner entrada = new Scanner(System.in);
            String sEntrada = entrada.nextLine();
            int iEntrada = Integer.parseInt(sEntrada);

            switch (iEntrada) {
                case 1:
                    String codigo = "", ultSucursal = "";
                    String sNombre = "", sApellido = "", sCargo = "";
                    String sDireccion = "", sCorreo = "", sTelefono = "";

                    // Registrar Nombre
                    boolean flag = true;
                    while (flag) {
                        System.out.print("Nombre del empleado: ");
                        Scanner entradaNombre = new Scanner(System.in);
                        sNombre = entradaNombre.nextLine();
                        // verificar nombre
                        if (emp.esNombreValido(sNombre)) {
                            flag = false;
                        } else {
                            System.out.println("Su nombre no puede contener números ni caracteres especiales");
                        }
                    }
                    flag = true;
                    // Registrar Apellido
                    while (flag) {
                        System.out.print("Apellido del empleado: ");
                        Scanner entradaApellido = new Scanner(System.in);
                        sApellido = entradaApellido.nextLine();
                        // verificar nombre
                        if (emp.esApellidoValido(sApellido)) {
                            flag = false;
                        } else {
                            System.out.println("Su apellido no puede contener números ni caracteres especiales");
                        }
                    }
                    flag = true;
                    // Seleccionar cargo / generar código
                    while (flag) {
                        System.out.println("Seleccione el cargo del empleado");
                        System.out.println("a. Vendedor");
                        System.out.println("b. Contador");
                        System.out.println("c. Encargado de Bodega");
                        Scanner entradaCargo = new Scanner(System.in);
                        sCargo = entradaCargo.nextLine();

                        switch (sCargo) {
                            case "a":
                                sCargo = "Vendedor";
                                codigo += "VD";
                                codigo += "-";
                                codigo += emp.generarDigitos();
                                flag = false;
                                break;
                            case "b":
                                sCargo = "Contador";
                                codigo += "CT";
                                codigo += "-";
                                codigo += emp.generarDigitos();
                                flag = false;
                                break;
                            case "c":
                                sCargo = "Encargado de Bodega";
                                codigo += "EB";
                                codigo += "-";
                                codigo += emp.generarDigitos();
                                flag = false;
                                break;
                            default:
                                //System.out.println("Opcion no válida, vuelva a intentarlo");
                                break;
                        }
                    }
                    flag = true;
                    // Generar Última Sucursal
                    int numRandom = (int) (Math.random() * 3 + 1);
                    ultSucursal = String.valueOf(numRandom);
                    // Registrar Dirección
                    while (flag) {
                        System.out.print("Dirección del empleado: ");
                        Scanner entradaDireccion = new Scanner(System.in);
                        sDireccion = entradaDireccion.nextLine();

                        if (emp.esDireccionValida(sDireccion)) {
                            flag = false;
                        } else {
                            System.out.println("Su direccion no puede contener caracteres especiales");
                        }
                    }
                    flag = true;
                    // Registrar Correo Electrónico
                    while (flag) {
                        System.out.print("Correo Electrónico del empleado: ");
                        Scanner entradaCorreo = new Scanner(System.in);
                        sCorreo = entradaCorreo.nextLine();
                        if (emp.esCorreoValido(sCorreo)) {
                            flag = false;
                        } else {
                            System.out.println("Correo inválido, vuelva a ingresarlo");
                        }
                    }
                    flag = true;
                    // Registrar Número de Teléfono
                    while (flag) {
                        System.out.print("Número de teléfono del empleado: ");
                        Scanner entradaTelefono = new Scanner(System.in);
                        sTelefono = entradaTelefono.nextLine();
                        if (emp.esTelefonoValido(sTelefono)) {
                            flag = false;
                        } else {
                            System.out.println("Número de teléfono inválido, vuelva a ingresarlo");
                        }
                    }
                    
                    System.out.println("\n");

                    Empleado newEmpl = new Empleado(codigo, sNombre, sApellido, sCargo, ultSucursal, sDireccion, sCorreo, sTelefono);
                    System.out.println(newEmpl.toString());
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
