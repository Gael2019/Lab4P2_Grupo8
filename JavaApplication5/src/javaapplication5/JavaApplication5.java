/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.ArrayList;
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
        ArrayList<Movimiento> Movimiento = new ArrayList();
        ArrayList<Pokemon> Pokemones = new ArrayList();
        Scanner pd = new Scanner(System.in);

        boolean bandi = true;
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
            int menu = pd.nextInt();
            switch (menu) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    boolean a = true;
                    while (a) {
                        System.out.println("Marque 1 para capturar y 2 para entrenar");
                        int desicion = pd.nextInt();
                        switch (desicion) {
                            case 1:
                                System.out.println("Marque el nombre-especie de su pokemon");
                                String especie = pd.next();
                                System.out.println("Marque la vida de su pokemon ");
                                int hp = pd.nextInt();
                                System.out.println("Marque el ataque de su pokemon");
                                int ataque = pd.nextInt();
                                System.out.println("Marque la defensa ");
                                int defensa = pd.nextInt();
                                System.out.println("Marque el numero de experiencia de base con la que cuenta su pokemon");
                                int ExpB = pd.nextInt();
                                System.out.println("Marque el numero de experiencia que necesita su pokemon para subir de nivel");
                                int ExpN = pd.nextInt();
                                System.out.println("Marque la estadistica especial de su pokemon");
                                int Special = pd.nextInt();
                                System.out.println("Marque la velocidad que tiene su pokemon");
                                int Spe = pd.nextInt();
                                Pokemones.add(new Pokemon(especie, hp, ataque, defensa, ExpB, ExpN, Special, Spe, "neutral"));
                                System.out.println("Esta es la lista de pokemones que hay a los que le puede agregar movimientos");
                                for (int i = 0; i < Pokemones.size(); i++) {
                                    System.out.println(i + "." + Pokemones.get(i));
                                }
                                System.out.println("Marque el numero de enfrente de pokemon para selecionarlo");
                                int PokS=pd.nextInt();
                                System.out.println("Esta es la lista de movimientos disponibles que le puede agregar a este pokemon");
                                for (int i = 0; i < Movimiento.size(); i++) {
                                    System.out.println(i + "." + Movimiento.get(i));
                                }
                                int cont = 0;
                                while (cont != 4) {                                   
                                    System.out.println("Marque el numero de enfrete de la opcion para seleccionarla");
                                    int desM=pd.nextInt();
                                    Pokemones.get(PokS).setMoveset(Movimiento.get(desM),cont);
                                    cont++;
                                }
                                a = false;
                                break;
                            case 2:
                                
                                a = false;
                                break;
                            default:
                                System.out.println("opcion invalida marque otra por favor ");
                                break;
                        }
                    }
                case 4:
                    boolean b = true;
                    while (b) {
                        System.out.println("Marque 1 si su movimiento es fisico, 2 si es especial, 3 si es de estado");
                        int Bandera = pd.nextInt();
                        switch (Bandera) {
                            case 1:
                                System.out.println("Ingrese el nombre de su movimiento");
                                String Nmove = pd.next();
                                System.out.println("Ingrese la descripcion de su movimiento");
                                String Dmove = pd.next();
                                System.out.println("Ingrese el poder de su move");
                                int poder = pd.nextInt();
                                System.out.println("Ingrese la presicion de su move");
                                int presicion = pd.nextInt();
                                Movimiento.add(new MFisico(poder, presicion, Nmove, Dmove));
                                b = false;
                                break;
                            case 2:
                                System.out.println("Ingrese el nombre de su movimiento");
                                Nmove = pd.next();
                                System.out.println("Ingrese la descripcion de su movimiento");
                                Dmove = pd.next();
                                System.out.println("Ingrese el poder de su move");
                                poder = pd.nextInt();
                                System.out.println("Ingrese la presicion de su move");
                                presicion = pd.nextInt();
                                Movimiento.add(new MEspecial(Nmove, Dmove, poder, presicion));
                                b = false;
                                break;
                            case 3:
                                System.out.println("Ingrese el nombre de su movimiento");
                                Nmove = pd.next();
                                System.out.println("Ingrese la descripcion de su movimiento");
                                Dmove = pd.next();
                                System.out.println("Ingrese el estado que aplica");
                                String estado = pd.next();
                                System.out.println("");
                                Movimiento.add(new MEstado(Nmove, Dmove, estado));
                                b = false;
                                break;
                            default:
                                System.out.println("Numero invalido seleccione otro");
                                break;
                        }
                    }
                case 5:
                    System.out.println("Saliendo...");
                    bandi = false;
                    break;
                default:
                    System.out.println("Opcion invalida, por favor seleccione otra");
                    break;
            }
        }

    }

}
