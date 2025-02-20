
 
   package Principal.java;

import java.util.Scanner;

public class NombreApellido {


    
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner tomarDatos = new Scanner(System.in);      
    System.out.println(" ingrese nombre:...");
    String nombre = tomarDatos.nextLine();
    
    System.out.println("ingrese su apellido:...");
    String apellido= tomarDatos.nextLine();
    
    
    
    System.out.print("Bienvenido a clases "+ nombre+" "+apellido);
    }
}
