

package Ejercicios_Basicos2025;

import java.util.Scanner;


 
public class Nombre_Apellido {

//    String Nombre;
  //  String Apellido;
    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner tomarDatos = new Scanner(System.in);      
    System.out.println("Por favor ingrese nombre:...");
    String nombre = tomarDatos.nextLine();
    
    System.out.println("Porfavor ingrese su apellido:...");
    String apellido= tomarDatos.nextLine();
    
    
    
    System.out.print("Bienvenido a clases "+ nombre+" "+apellido);
}

}
//2. Crear un programa con una variable entera "edad" y mostrar la edad:



public class Edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad al usuario
        System.out.println("Por favor ingrese su edad:");
        int edad = scanner.nextInt();

        // Mostrar el mensaje con la edad
        System.out.println("Tienes " + edad + " años.");

        
    }
}

//3. Definir una variable real "precio" y mostrar el precio de un artículo:


public class PrecioArticulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio al usuario
        System.out.println("Por favor ingrese el precio del artículo:");
        double precio = scanner.nextDouble();

        // Mostrar el precio
        System.out.println("El precio del artículo es $" + precio);

        
    }
}
//4. Crear un programa con una variable booleana "esEstudiante" y mostrar si el usuario es estudiante:


public class EsEstudiante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario si es estudiante
        System.out.println("¿Eres estudiante? (true/false):");
        boolean esEstudiante = scanner.nextBoolean();

        // Mostrar el resultado
        System.out.println("¿Es usted estudiante? [Verdadero/Falso]: " + esEstudiante);

        
    }
}

//5. Definir una variable de carácter "letra" y mostrar la letra asignada:


public class Letra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una letra
        System.out.println("Por favor ingrese una letra:");
        char letra = scanner.next().charAt(0);

        // Mostrar la letra asignada
        System.out.println("La letra asignada es: " + letra);

        
    }
}

     