
package Principal.java;

import java.util.Scanner;

public class Asensor {
   
  //1. Escribe un programa que simule un ascensor

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pisoMin = 1, pisoMax = 6;
        
        System.out.print("Ingrese el piso al que desea ir (1-6): ");
        int pisoDeseado = scanner.nextInt();
        
        if (pisoDeseado >= pisoMin && pisoDeseado <= pisoMax) {
            System.out.println("El ascensor se mueve al piso " + pisoDeseado + ".");
        } else {
            System.out.println("Error: Piso no válido.");
        }
        
    }
}

        
    




    
