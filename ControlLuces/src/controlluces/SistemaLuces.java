/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlluces;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class SistemaLuces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SensorLuz sensorLuz = new SensorLuz();
        SensorMovimiento sensorMov = new SensorMovimiento();
        Luces luces = new Luces();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Leer sensores y controlar luces");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();
            if (opcion == 2) break;

            System.out.print("¿Es de noche? (true/false): ");
            boolean esNoche = scanner.nextBoolean();
            sensorLuz.setEsNoche(esNoche);

            System.out.print("¿Hay movimiento en la habitación? (true/false): ");
            boolean hayMovimiento = scanner.nextBoolean();
            sensorMov.setHayMovimiento(hayMovimiento);

            luces.controlar(sensorLuz, sensorMov);
        }

        scanner.close();
    }
}
