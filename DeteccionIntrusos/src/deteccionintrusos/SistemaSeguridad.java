/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deteccionintrusos;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class SistemaSeguridad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaSeguridadd sistemaSeguridadd = new SistemaSeguridadd();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Activar/Desactivar alarma");
            System.out.println("2. Simular sensores");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            if (opcion == 3) break;

            if (opcion == 1) {
                System.out.print("¿Desea activar la alarma? (true/false): ");
                boolean activar = scanner.nextBoolean();
                sistemaSeguridadd.configurarAlarma(activar);
            }

            if (opcion == 2) {
                sistemaSeguridadd.simularIntruso();
            }
        }

        scanner.close();
    }
}

