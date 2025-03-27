/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Asiento;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaCine {
    private Scanner scanner;

    public VistaCine() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("1. Realizar reserva");
        System.out.println("2. Ver reservas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public int leerOpcion() {
        return scanner.nextInt();
    }

    public int pedirNumeroAsiento() {
        System.out.println("Asientos disponibles (20)");
        System.out.print("Ingrese el número de asiento a reservar: ");
        return scanner.nextInt();
    }

    public String pedirNombrePersona() {
        System.out.print("Ingrese el nombre de la persona: ");
        return scanner.next();
    }

    public String pedirNombreCine() {
        System.out.print("Ingrese el nombre del cine: ");
        return scanner.next();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarReservas(ArrayList<Asiento> asientos) {
        System.out.println("Reservas actuales:");
        for (Asiento asiento : asientos) {
            if (asiento.isOcupado()) {
                System.out.println("Asiento " + asiento.getNumero() + " está reservado.");
            }
        }
    } 
}
