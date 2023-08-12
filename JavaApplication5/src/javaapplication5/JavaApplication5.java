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
        ArrayList<Entrenador> Entrenadores = new ArrayList();
        Scanner pd = new Scanner(System.in);
        Entrenador trainer = new Entrenador();
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
                    System.out.println("Marque el nombre de su entrenador");
                    String nombre = pd.next();
                    System.out.println("Marque la edad de su entrenador");
                    int edad = pd.nextInt();
                    System.out.println("Marque el dinero que tiene su entrenador, o marquele 0 si le esta dando dinero a su mama (es broma)");
                    int dinero = pd.nextInt();
                    Entrenadores.add(new Entrenador(nombre, edad, dinero));
                    System.out.println("Esta es la lista de entrenadores existentes, marque el numero de enfrente de la opcion para seleccionarlo");
                    for (int i = 0; i < Entrenadores.size(); i++) {
                        System.out.println(i + "." + Entrenadores.get(i));
                    }
                    int DesE = pd.nextInt();
                    System.out.println("Esta es la lista de pokemones existentes");
                    for (int i = 0; i < Pokemones.size(); i++) {
                        System.out.println(i + "." + Pokemones.get(i));
                    }
                    System.out.println("Marque el numero de enfrente de pokemon para selecionarlo");
                    int PokS = pd.nextInt();
                    System.out.println("Desea agregar ese pokemon al equipo de su entrenador o a su caja, marque 1 para agregarle al entrenador o 2 para agregarle a su caja");
                    int opc = pd.nextInt();
                    switch (opc) {
                        case 1:
                            Pokemon[] APokemon = Entrenadores.get(Entrenadores.size() - 1).getAPokemon();
                            boolean simon = false;
                            for (int i = 0; i < APokemon.length; i++) {
                                if (APokemon[i] == null && simon == false) {
                                    Entrenadores.get(Entrenadores.size() - 1).getAPokemon()[i] = Pokemones.get(PokS);
                                    simon = true;
                                }
                            }
                            if (simon == false) {
                                System.out.println("NO hay espacio");
                            }
                            break;
                        case 2:
                            trainer.getCaja().add(Pokemones.get(PokS));
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Esta es la lista de entrenadores existentes, marque el numero de enfrente de la opcion para seleccionar al jugador 1");
                    for (int i = 0; i < Entrenadores.size(); i++) {
                        System.out.println(i + "." + Entrenadores.get(i));
                    }
                    int desP1 = pd.nextInt();
                    System.out.println("Esta es la lista de entrenadores existentes, marque el numero de enfrente de la opcion para seleccionar al jugador 2");
                    for (int i = 0; i < Entrenadores.size(); i++) {
                        System.out.println(i + "." + Entrenadores.get(i));
                    }
                    int desP2 = pd.nextInt();
                    while (desP1 == desP2) {
                        System.out.println("No puede elegir al mismo entrenador para pelear");
                        System.out.println("Selecione otro en el player 2");
                        System.out.println("Esta es la lista de entrenadores existentes, marque el numero de enfrente de la opcion para seleccionar al jugador 2");
                        for (int i = 0; i < Entrenadores.size(); i++) {
                            System.out.println(i + "." + Entrenadores.get(i));
                        }
                        desP2 = pd.nextInt();
                    }
                    System.out.println("Esta es la lista de los pokemones que tiene el entrenador que es jugador 1");
                    for (int i = 0; i < Entrenadores.get(desP1).APokemon.length; i++) {
                        System.out.println(i + "." + Entrenadores.get(desP1).getAPokemon()[i]);
                    }
                    System.out.println("Marque la posicion del pokemon que tiene el entrenador para enviarlo a pelear");
                    int DesPel1 = pd.nextInt();
                    System.out.println();
                    System.out.println("Esta es la lista de los pokemones que tiene el entrenador que es jugador 2");
                    for (int i = 0; i < Entrenadores.get(desP2).APokemon.length; i++) {
                        System.out.println(i + "." + Entrenadores.get(desP2).getAPokemon()[i]);
                    }
                    System.out.println("Marque la posicion del pokemon que tiene el entrenador para enviarlo a pelear");
                    int DesPel2 = pd.nextInt();
                    while (Entrenadores.get(desP1).getAPokemon()[DesPel1].getVida() >=0 && Entrenadores.get(desP2).getAPokemon()[DesPel2].getVida() >=0) {
                        if (Entrenadores.get(desP1).getAPokemon()[DesPel1].getVelocidad() > Entrenadores.get(desP2).getAPokemon()[DesPel2].getVelocidad()) {
                            System.out.println("Jugador 1 es su turno");
                            System.out.println("Seleccione un ataque para atacar al pokemon");
                            System.out.println("Los ataques que tiene su pokemon son los siguientes");
                            
                                System.out.println(ImprimirArray(Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()));
                            
                            System.out.println("Marque la posicion del ataque para seleccionarlo");
                            int PosA1 = pd.nextInt();
                            if (Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1] instanceof MEspecial) {
                                int vidares = Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1].ataque(Entrenadores.get(desP1).getAPokemon()[DesPel1], Entrenadores.get(desP2).getAPokemon()[DesPel2]);
                                Entrenadores.get(desP2).getAPokemon()[DesPel2].setVida(vidares);
                            } else if (Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1] instanceof MFisico) {
                                int resavida = Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1].ataque(Entrenadores.get(desP1).getAPokemon()[DesPel1], Entrenadores.get(desP2).getAPokemon()[DesPel2]);
                                int vidares = Entrenadores.get(desP2).getAPokemon()[DesPel2].getVida() - resavida;
                                Entrenadores.get(desP2).getAPokemon()[DesPel2].setVida(vidares);
                            } else if (Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1] instanceof MEstado) {
                                int bandera = Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1].ataque(Entrenadores.get(desP1).getAPokemon()[DesPel1], Entrenadores.get(desP2).getAPokemon()[DesPel2]);
                                if (bandera > 75) {
                                    System.out.println("No se aplico el efecto");
                                } else {
                                    String estado = ((MEstado) Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1]).getPestado();
                                    Entrenadores.get(desP2).getAPokemon()[DesPel2].setEstado(estado);
                                }

                            }
                            System.out.println("Jugador 2 es su turno");
                            System.out.println("Seleccione un ataque para atacar al pokemon");
                            System.out.println("Los ataques que tiene su pokemon son los siguientes");
                            
                                System.out.println(ImprimirArray(Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()));
                           
                            System.out.println("Marque la posicion del ataque para seleccionarlo");
                            int PosA2 = pd.nextInt();
                            if (Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2] instanceof MEspecial) {
                                int vidares = Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2].ataque(Entrenadores.get(desP2).getAPokemon()[DesPel2], Entrenadores.get(desP1).getAPokemon()[DesPel1]);
                                Entrenadores.get(desP1).getAPokemon()[DesPel1].setVida(vidares);
                            } else if (Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2] instanceof MFisico) {
                                int resavida = Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2].ataque(Entrenadores.get(desP2).getAPokemon()[DesPel2], Entrenadores.get(desP1).getAPokemon()[DesPel1]);
                                int vidares = Entrenadores.get(desP1).getAPokemon()[DesPel1].getVida() - resavida;
                                Entrenadores.get(desP1).getAPokemon()[DesPel1].setVida(vidares);
                            } else if (Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2] instanceof MEstado) {
                                int bandera = Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2].ataque(Entrenadores.get(desP2).getAPokemon()[DesPel2], Entrenadores.get(desP1).getAPokemon()[DesPel1]);
                                if (bandera > 75) {
                                    System.out.println("No se aplico el efecto");
                                } else {
                                    String estado = ((MEstado) Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2]).getPestado();
                                    Entrenadores.get(desP1).getAPokemon()[DesPel1].setEstado(estado);
                                }
                                System.out.println("Los pokemones se encuentran asi actualmente");
                                System.out.println(Entrenadores.get(desP1).getAPokemon()[DesPel1]);
                                System.out.println(Entrenadores.get(desP2).getAPokemon()[DesPel2]);
                            }
                        } else {
                            System.out.println("Jugador 2 es su turno");
                            System.out.println("Seleccione un ataque para atacar al pokemon");
                            System.out.println("Los ataques que tiene su pokemon son los siguientes");
                            
                                System.out.println(ImprimirArray(Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()));
                            
                            System.out.println("Marque la posicion del ataque para seleccionarlo");
                            int PosA2 = pd.nextInt();
                            if (Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2] instanceof MEspecial) {
                                int vidares = Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2].ataque(Entrenadores.get(desP2).getAPokemon()[DesPel2], Entrenadores.get(desP1).getAPokemon()[DesPel1]);
                                Entrenadores.get(desP1).getAPokemon()[DesPel1].setVida(vidares);
                            } else if (Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2] instanceof MFisico) {
                                int resavida = Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2].ataque(Entrenadores.get(desP2).getAPokemon()[DesPel2], Entrenadores.get(desP1).getAPokemon()[DesPel1]);
                                int vidares = Entrenadores.get(desP1).getAPokemon()[DesPel1].getVida() - resavida;
                                Entrenadores.get(desP1).getAPokemon()[DesPel1].setVida(vidares);
                            } else if (Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2] instanceof MEstado) {
                                int bandera = Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2].ataque(Entrenadores.get(desP2).getAPokemon()[DesPel2], Entrenadores.get(desP1).getAPokemon()[DesPel1]);
                                if (bandera > 75) {
                                    System.out.println("No se aplico el efecto");
                                } else {
                                    String estado = ((MEstado) Entrenadores.get(desP2).getAPokemon()[DesPel2].getMoveset()[PosA2]).getPestado();
                                    Entrenadores.get(desP1).getAPokemon()[DesPel1].setEstado(estado);
                                }

                            }
                            System.out.println("Jugador 1 es su turno");
                            System.out.println("Seleccione un ataque para atacar al pokemon");
                            System.out.println("Los ataques que tiene su pokemon son los siguientes");
                            
                                System.out.println(ImprimirArray(Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()));
                            
                            System.out.println("Marque la posicion del ataque para seleccionarlo");
                            int PosA1 = pd.nextInt();
                            if (Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1] instanceof MEspecial) {
                                int vidares = Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1].ataque(Entrenadores.get(desP1).getAPokemon()[DesPel1], Entrenadores.get(desP2).getAPokemon()[DesPel2]);
                                Entrenadores.get(desP2).getAPokemon()[DesPel2].setVida(vidares);
                            } else if (Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1] instanceof MFisico) {
                                int resavida = Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1].ataque(Entrenadores.get(desP1).getAPokemon()[DesPel1], Entrenadores.get(desP2).getAPokemon()[DesPel2]);
                                int vidares = Entrenadores.get(desP2).getAPokemon()[DesPel2].getVida() - resavida;
                                Entrenadores.get(desP2).getAPokemon()[DesPel2].setVida(vidares);
                            } else if (Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1] instanceof MEstado) {
                                int bandera = Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1].ataque(Entrenadores.get(desP1).getAPokemon()[DesPel1], Entrenadores.get(desP2).getAPokemon()[DesPel2]);
                                if (bandera > 75) {
                                    System.out.println("No se aplico el efecto");
                                } else {
                                    String estado = ((MEstado) Entrenadores.get(desP1).getAPokemon()[DesPel1].getMoveset()[PosA1]).getPestado();
                                    Entrenadores.get(desP2).getAPokemon()[DesPel2].setEstado(estado);
                                }

                            }
                            System.out.println("Los pokemones se encuentran asi actualmente");
                                System.out.println(Entrenadores.get(desP1).getAPokemon()[DesPel1]);
                                System.out.println(Entrenadores.get(desP2).getAPokemon()[DesPel2]);
                        }
                    }
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
                                System.out.println("Marque el nivel base con el que cuenta su pokemon");
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
                                PokS = pd.nextInt();
                                System.out.println("Esta es la lista de movimientos disponibles que le puede agregar a este pokemon");
                                for (int i = 0; i < Movimiento.size(); i++) {
                                    System.out.println(i + "." + Movimiento.get(i));
                                }
                                int cont = 0;
                                while (cont != 4) {
                                    System.out.println("Marque el numero de enfrete de la opcion para seleccionarla");
                                    int desM = pd.nextInt();
                                    Pokemones.get(PokS).setMoveset(Movimiento.get(desM), cont);
                                    cont++;
                                }
                                a = false;
                                break;
                            case 2:
                                for (int i = 0; i < Entrenadores.size(); i++) {
                                    System.out.println("Posicion " + i + " " + Entrenadores.get(i));
                                }
                                System.out.println("Digitr la posicion");
                                int posicion = pd.nextInt();

                                for (int i = 0; i < Entrenadores.get(posicion).getAPokemon().length; i++) {
                                    System.out.println("Posicion" + i + "" + Entrenadores.get(posicion).getAPokemon()[i]);
                                }
                                System.out.println("Digitr la posicion");
                                int posicionpok = pd.nextInt();
                                int random = (int) ((Math.random() * (100 - 1)) + 1);
                                int random2 = (int) ((Math.random() * (100 - 1)) + 1);
                                int res1 = random * random2;
                                int resultC = res1 / Entrenadores.get(posicion).getAPokemon()[posicionpok].getExperienciaNecesaria();
                                int fin = Entrenadores.get(posicion).getAPokemon()[posicionpok].getNivel() + resultC;
                                Entrenadores.get(posicion).getAPokemon()[posicionpok].setNivel(fin);
                                a = false;
                                break;
                            default:
                                System.out.println("opcion invalida marque otra por favor ");
                                break;
                        }
                    }
                    break;
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
                    break;
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

    public static String ImprimirArray(Movimiento[] moveset) {
        String salida = "";
        for (int i = 0; i < moveset.length; i++) {
            salida = i + "." + salida + moveset[i] + "\n";

        }
        return salida;
    }

}
