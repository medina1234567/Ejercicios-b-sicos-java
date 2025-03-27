/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista {
     public Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Sistema de Detección de Intrusos");
        System.out.println("1. Activar/Desactivar alarma");
        System.out.println("2. Simular movimiento");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public boolean pedirEstadoSensor(String nombreSensor) {
        System.out.print("¿El sensor " + nombreSensor + " detecta movimiento? (true/false): ");
        return scanner.nextBoolean();
    }

    public boolean pedirEstadoAlarma() {
        System.out.print("¿Es de noche? (true/false): ");
        return scanner.nextBoolean();
    }
}
