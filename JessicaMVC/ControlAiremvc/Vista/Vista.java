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
        System.out.println("Control de Aire Acondicionado");
        System.out.println("1. Registrar lectura de sensores");
        System.out.println("2. Ver historial de registros");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public double pedirTemperatura() {
        System.out.print("Ingrese la temperatura actual: ");
        return scanner.nextDouble();
    }

    public double pedirHumedad() {
        System.out.print("Ingrese la humedad actual (%): ");
        return scanner.nextDouble();
    }

    public void mostrarEstado(String estado) {
        System.out.println("Estado del aire acondicionado: " + estado);
    }

    public void mostrarHistorial(ArrayList<Modelo> historial) {
        System.out.println("Historial de lecturas:");
        for (Modelo registro : historial) {
            System.out.println("Temperatura: " + registro.getTemperatura() + "°C - Humedad: " + registro.getHumedad() + "% - Estado: " + registro.getEstado());
        }
    }
}
