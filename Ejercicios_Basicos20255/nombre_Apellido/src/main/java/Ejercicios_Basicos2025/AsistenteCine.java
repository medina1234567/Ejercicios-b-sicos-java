
package Ejercicios_Basicos2025;

   import java.util.Scanner;

    

 

public class AsistenteCine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la edad del usuario
        System.out.println("Por favor ingrese su edad:");
        int edad = scanner.nextInt();

        // Usamos el switch para recomendar películas según la edad
        String recomendacion;
        switch (edad) {
            case 0 ... 6: // Niños menores de 7 años
                recomendacion = "Recomendamos películas animadas y educativas aptas para todas las edades.";
                break;
            case 7 ... 17: // Niños y adolescentes (7 a 17 años)
                recomendacion = "Recomendamos películas familiares, como animaciones, aventuras y comedias familiares.";
                break;
            case 18 ... 30: // Adultos (18 a 30 años)
                recomendacion = "Recomendamos una variedad de géneros: acción, drama, comedia y ciencia ficción.";
                break;
            default: // Personas mayores de 30 años
                recomendacion = "Recomendamos películas clásicas y dramas que podrían ser de su interés.";
                break;
        }

        // Mostrar la recomendación
        System.out.println(recomendacion);

        
       
    }
}  


















}
