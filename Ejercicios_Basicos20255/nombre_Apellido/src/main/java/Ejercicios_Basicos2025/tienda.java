
package Ejercicios_Basicos2025;


    import java.util.Scanner;
public class tienda {
 
    
  

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precios base de los productos
        double precioA = 10;  // Alimentos
        double precioV = 5;  // Vestimenta
        double precioE = 100.0; // Electrónicos

        // Solicitar el tipo de producto y la cantidad
        System.out.println("Ingrese el tipo de producto que desea comprar (A - Alimentos, V - Vestimenta, E - Electrónicos):");
        char tipoProducto = scanner.next().charAt(0);
        
        System.out.println("Ingrese la cantidad de unidades:");
        int cantidad = scanner.nextInt();

        // Validar que la cantidad sea positiva
        if (cantidad <= 0) {
            System.out.println("La cantidad de unidades debe ser un número positivo.");
            scanner.close();
            return;  // Termina el programa si la cantidad es inválida
        }

        double precioUnitario = 0.0;
        double descuento = 0.0;
        
        // Selección del producto y cálculo de descuentos
        switch (tipoProducto) {
            case 'A': // Alimentos
                precioUnitario = precioA;
                descuento = 0.10; // 10% de descuento
                break;
            case 'V': // Vestimenta
                precioUnitario = precioV;
                descuento = 0.05; // 5% de descuento
                break;
            case 'E': // Electrónicos
                precioUnitario = precioE;
                descuento = 0.0; // No hay descuento
                break;
            default:
                System.out.println("Producto no válido.");
                scanner.close();
                return;  // Termina el programa si el tipo de producto no es válido
        }

        // Cálculo del costo total
        double costoSinDescuento = precioUnitario * cantidad;
        double costoConDescuento = costoSinDescuento * (1 - descuento);

        // Mostrar el resultado
        System.out.println("Costo sin descuento: $" + costoSinDescuento);
        System.out.println("Costo con descuento: $" + costoConDescuento);

        





    }

}
