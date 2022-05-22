/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proydistrespinoza1.pkg1;

/**
 *
 * @author Cris
 */
public class Sucursal {
    private final int tamaño = 13;
    private int numSucursal;
    private String[] arregloSucursal;
    
    // Constructor
    public Sucursal(int numSucursal){
        this.numSucursal = numSucursal;
        arregloSucursal = new String[tamaño];
        for(int i = 0; i < arregloSucursal.length; i++){
            arregloSucursal[i] = "";
        }
    }
    
    public void insertarCodigo(String codigo){
        for(int i = 0; i < this.arregloSucursal.length; i++){
            if(this.arregloSucursal[i].equals("")){
                arregloSucursal[i] = codigo;
                break;
            }
        }
    }
    
    public void borrarCodigo(String info){
        for(int i = 0; i < arregloSucursal.length; i++){
            if(arregloSucursal[i].equals(info)){
                arregloSucursal[i] = "";
                break;
            }
        }
    }
    
    public String consultarEmpleado(String info){
        for(int i = 0; i < arregloSucursal.length; i++){
            if(arregloSucursal[i].equals(info)){
                return info; 
            }
        }
        return "El empleado "+info+" no se encuentra en la sucursal "+this.numSucursal;
    }
    
    /*public String mostrarEstructura(ListaDEnlazada lista){
        String texto = "";
        texto += "Los siguientes empleados trabajan en la sucursal "+this.numSucursal+"\n";
        for(int i = 0; i < this.arreglo.length; i++){
            if (!this.arreglo[i].equals("")){
                texto += "- " + this.arreglo[i] + ": " +lista.obtenerEmpleado(this.arreglo[i])+"\n";
            }
        }
        return texto;
    }*/
    
    public void vaciarArreglo(){
        for(int i = 0; i < 13; i++){
            this.arregloSucursal[i] = "";
        }
    }
    
    public boolean estaVacio(){
        return this.arregloSucursal[0].equals("");
    }
}

