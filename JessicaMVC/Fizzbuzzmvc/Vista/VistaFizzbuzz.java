/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Modelofizzbuzz;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VistaFizzbuzz {
     public void mostrarResultado(ArrayList<Modelofizzbuzz> resultados) {
        for (Modelofizzbuzz numero : resultados) {
            System.out.println(numero.getNumero() + ": " + numero.getResultado());
        }
    }

    public int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Hasta qué número desea jugar FizzBuzz?: ");
        return scanner.nextInt();
    }
}
