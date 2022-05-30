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
    ListaDEnlazada listaEmpleados = new ListaDEnlazada();
    ListaDEnlazada listaProductos = new ListaDEnlazada();
    TablaHashEnlazadaEmpleados tabla = new TablaHashEnlazadaEmpleados();
    NodoEmpleadoLista nuevoNodo = new NodoEmpleadoLista();
    protected Empleado emp = new Empleado();
    protected Producto prod = new Producto();
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
            //System.out.println("2. Eliminación de empleados");
            System.out.println("3. Registro de productos");
            System.out.println("4. Consulta de empleados");
            System.out.println("5. Salir\n");

            Scanner entrada = new Scanner(System.in);
            int iEntrada = Integer.parseInt(entrada.nextLine());

            switch (iEntrada) {
                case 1:
                    iniciarRegistroEmpleados();
                    break;
                case 2:
                    //iniciarEliminarEmpleados();
                    break;
                case 3:
                    //iniciarRotacionEmpleados();
                    iniciarRegistroProductos();
                    break;
                case 4:
                    iniciarConsultaEmpleados();
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
                    //NodoEmpleadoLista nodoEmpleado = new NodoEmpleadoLista();
                    while (nuevoNodo.adelante != null && codigo.equals(emp.getCodigo())) {
                        codigo = "VD";
                        codigo += "-";
                        codigo += emp.generarDigitos();
                        nuevoNodo = nuevoNodo.adelante;
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
        /*listaEmpleados.insertarOrdenado(emp);
        tabla.inicializar(codigo, ultSucursal);

        listaEmpleados.actualizaFichero();*/
        File fichero = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        String cadena = "";
        try {
            fichero = new File("registroEmpleados2.txt");
            fw = new FileWriter(fichero, true);
            pw = new PrintWriter(fw);
            cadena += emp.getCodigo() + ",";
            cadena += emp.getNombre() + ",";
            cadena += emp.getApellido() + ",";
            cadena += emp.getCargo() + ",";
            cadena += emp.getUltimaSucursal() + ",";
            cadena += emp.getDireccion() + ",";
            cadena += emp.getCorreo() + ",";
            cadena += emp.getNumTelf();
            String cadena2 = cadena;
            pw.println(cadena2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void iniciarRegistroProductos() {
        String sCodigo = "", sNombre = "";
        String sFecha = "", sPrecioUnit = "", sStock = "";
        String sProveedor = "", sMarca = "", sDescripcion = "";

        // Registrar Codigo
        boolean flag = true;
        while (flag) {
            System.out.print("Código del Producto: ");
            Scanner entradaCodigo = new Scanner(System.in);
            sCodigo = entradaCodigo.nextLine();
            // verificar nombre
            if (prod.esCodigoValido(sCodigo)) {
                flag = false;
            } else {
                System.out.println("Código inválido - Intente nuevamente");
            }
        }
        flag = true;
        // Registrar Nombre
        while (flag) {
            System.out.print("Nombre del producto: ");
            Scanner entradaNombre = new Scanner(System.in);
            sNombre = entradaNombre.nextLine();
            // verificar apellido
            if (prod.esNombreValido(sNombre)) {
                flag = false;
            } else {
                System.out.println("Nombre inválido - Intente nuevamente");
            }
        }
        flag = true;
        // Registrar Fecha
        while (flag) {
            System.out.print("Fecha de ingreso del producto: ");
            Scanner entradaFecha = new Scanner(System.in);
            sFecha = entradaFecha.nextLine();
            if (prod.esFechaValida(sFecha)) {
                flag = false;
            } else {
                System.out.println("Fecha inválida - Intente nuevamente");
            }
        }
        flag = true;
        // Registrar Precio Unitario
        while (flag) {
            System.out.print("Precio Unitario: ");
            Scanner entradaPrecioUnit = new Scanner(System.in);
            sPrecioUnit = entradaPrecioUnit.nextLine();
            if (prod.esPrecioValido(sPrecioUnit)) {
                flag = false;
            } else {
                System.out.println("Precio Unitario inválido - Intente nuevamente");
            }
        }
        flag = true;
        // Registrar Stock
        while (flag) {
            System.out.print("Stock: ");
            Scanner entradaStock = new Scanner(System.in);
            sStock = entradaStock.nextLine();
            if (prod.esStockValido(sStock)) {
                flag = false;
            } else {
                System.out.println("Stock inválido - Intente nuevamente");
            }
        }
        flag = true;
        // Registrar Proveedor
        while (flag) {
            System.out.print("Proveedor: ");
            Scanner entradaProveedor = new Scanner(System.in);
            sProveedor = entradaProveedor.nextLine();
            if (prod.esProveedorValido(sProveedor)) {
                flag = false;
            } else {
                System.out.println("Proveedor inválido - Intente nuevamente");
            }
        }
        flag = true;
        // Registrar Marca
        while (flag) {
            System.out.print("Marca: ");
            Scanner entradaMarca = new Scanner(System.in);
            sMarca = entradaMarca.nextLine();
            if (prod.esMarcaValida(sMarca)) {
                flag = false;
            } else {
                System.out.println("Marca inválida - Intente nuevamente");
            }
        }
        flag = true;
        // Registrar Descripción
        while (flag) {
            System.out.print("Descripción: ");
            Scanner entradaDescripcion = new Scanner(System.in);
            sDescripcion = entradaDescripcion.nextLine();
            if (prod.esDescripcionValida(sDescripcion)) {
                flag = false;
            } else {
                System.out.println("Descripción inválida - Intente nuevamente");
            }
        }

        System.out.println("\n");

        prod.codigo = sCodigo;
        prod.nombre = sNombre;
        prod.fecha = sFecha;
        prod.precioUnitario = sPrecioUnit;
        prod.stock = sStock;
        prod.proveedor = sProveedor;
        prod.marca = sMarca;
        prod.descripcion = sDescripcion;

        File fichero = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        String cadena = "";
        try {
            fichero = new File("registroProductos.txt");
            fw = new FileWriter(fichero, true);
            pw = new PrintWriter(fw);
            cadena += prod.codigo + ",";
            cadena += prod.nombre + ",";
            cadena += prod.fecha + ",";
            cadena += prod.precioUnitario + ",";
            cadena += prod.stock + ",";
            cadena += prod.proveedor + ",";
            cadena += prod.marca + ",";
            cadena += prod.descripcion;
            String cadena2 = cadena;
            pw.println(cadena2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void iniciarConsultaEmpleados() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("registroEmpleados2.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String cadena = "";
                StringTokenizer tokens = new StringTokenizer(linea, ",");
                String dato = tokens.nextToken();
                
                Empleado nuevoEmpleado = new Empleado();
                nuevoEmpleado.setCodigo(dato);
                cadena += "|"+nuevoEmpleado.getCodigo()+"| -> ";
                
                dato = tokens.nextToken();
                nuevoEmpleado.setNombre(dato);
                cadena += nuevoEmpleado.getNombre() + " ";
                
                dato = tokens.nextToken();
                nuevoEmpleado.setApellido(dato);
                cadena += nuevoEmpleado.getApellido() + ", ";
                
                dato = tokens.nextToken();
                nuevoEmpleado.setCargo(dato);
                cadena += nuevoEmpleado.getCargo() + ", ";
                
                dato = tokens.nextToken();
                nuevoEmpleado.setUltimaSucursal(dato);
                cadena += "Sucursal " + nuevoEmpleado.getUltimaSucursal() + ", ";
                
                dato = tokens.nextToken();
                nuevoEmpleado.setDireccion(dato);
                cadena += nuevoEmpleado.getDireccion() + ", ";
                
                dato = tokens.nextToken();
                nuevoEmpleado.setCorreo(dato);
                cadena += nuevoEmpleado.getCorreo() + ", ";
                
                dato = tokens.nextToken();
                nuevoEmpleado.setNumTelf(dato);
                cadena += nuevoEmpleado.getNumTelf();
                
                System.out.println(cadena + "\n");
                
                
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

    }

    /*public void iniciarEliminarEmpleados() {

    }*/
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

                listaEmpleados.insertarOrdenado(nuevoEmpleado);

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
