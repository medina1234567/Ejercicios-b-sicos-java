/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelocalculadora;
import Vista.Vistacalculadora;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControladorCalculadora {
     private Vistacalculadora vista;
    private ArrayList<Modelocalculadora> historial;

    public ControladorCalculadora() {
        vista = new Vistacalculadora();
        historial = new ArrayList<>();
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            vista.mostrarMenu();
            int opcion = vista.scanner.nextInt();
            switch (opcion) {
    case 1:
        realizarOperacion();
        break;
    case 2:
        vista.mostrarHistorial(historial);
        break;
    case 3:
        continuar = false;
        break;
    default:
        vista.mostrarMensaje("Opción no válida.");
        break;
}
        }
        }
         private void realizarOperacion() {
        double numero1 = vista.pedirNumero("Ingrese el primer número: ");
        double numero2 = vista.pedirNumero("Ingrese el segundo número: ");
        String operador = vista.pedirOperador();
        double resultado = 0;

        switch (operador) {
            case "+" -> resultado = numero1 + numero2;
            case "-" -> resultado = numero1 - numero2;
            case "*" -> resultado = numero1 * numero2;
            case "/" -> resultado = numero2 != 0 ? numero1 / numero2 : Double.NaN;
            default -> vista.mostrarMensaje("Operador no válido.");
        }

        if (!Double.isNaN(resultado)) {
            vista.mostrarResultado(resultado);
            historial.add(new Modelocalculadora(numero1, numero2, operador, resultado));
        }
    }
}
