/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Usuario
 */
public class Calculadora {
    private Operacion operacion;

    public double calcular(int opcion, double a, double b) {
        switch (opcion) {
            case 1:
                operacion = new Suma();
                break;
            case 2:
                operacion = new Resta();
                break;
            case 3:
                operacion = new Multiplicacion();
                break;
            case 4:
                operacion = new Division();
                break;
            default:
                System.out.println("Opción no válida.");
                return 0;
        }
        return operacion.ejecutar(a, b);
    }
}
