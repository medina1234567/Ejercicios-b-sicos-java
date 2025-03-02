/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlaires;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class SistemaAireAcondicionado {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SensorTemperatura sensorTemp = new SensorTemperatura();
        SensorHumedad sensorHum = new SensorHumedad();
        AireAcondicionado aire = new AireAcondicionado();

        while (true) {
            System.out.println("\nMenú:\n1. Leer sensores y controlar aire acondicionado\n2. Salir");
            int opcion = scanner.nextInt();
            if (opcion == 2) break;

            System.out.print("Ingrese la temperatura actual (°C): ");
            double temperatura = scanner.nextDouble();
            sensorTemp.setTemperatura(temperatura);

            System.out.print("Ingrese la humedad actual (%): ");
            double humedad = scanner.nextDouble();
            sensorHum.setHumedad(humedad);

            aire.controlar(sensorTemp, sensorHum);
        }

        scanner.close();
    }
}

