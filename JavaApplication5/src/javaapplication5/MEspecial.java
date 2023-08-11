/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Jorge Ramirez
 */
public class MEspecial extends Movimiento {
    int ppoder;
    int ppresicion;

    public MEspecial() {
        super();
    }
    
    
    public MEspecial(int ppoder, int ppresicion) {
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
        return "MEspecial{" + "ppoder=" + ppoder + ", ppresicion=" + ppresicion + '}';
    }

   
    public int ataque(Pokemon p, Pokemon p2) {
         int random = (int) ((Math.random() * (50 - 1)) + 1);
         int random2 = (int) ((Math.random() * (500 - 100)) + 100);
                int suma =p.especial+p2.especial;
                if (suma==random2) {
            random*=2;
        }
                p2.setVida(p2.getVida()-random);
                return p2.getVida()-random;
    }
    
    
}
