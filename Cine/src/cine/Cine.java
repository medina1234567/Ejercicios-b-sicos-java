package cine;

import java.util.Scanner;

public class Cine {
    private Sala sala;
    private Scanner scanner;

    public Cine(int capacidad) {
        sala = new Sala(capacidad);
        scanner = new Scanner(System.in);
    }

    public void gestionarReservas() {
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        Persona persona = new Persona(nombre);

        while (true) {
            System.out.println("\nEstado de los asientos:");
            sala.mostrarEstado();

            System.out.print("Ingrese el número de asiento (1-10) o 0 para salir: ");
            int numeroAsiento = scanner.nextInt();

            if (numeroAsiento == 0) {
                System.out.println("Gracias por usar el sistema de reservas. ¡Hasta pronto!");
                break;
            }

            if (numeroAsiento < 1 || numeroAsiento > 10) {
                System.out.println("Número de asiento inválido. Intente de nuevo.");
            } else {
                boolean exito = sala.reservarAsiento(numeroAsiento - 1); // Restamos 1 porque el array comienza desde 0
                if (exito) {
                    System.out.println("¡Reserva exitosa para " + persona.getNombre() + "!");
                } else {
                    System.out.println("El asiento ya está ocupado. Elija otro.");
                }
            }
        }
    }
}


