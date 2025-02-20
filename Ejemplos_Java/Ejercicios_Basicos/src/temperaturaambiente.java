
import java.util.Scanner;


public class temperaturaambiente {
  // 3. Crea un programa que simule un sensor de temperatura

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempMin = 18.0, tempMax = 25.0;

        System.out.print("Ingrese la temperatura actual en °C: ");
        double temperatura = scanner.nextDouble();

        if (temperatura >= tempMin && temperatura <= tempMax) {
            System.out.println("La temperatura es adecuada.");
        } else {
            System.out.println("Advertencia: La temperatura está fuera del rango deseado.");
        }
       
    }
}
      

// 3. Crea un programa que simule un sensor de temperatura con umbral de alerta
public class SensorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempMin = 18.0, tempMax = 25.0;
        double umbralAlerta = 30.0;

        System.out.print("Ingrese la temperatura actual en °C: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > umbralAlerta) {
            System.out.println("¡Alerta! La temperatura está por encima del umbral.");
        } else if (temperatura >= tempMin && temperatura <= tempMax) {
            System.out.println("La temperatura es adecuada.");
        } else {
            System.out.println("Advertencia: La temperatura está fuera del rango deseado.");
        }
      
    }
}