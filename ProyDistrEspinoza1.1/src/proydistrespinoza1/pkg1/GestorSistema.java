/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proydistrespinoza1.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Cris
 */
public class GestorSistema {

    //protected GestorSistema gestor = new GestorSistema();
    ListaDEnlazada lista = new ListaDEnlazada();
    TablaHashEnlazadaEmpleados tabla = new TablaHashEnlazadaEmpleados();
    NodoEmpleadoLista nuevoNodo = new NodoEmpleadoLista();
    protected Empleado emp = new Empleado();
    protected int bandera = 0;
    protected Sucursal Sucursal1 = new Sucursal(1);
    protected Sucursal Sucursal2 = new Sucursal(2);
    protected Sucursal Sucursal3 = new Sucursal(3);
    protected Sucursal Sucursal4 = new Sucursal(4);



    // Constructor
    public GestorSistema() {
    }

    // Método para iniciar el sistema
    public void iniciarSistema() {
        while (bandera == 0) {
            
            //System.out.println(lista.mostrar());
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
                    iniciarRotacionEmpleados();
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
        tabla.inicializar(codigo, ultSucursal);
        
        lista.actualizaFichero();
    }
    
    /*public void mostrarEmpleadoRegistrado(){
        System.out.println(emp.toString());
    }*/
    
    public void iniciarRotacionEmpleados(){
        System.out.println("Lista de empleados antes de la rotación:");
        System.out.println(tabla.mostrarEstructura());
        TablaHashEnlazadaEmpleados tabla2 = new TablaHashEnlazadaEmpleados();

        Empleado empleadoAux = new Empleado();
        NodoEmpleadoLista actual = lista.getCabecera();
        int k = 0;
        while (k == 0) {
            if (actual.getAdelante() != null) {
                empleadoAux = actual.getInfo();
                if (empleadoAux.getCargo().equals("Vendedor")) {
                    String auxS = empleadoAux.getUltimaSucursal();
                    int auxN = Integer.parseInt(auxS);
                    auxN += 1;
                    auxN = auxN % 4;

                    tabla2.insertarEmpleadoTabla(empleadoAux.getCodigo(), String.valueOf(auxN));

                    empleadoAux.setUltimaSucursal(String.valueOf(auxN));
                    actual.setInfo(empleadoAux);
                }
                actual = actual.getAdelante();
            } else {
                empleadoAux = actual.getInfo();
                if (empleadoAux.getCargo().equals("Vendedor")) {
                    String auxS = empleadoAux.getUltimaSucursal();
                    int auxN = Integer.parseInt(auxS);
                    auxN += 1;
                    auxN = auxN % 4;

                    tabla2.insertarEmpleadoTabla(empleadoAux.getCodigo(), String.valueOf(auxN));

                    empleadoAux.setUltimaSucursal(String.valueOf(auxN));
                    actual.setInfo(empleadoAux);
                }
                actual = actual.getAdelante();
                k = 1;
            }

        }
        tabla = tabla2;
        // this.txaDespués.setText(tabla.mostrarEstructura());

        // Sobrescribir los archivos del código de los empleados
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0: // SUCURSAL 1
                    File archivo1 = null;
                    FileWriter fw1 = null;
                    PrintWriter pw1 = null;
                    try {
                        archivo1 = new File("codigosEmpleadosSucursal1.txt");
                        fw1 = new FileWriter(archivo1);
                        pw1 = new PrintWriter(fw1);
                        NodoEmpleado nodoActual = tabla2.getNodoEmpleado(0);
                        String nuevoCodigo;
                        int j = 0;
                        while (j == 0) {
                            if (nodoActual.enlace != null) {
                                nuevoCodigo = nodoActual.getCodigo();
                                pw1.println(nuevoCodigo);
                                nodoActual = nodoActual.enlace;
                            } else {
                                nuevoCodigo = nodoActual.getCodigo();
                                pw1.println(nuevoCodigo);
                                nodoActual = nodoActual.enlace;
                                j = 1;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (fw1 != null) {
                                fw1.close();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1: // SUCURSAL 2
                    File archivo2 = null;
                    FileWriter fw2 = null;
                    PrintWriter pw2 = null;
                    try {
                        archivo2 = new File("codigosEmpleadosSucursal2.txt");
                        fw2 = new FileWriter(archivo2);
                        pw2 = new PrintWriter(fw2);
                        NodoEmpleado nodoActual = tabla2.getNodoEmpleado(1);
                        String nuevoCodigo;
                        int j = 0;
                        while (j == 0) {
                            if (nodoActual.enlace != null) {
                                nuevoCodigo = nodoActual.getCodigo();
                                pw2.println(nuevoCodigo);
                                nodoActual = nodoActual.enlace;
                            } else {
                                nuevoCodigo = nodoActual.getCodigo();
                                pw2.println(nuevoCodigo);
                                nodoActual = nodoActual.enlace;
                                j = 1;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (fw2 != null) {
                                fw2.close();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2: // SUCURSAL 3
                    File archivo3 = null;
                    FileWriter fw3 = null;
                    PrintWriter pw3 = null;
                    try {
                        archivo3 = new File("codigosEmpleadosSucursal3.txt");
                        fw3 = new FileWriter(archivo3);
                        pw3 = new PrintWriter(fw3);
                        NodoEmpleado nodoActual = tabla2.getNodoEmpleado(2);
                        String nuevoCodigo;
                        int j = 0;
                        while (j == 0) {
                            if (nodoActual.enlace != null) {
                                nuevoCodigo = nodoActual.getCodigo();
                                pw3.println(nuevoCodigo);
                                nodoActual = nodoActual.enlace;
                            } else {
                                nuevoCodigo = nodoActual.getCodigo();
                                pw3.println(nuevoCodigo);
                                nodoActual = nodoActual.enlace;
                                j = 1;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (fw3 != null) {
                                fw3.close();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3: // SUCURSAL 4
                    File archivo4 = null;
                    FileWriter fw4 = null;
                    PrintWriter pw4 = null;
                    try {
                        archivo4 = new File("codigosEmpleadosSucursal4.txt");
                        fw4 = new FileWriter(archivo4);
                        pw4 = new PrintWriter(fw4);
                        NodoEmpleado nodoActual = tabla2.getNodoEmpleado(3);
                        String nuevoCodigo;
                        int j = 0;
                        while (j == 0) {
                            if (nodoActual.enlace != null) {
                                nuevoCodigo = nodoActual.getCodigo();
                                pw4.println(nuevoCodigo);
                                nodoActual = nodoActual.enlace;
                            } else {
                                nuevoCodigo = nodoActual.getCodigo();
                                pw4.println(nuevoCodigo);
                                nodoActual = nodoActual.enlace;
                                j = 1;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (fw4 != null) {
                                fw4.close();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                default:
                    JOptionPane.showInputDialog(null, "Algo salió mal xD");
            }

        }
        Sucursal1.vaciarArreglo();
        Sucursal2.vaciarArreglo();
        Sucursal3.vaciarArreglo();
        Sucursal4.vaciarArreglo();

        // Cambiar el archivo del registro de los empleados
        //lista.actualizaFichero();
        
        System.out.println("Lista de empleados después de la rotación:");
        System.out.println(tabla.mostrarEstructura());
    }
    
    public void inicializarArchivos(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("registroEmpleados2.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(linea, ",");
                String dato = tokens.nextToken();
                Empleado nuevoEmpleado = new Empleado();
                nuevoEmpleado.setCodigo(dato);
                dato = tokens.nextToken();
                nuevoEmpleado.setNombre(dato);
                dato = tokens.nextToken();
                nuevoEmpleado.setApellido(dato);
                dato = tokens.nextToken();
                nuevoEmpleado.setCargo(dato);
                dato = tokens.nextToken();
                nuevoEmpleado.setUltimaSucursal(dato);
                dato = tokens.nextToken();
                nuevoEmpleado.setDireccion(dato);
                dato = tokens.nextToken();
                nuevoEmpleado.setCorreo(dato);
                dato = tokens.nextToken();
                nuevoEmpleado.setNumTelf(dato);

                lista.insertarOrdenado(nuevoEmpleado);

                if (nuevoEmpleado.getCargo().equals("Vendedor")) {
                    tabla.inicializar(nuevoEmpleado.getCodigo(), nuevoEmpleado.getUltimaSucursal());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        // Llenar los arreglos de las sucursales

        // SUCURSAL 1
        File archivo1 = null;
        FileReader fr1 = null;
        BufferedReader br1 = null;
        try {
            archivo1 = new File("codigosEmpleadosSucursal1.txt");
            fr1 = new FileReader(archivo1);
            br1 = new BufferedReader(fr1);
            String codigo1;
            while ((codigo1 = br1.readLine()) != null) {
                Sucursal1.insertarCodigo(codigo1);
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            try {
                if (null != fr1) {
                    fr1.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // SUCURSAL 2
        File archivo2 = null;
        FileReader fr2 = null;
        BufferedReader br2 = null;
        try {
            archivo2 = new File("codigosEmpleadosSucursal2.txt");
            fr2 = new FileReader(archivo2);
            br2 = new BufferedReader(fr2);
            String codigo2;
            while ((codigo2 = br2.readLine()) != null) {
                Sucursal2.insertarCodigo(codigo2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            try {
                if (null != fr2) {
                    fr2.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // SUCURSAL 3
        File archivo3 = null;
        FileReader fr3 = null;
        BufferedReader br3 = null;
        try {
            archivo3 = new File("codigosEmpleadosSucursal3.txt");
            fr3 = new FileReader(archivo3);
            br3 = new BufferedReader(fr3);
            String codigo3;
            while ((codigo3 = br3.readLine()) != null) {
                Sucursal3.insertarCodigo(codigo3);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        } finally {
            try {
                if (null != fr3) {
                    fr3.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        // SUCURSAL 4
        File archivo4 = null;
        FileReader fr4 = null;
        BufferedReader br4 = null;
        try {
            archivo4 = new File("codigosEmpleadosSucursal4.txt");
            fr4 = new FileReader(archivo4);
            br4 = new BufferedReader(fr4);
            String codigo4;
            while ((codigo4 = br4.readLine()) != null) {
                Sucursal4.insertarCodigo(codigo4);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        } finally {
            try {
                if (null != fr4) {
                    fr4.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
}
