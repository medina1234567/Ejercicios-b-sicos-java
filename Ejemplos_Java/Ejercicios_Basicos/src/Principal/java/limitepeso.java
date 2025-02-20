
package Principal.java;

import java.util.Scanner;


public class limitepeso {
    // 2. Desarrolla un programa que simule un ascensor con límite de peso

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pisoMin = 1, pisoMax = 6;
        double pesoMaximo = 100.0;

        System.out.print("Ingrese su peso en kg: ");
        double pesoUsuario = scanner.nextDouble();
        
        if (pesoUsuario <= pesoMaximo) {
            System.out.print("Ingrese el piso al que desea ir (1-6): ");
            int pisoDeseado = scanner.nextInt();
            
            if (pisoDeseado >= pisoMin && pisoDeseado <= pisoMax) {
                System.out.println("El ascensor se mueve al piso " + pisoDeseado + ".");
            } else {
                System.out.println("Error: Piso no válido.");
            }
        } else {
            System.out.println("Error: El ascensor está sobrecargado.");
        }
      
    }
}

