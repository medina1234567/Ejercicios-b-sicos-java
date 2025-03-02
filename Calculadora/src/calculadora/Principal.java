/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

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
        Calculadora calculadora = new Calculadora();

        while (true) {
            System.out.println("\nMenú: \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 5) break;

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = calculadora.calcular(opcion, num1, num2);
            System.out.println("Resultado: " + resultado);
        }
        scanner.close();
    }
    
}
