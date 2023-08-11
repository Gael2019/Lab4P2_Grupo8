/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.util.ArrayList;

/**
 *
 * @author juanf
 */
public class Entrenador {
    String nombre;
    int edad;
    int Dinero;
    Pokemon[] APokemon= new Pokemon[6]; 
    ArrayList <Pokemon> caja= new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDinero() {
        return Dinero;
    }

    public Pokemon[] getAPokemon() {
        return APokemon;
    }

    public ArrayList<Pokemon> getCaja() {
        return caja;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public void setAPokemon(Pokemon[] APokemon) {
        this.APokemon = APokemon;
    }

    public void setCaja(ArrayList<Pokemon> caja) {
        this.caja = caja;
    }

    public Entrenador() {
    }

    @Override
    public String toString() {
        return "Entrenador{" + "nombre=" + nombre + ", edad=" + edad + ", Dinero=" + Dinero + ", APokemon=" + APokemon + ", caja=" + caja + '}';
    }
    
}
