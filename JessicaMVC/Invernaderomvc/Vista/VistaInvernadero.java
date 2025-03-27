/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.ModeloInvernadero;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaInvernadero {
     public Scanner scanner;

    public VistaInvernadero() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Control de Temperatura en Invernadero");
        System.out.println("1. Registrar temperatura");
        System.out.println("2. Ver historial de temperaturas");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public double pedirTemperatura() {
        System.out.print("Ingrese la temperatura actual (°C): ");
        return scanner.nextDouble();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarHistorial(ArrayList<ModeloInvernadero> historial) {
        System.out.println("Historial de temperaturas:");
        for (ModeloInvernadero sensor : historial) {
            System.out.println("Temperatura: " + sensor.getTemperatura() + "°C - Estado: " + sensor.getEstado());
        }
    }
}
