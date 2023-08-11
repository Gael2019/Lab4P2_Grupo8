/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Jorge Ramirez
 */
public class MFisico extends Movimiento {
    int ppoder;
    int ppresicion;

    public MFisico() {
        super();
    }
    
    
    public MFisico(int ppoder, int ppresicion, String nombre, String descripcion) {
        this.descripcion=descripcion;
        this.nombre=nombre;

        this.ppoder = ppoder;
        this.ppresicion = ppresicion;
    }

    public int getPpoder() {
        return ppoder;
    }

    public void setPpoder(int ppoder) {
        this.ppoder = ppoder;
    }

    public int getPpresicion() {
        return ppresicion;
    }

    public void setPpresicion(int ppresicion) {
        this.ppresicion = ppresicion;
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
        return "MFisico{" +"Nombre=" + nombre + ", Descripcion="+ descripcion +", ppoder=" + ppoder + ", ppresicion=" + ppresicion + "}\n";
    }

    public int ataque(Pokemon pokemon1 ,Pokemon pokemon2) {
        int random = (int) ((Math.random() * (100 - 1)) + 1);
        if (pokemon1.getAtaque()>pokemon2.getDefensa()) {
            return random*2;
        }else if (pokemon1.getAtaque()<pokemon2.getDefensa()) {
            return random/2; 
        }else{
        
        return pokemon1.getAtaque()-pokemon2.getDefensa();
        }
    }

    
    
}
