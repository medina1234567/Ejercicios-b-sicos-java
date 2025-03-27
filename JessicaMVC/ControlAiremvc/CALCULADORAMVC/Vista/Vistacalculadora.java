/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Modelocalculadora;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vistacalculadora {
    public Scanner scanner;

    public Vistacalculadora() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Calculadora Simple");
        System.out.println("1. Realizar operación");
        System.out.println("2. Ver historial de operaciones");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public double pedirNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public String pedirOperador() {
        System.out.print("Ingrese el operador (+, -, *, /): ");
        return scanner.next();
    }

    public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarHistorial(ArrayList<Modelocalculadora> historial) {
        System.out.println("Historial de operaciones:");
        for (Modelocalculadora op : historial) {
            System.out.println(op.getNumero1() + " " + op.getOperador() + " " + op.getNumero2() + " = " + op.getResultado());
        }
    } 
}
