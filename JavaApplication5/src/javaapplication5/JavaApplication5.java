/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author juanf
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Scanner pd= new Scanner(System.in);
       boolean bandi=true;
        while (bandi) {            
            
        
        System.out.println("Bienvenido al sistema de juego Pokemon");
        System.out.println("Sus opciones son los siguientes");
        System.out.println();
        System.out.println("1.Registrar entrenador");
        System.out.println("2.Combatir");
        System.out.println("3.Capturar y entrenar");
        System.out.println("4.agregar movimientos");
        System.out.println("5.salir");
        System.out.println();
        System.out.println("Marque el numero de la opcion para seleccionarla");
        int menu=pd.nextInt();
        switch (menu) {
            case 1:
            
                break;
            case 2:

                break;
            case 3:
                
                break;
            case 4:

                break;
            case 5:
                System.out.println("Saliendo...");
                bandi=false;
                break;
            default:
                System.out.println("Opcion invalida, por favor seleccione otra");
                break;
        }
        }
        
    }
    
}
