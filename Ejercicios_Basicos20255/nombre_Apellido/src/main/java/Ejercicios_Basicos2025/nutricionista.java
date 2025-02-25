
package Ejercicios_Basicos2025;

import java.util.Scanner;

public class nutricionista {
    

public class CalcularIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el peso y la altura del usuario
        System.out.println("Ingrese su peso en kilogramos:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese su altura en metros:");
        double altura = scanner.nextDouble();

        // Validar que el peso y la altura sean positivos
        if (peso <= 0 || altura <= 0) {
            System.out.println("El peso y la altura deben ser valores positivos.");
            scanner.close();
            return; // Termina el programa si los valores son inválidos
        }

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Determinar la categoría según el IMC
        String categoria;
        switch ((imc < 18.5) ? 1 : (imc < 24.9) ? 2 : (imc < 29.9) ? 3 : 4) {
            case 1:
                categoria = "Bajo peso";
                break;
            case 2:
                categoria = "Peso normal";
                break;
            case 3:
                categoria = "Sobrepeso";
                break;
            default:
                categoria = "Obesidad";
                break;
        }

        // Mostrar el resultado
        System.out.println("Tu IMC es: " + imc);
        System.out.println("Categoría: " + categoria);

        
    }
}







}
