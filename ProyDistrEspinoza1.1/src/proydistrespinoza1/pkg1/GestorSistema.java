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
    protected String sucursal;

    // Constructor
    public GestorSistema() {
    }

    // Método para iniciar el sistema
    public void iniciarSistema() {
        while (bandera == 0) {
            System.out.println("Seleccione una opción");
            System.out.println("1. Registro de empleados");
            System.out.println("2. Eliminación de empleados");
            System.out.println("3. Rotación de empleados");
            System.out.println("4. Consulta de empleados");
            System.out.println("5. Salir\n");

            Scanner entrada = new Scanner(System.in);
            int iEntrada = Integer.parseInt(entrada.nextLine());

            switch (iEntrada) {
                case 1:
                    iniciarRegistroEmpleados();
                    break;
                case 2:
                    iniciarEliminarEmpleados();
                    break;
                case 3:
                    //iniciarRotacionEmpleados();
                    break;
                case 4:
                    //iniciarConsultaEmpleados();
                    break;
                case 5:
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
            // verificar apellido
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

    /*public void iniciarConsultaEmpleados() {
        boolean flag2 = true;
        while (flag2) {
            System.out.println("Seleccione el número de sucursal que desea consultar");
            System.out.println("1. Sucursal 1");
            System.out.println("2. Sucursal 2");
            System.out.println("3. Sucursal 3");
            System.out.println("4. Sucursal 4");
            System.out.println("5. SALIR");
            Scanner entradaSucursal = new Scanner(System.in);
            sucursal = String.valueOf(entradaSucursal.nextLine());
            switch (sucursal) {
                case "1":
                    if (!Sucursal1.estaVacio()) {
                        System.out.println(Sucursal1.mostrarEstructura(lista));
                    } else {
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
                        System.out.println(Sucursal1.mostrarEstructura(lista));
                    }
                    break;
                case "2":
                    if (!Sucursal2.estaVacio()) {
                        System.out.println(Sucursal2.mostrarEstructura(lista));
                    } else {
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
                        System.out.println(Sucursal2.mostrarEstructura(lista));
                    }
                    break;
                case "3":
                    if (!Sucursal3.estaVacio()) {
                        System.out.println(Sucursal3.mostrarEstructura(lista));
                    } else {
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
                        System.out.println(Sucursal3.mostrarEstructura(lista));
                    }
                    break;
                case "4":
                    if (!Sucursal4.estaVacio()) {
                        System.out.println(Sucursal4.mostrarEstructura(lista));
                    } else {
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
                        System.out.println(Sucursal4.mostrarEstructura(lista));
                    }
                    break;
                case "5":
                    flag2 = false;
                    break;
                default:
                    flag2 = false;
                    break;
            }
        }

    }*/
    
    public void iniciarEliminarEmpleados(){
        
    }

    public void inicializarArchivos() {
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
