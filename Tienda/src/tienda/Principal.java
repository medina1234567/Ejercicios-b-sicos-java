/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

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
        ControlAcceso sistemaAcceso = new ControlAcceso();

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Verificar acceso a tienda");
            System.out.println("2. Salir");
            int opcion = scanner.nextInt();
            if (opcion == 2) break;

            if (opcion == 1) {
                System.out.print("¿Tiene membresía válida? (true/false): ");
                boolean tieneMembresia = scanner.nextBoolean();

                System.out.print("¿Es empleado? (true/false): ");
                boolean esEmpleado = scanner.nextBoolean();

                System.out.print("¿Es hora dentro del horario de atención? (true/false): ");
                boolean horarioAtencion = scanner.nextBoolean();

                ControlAcceso.verificarAcceso(tieneMembresia, esEmpleado, horarioAtencion);
            }
        }

        scanner.close();
    }
    
}
