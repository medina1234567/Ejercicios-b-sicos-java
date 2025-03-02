/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Invernadero;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Invernadero invernadero = new Invernadero();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Leer temperatura y controlar el sistema");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();
            if (opcion == 2) break;

            System.out.print("Ingrese la temperatura actual en °C: ");
            double temperatura = scanner.nextDouble();
            invernadero.actualizarTemperatura(temperatura);
            invernadero.controlarSistema();
        }

        scanner.close();
    }
    
}
