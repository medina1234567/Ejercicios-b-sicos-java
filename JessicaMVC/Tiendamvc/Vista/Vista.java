/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Modelo;
import java.util.ArrayList;
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
        System.out.println("Control de Acceso a Tienda");
        System.out.println("1. Registrar acceso");
        System.out.println("2. Ver historial de accesos");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public String pedirNombre() {
        System.out.print("Ingrese el nombre de la persona: ");
        return scanner.nextLine();
    }

    public boolean pedirMembresia() {
        System.out.print("¿Tiene membresía? (true/false): ");
        return scanner.nextBoolean();
    }

    public boolean pedirEmpleado() {
        System.out.print("¿Es empleado? (true/false): ");
        return scanner.nextBoolean();
    }

    public boolean pedirHorarioValido() {
        System.out.print("¿Está en horario válido? (true/false): ");
        return scanner.nextBoolean();
    }

    public void mostrarEstado(String estado) {
        System.out.println("Estado de acceso: " + estado);
    }

    public void mostrarHistorial(ArrayList<Modelo> historial) {
        System.out.println("Historial de accesos:");
        for (Modelo registro : historial) {
            System.out.println("Nombre: " + registro.getNombre() + " - Estado: " + registro.getEstadoAcceso());
        }
    }
}
