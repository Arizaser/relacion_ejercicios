/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piedra_papel_tijera;

/**
 *
 * @author marizase
 */
public class Juego {
    private Participante participante1;
    private Participante participante2;
    private int puntuacion_maxima;
    private int puntuacion_jugador1;
    private int puntuacion_jugador2;

    public Juego(Participante participante1, Participante participante2, int puntuacion_maxima) {
        this.participante1 = participante1;
        this.participante2 = participante2;
        this.puntuacion_maxima = puntuacion_maxima;
        this.puntuacion_jugador1 = 0;
        this.puntuacion_jugador2 = 0;
    }

    public Participante getParticipante1() {
        return participante1;
    }

    public void setParticipante1(Participante participante1) {
        this.participante1 = participante1;
    }

    public Participante getParticipante2() {
        return participante2;
    }

    public void setParticipante2(Participante participante2) {
        this.participante2 = participante2;
    }

    public int getPuntuacion_maxima() {
        return puntuacion_maxima;
    }

    public void setPuntuacion_maxima(int puntuacion_maxima) {
        this.puntuacion_maxima = puntuacion_maxima;
    }

    public int getPuntuacion_jugador1() {
        return puntuacion_jugador1;
    }

    public void setPuntuacion_jugador1(int puntuacion_jugador1) {
        this.puntuacion_jugador1 = puntuacion_jugador1;
    }

    public int getPuntuacion_jugador2() {
        return puntuacion_jugador2;
    }

    public void setPuntuacion_jugador2(int puntuacion_jugador2) {
        this.puntuacion_jugador2 = puntuacion_jugador2;
    }
    
    public void mostrarResultado() {
        System.out.println("El resultado es de: \n"+this.participante1.getNombre()+": "+this.puntuacion_jugador1+" - "+this.participante2.getNombre()+": "+this.puntuacion_jugador2);
    }
    
    public void jugada() {
        switch (this.participante1.getEleccion()) {
                case 1 -> {
                    switch (this.participante2.getEleccion()) {
                        case 1 -> {
                            System.out.println("Empate! Piedra vs Piedra. Sigue jugando");
                            break;
                        }
                        case 2 -> {
                            System.out.println("Piedra vs Papel. Gana " + this.participante2.getNombre() + "!");
                            this.puntuacion_jugador2++;
                            break;
                        }
                        case 3 -> {
                            System.out.println("Piedra vs Tijera. Gana " + this.participante1.getNombre() + "!");
                            this.puntuacion_jugador1++;
                            break;
                        }
                        default -> {
                            throw new AssertionError();
                        }
                    }
                    break;
                }
                case 2 -> {
                    switch (this.participante2.getEleccion()) {
                        case 1 -> {
                            System.out.println("Papel vs Piedra. Gana " + this.participante1.getNombre() + "!");
                            this.puntuacion_jugador1++;
                            break;
                        }
                        case 2 -> {
                            System.out.println("Empate! Piedra vs Piedra. Sigue jugando");
                            break;
                        }
                        case 3 -> {
                            System.out.println("Papel vs Tijera. Gana " + this.participante2.getNombre() + "!");
                            this.puntuacion_jugador2++;
                            break;
                        }
                        default -> {
                            throw new AssertionError();
                        }
                    }
                    break;
                }
                case 3 -> {
                    switch (this.participante2.getEleccion()) {
                        case 1 -> {
                            System.out.println("Tijera vs Piedra. Gana " + this.participante2.getNombre() + "!");
                            this.puntuacion_jugador2++;
                            break;
                        }
                        case 2 -> {
                            System.out.println("Tijera vs Papel. Gana " + this.participante1.getNombre() + "!");
                            this.puntuacion_jugador1++;
                            break;
                        }
                        case 3 -> {
                            System.out.println("Empate! Piedra vs Piedra. Sigue jugando");
                            break;
                        }
                        default -> {
                            throw new AssertionError();
                        }
                    }
                    break;
                }
                default -> {
                    throw new AssertionError();
                }
            }
    }
    
    public boolean ganador() {
        return this.puntuacion_jugador1 == this.puntuacion_maxima || this.puntuacion_jugador2 == this.puntuacion_maxima;
    }
}
