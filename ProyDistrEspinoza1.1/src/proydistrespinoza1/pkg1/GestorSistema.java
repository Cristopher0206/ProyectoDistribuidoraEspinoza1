/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proydistrespinoza1.pkg1;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Cris
 */
public class GestorSistema {

    //protected GestorSistema gestor = new GestorSistema();
    ListaDEnlazada lista = new ListaDEnlazada();
    //TablaHashEnlazadaEmpleados tabla = new TablaHashEnlazadaEmpleados();
    NodoEmpleadoLista nuevoNodo = new NodoEmpleadoLista();
    protected Empleado emp = new Empleado();
    protected int bandera = 0;

    // Constructor
    public GestorSistema() {
    }

    // Método para iniciar el sistema
    public void iniciarSistema() {
        while (bandera == 0) {
            System.out.println("Seleccione una opción");
            System.out.println("1. Registro de empleados");
            System.out.println("2. Rotación de empleados");
            System.out.println("3. Salir\n");

            Scanner entrada = new Scanner(System.in);
            int iEntrada = Integer.parseInt(entrada.nextLine());

            switch (iEntrada) {
                case 1:
                    iniciarRegistroEmpleados();
                    break;
                case 2:

                    break;
                default:
                    bandera = 1;
                    break;
            }

        }
    }

    // Método para iniciar la opción 1 del Sistema
    public void iniciarRegistroEmpleados() {
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
                    NodoEmpleadoLista nodoEmpleado = new NodoEmpleadoLista();
                    while (nodoEmpleado.adelante != null && codigo.equals(emp.getCodigo())) {
                        codigo = "VD";
                        codigo += "-";
                        codigo += emp.generarDigitos();
                        nodoEmpleado = nodoEmpleado.adelante;
                    }
                    flag = false;
                    break;
                case "b":
                    sCargo = "Contador";
                    codigo += "CT";
                    codigo += "-";
                    codigo += emp.generarDigitos();
                    while (nuevoNodo.adelante != null && codigo.equals(emp.getCodigo())) {
                        codigo = "CT";
                        codigo += "-";
                        codigo += emp.generarDigitos();
                        nuevoNodo = nuevoNodo.adelante;
                    }
                    flag = false;
                    break;
                case "c":
                    sCargo = "Encargado de Bodega";
                    codigo += "EB";
                    codigo += "-";
                    codigo += emp.generarDigitos();
                    while (nuevoNodo.adelante != null && codigo.equals(emp.getCodigo())) {
                        codigo = "EB";
                        codigo += "-";
                        codigo += emp.generarDigitos();
                        nuevoNodo = nuevoNodo.adelante;
                    }
                    flag = false;
                    break;
                default:
                    //System.out.println("Opcion no válida, vuelva a intentarlo");
                    break;
            }
        }
        flag = true;
        // Generar Última Sucursal
        ultSucursal = String.valueOf((int) (Math.random() * 3 + 1));
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

        emp.setCodigo(codigo);
        emp.setNombre(sNombre);
        emp.setApellido(sApellido);
        emp.setCargo(sCargo);
        emp.setUltimaSucursal(ultSucursal);
        emp.setDireccion(sDireccion);
        emp.setCorreo(sCorreo);
        emp.setNumTelf(sTelefono);
        
        //mostrarEmpleadoRegistrado();
        
        lista.insertarOrdenado(emp);
        //tabla.inicializar(codigo, ultSucursal);
        
        lista.actualizaFichero();
    }
    
    /*public void mostrarEmpleadoRegistrado(){
        System.out.println(emp.toString());
    }*/
    
    
    
}
