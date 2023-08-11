/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Jorge Ramirez
 */
public class MEstado extends Movimiento {
    String Pestado;

    public MEstado() {
        super();
    }
    
    
    public MEstado(String nombre, String descripcion,String Pestado) {
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.Pestado = Pestado;
    }

    public String getPestado() {
        return Pestado;
    }

    public void setPestado(String Pestado) {
        this.Pestado = Pestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "MEstado{" +"Nombre=" + nombre + ", Descripcion="+ descripcion + "Pestado=" + Pestado + "}\n";
    }

    

   
    public int ataque(Pokemon p, Pokemon p2) {
    int random = (int) ((Math.random() * (100 - 1)) + 1);
        return random;
    }
    
    
}
