/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;


/**
 *
 * @author Jorge Ramirez
 */
public class Pokemon {
    String especie;
    int vida;
    int ataque;
    int defensa;
    int nivel;
    int experienciaNecesaria;
    int especial;
    int velocidad;
    String estado;
    
    
    Movimiento [] moveset = new Movimiento[4];
    
    public Pokemon(String especie, int vida, int ataque, int defensa, int nivel, int experienciaNecesaria, int especial, int velocidad, String estado) {
        this.especie = especie;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = nivel;
        this.experienciaNecesaria = experienciaNecesaria;
        this.especial = especial;
        this.velocidad = velocidad;
        this.estado = estado;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int experiencia) {
        this.nivel = experiencia;
    }

    public int getExperienciaNecesaria() {
        return experienciaNecesaria;
    }

    public void setExperienciaNecesaria(int experienciaNecesaria) {
        this.experienciaNecesaria = experienciaNecesaria;
    }

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Movimiento[] getMoveset() {
        return moveset;
    }

    public void setMoveset(Movimiento m, int contador) {
        moveset[contador]=m;

    }

    @Override
    public String toString() {
        return "Pokemon{" + "especie=" + especie + "}\n";
    }
    
    
}
