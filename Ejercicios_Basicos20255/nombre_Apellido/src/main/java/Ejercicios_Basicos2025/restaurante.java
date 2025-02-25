
package Ejercicios_Basicos2025;

import java.util.Scanner;
public class restaurante {
    


public class MenuRestaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precios de los platos y bebidas
        double precioPlato1 = 10.0;
        double precioPlato2 = 12.5;
        double precioBebida1 = 3.0;
        double precioBebida2 = 2.5;

        // Variables para el total
        double total = 0;

        // Solicitar platos
        System.out.println("Seleccione un plato (1: Plato1 - $10.0, 2: Plato2 - $12.5):");
        int plato = scanner.nextInt();
        if (plato == 1) total += precioPlato1;
        else if (plato == 2) total += precioPlato2;

        // Solicitar bebidas
        System.out.println("Seleccione una bebida (1: Bebida1 - $3.0, 2: Bebida2 - $2.5):");
        int bebida = scanner.nextInt();
        if (bebida == 1) total += precioBebida1;
        else if (bebida == 2) total += precioBebida2;

        // Solicitar método de pago
        System.out.println("Seleccione el método de pago (1: Efectivo, 2: Tarjeta de crédito, 3: Cheque):");
        int metodoPago = scanner.nextInt();
        double descuento = 0;
        
        switch (metodoPago) {
            case 1: // Efectivo
                descuento = 0.1; // 10% de descuento
                break;
            case 2: // Tarjeta de crédito
                descuento = 0.05; // 5% de descuento
                break;
            case 3: // Cheque
                descuento = 0.07; // 7% de descuento
                break;
            default:
                System.out.println("Método de pago no válido.");
                scanner.close();
                return;
        }

        // Aplicar el descuento
        double totalConDescuento = total * (1 - descuento);

        // Mostrar el total
        System.out.println("Total sin descuento: $" + total);
        System.out.println("Total con descuento: $" + totalConDescuento);

    }





}

}