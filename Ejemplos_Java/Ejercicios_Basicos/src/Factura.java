
public class Factura {
       public static void main(String[] args) {

        // Asignación de valores a las variables
        String nombreCliente = "Jessica Valderrama";  
        String producto = "CREMAS"; 
        int cantidadProductos = 2;  
        double precioUnitario = 5000;  
        boolean esEstudiante = true;  
        char tipoCliente = 'A';  // 

        // Cálculos
        double subtotal = cantidadProductos * precioUnitario;  
        double impuesto = esEstudiante ? subtotal * 0.05 : subtotal * 0.13;  
        double total = subtotal + impuesto;  

        // Mostrar la factura
        System.out.println("--- Factura ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidadProductos);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Tipo de cliente: " + tipoCliente);
        System.out.println("Es estudiante: " + (esEstudiante ? "Sí" : "No"));
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Total a pagar: $" + total);
    }
}

