
package Ejercicios_Basicos2025;

import java.util.Scanner;

public class campeonato {
    


public class ClasificacionCampeonato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el resultado del partido
        System.out.println("Ingrese el resultado del partido (ganado, perdido, empatado):");
        String resultado = scanner.next().toLowerCase();

        // Inicializar puntos de los equipos
        int puntosEquipo = 0;

        // Asignar puntos según el resultado
        switch (resultado) {
            case "ganado":
                puntosEquipo = 3;
                System.out.println("¡Felicidades! Has ganado el partido y obtenemos 3 puntos.");
                break;
            case "empate":
                puntosEquipo = 1;
                System.out.println("El partido terminó en empate, ambos equipos obtienen 1 punto.");
                break;
            case "perdido":
                puntosEquipo = 0;
                System.out.println("Lo sentimos, el equipo perdió el partido y no obtiene puntos.");
                break;
            default:
                System.out.println("Resultado no válido. Por favor ingrese 'ganado', 'perdido' o 'empatado'.");
                scanner.close();
                return;
        }

        // Mostrar puntos del equipo
        System.out.println("Puntos obtenidos: " + puntosEquipo);
        
    }
}








}





