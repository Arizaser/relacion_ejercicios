package piedra_papel_tijera;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marizase
 */
public class Main {
    public static void showMenu() {
        System.out.println("---------------------------");
        System.out.println("""
                           Selecciona tu opción
                           PIEDRA | PAPEL | TIJERA
                           | 1. Piedra
                           | 2. Papel
                           | 3. Tijera""");
        System.out.println("---------------------------");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Random r = new Random();
        
        System.out.println("Introduce tu nombre para empezar la partida.");
        Participante jugador = new Participante(scanner.nextLine());
        Participante maquina = new Participante("CPU");
        System.out.println("¿Cuál quieres que sea la puntuación para ganar?");
        Juego juego = new Juego(jugador, maquina, Integer.parseInt(scanner.nextLine()));

        do {            
            showMenu();
            jugador.setEleccion(Integer.parseInt(scanner.nextLine()));
            maquina.setEleccion(r.nextInt(3)+1);
            
            juego.jugada();
            
            System.out.println("---------------------------");
            juego.mostrarResultado();
            System.out.println("---------------------------");
        } while (!juego.ganador());
    }
}
