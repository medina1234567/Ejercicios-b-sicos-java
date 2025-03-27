/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloInvernadero;
import Vista.VistaInvernadero;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControladorInvernadero {
     private VistaInvernadero vista;
    private ArrayList<ModeloInvernadero> historial;

    public ControladorInvernadero() {
        vista = new VistaInvernadero();
        historial = new ArrayList<>();
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            vista.mostrarMenu();
            int opcion = vista.scanner.nextInt();
            switch (opcion) {
                case 1:
                    registrarTemperatura();
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

    private void registrarTemperatura() {
        double temperatura = vista.pedirTemperatura();
        String estado;

        if (temperatura < 10) {
            estado = "Calefactor activado";
        } else if (temperatura > 25) {
            estado = "Ventilador activado";
        } else {
            estado = "Inactivo";
        }

        vista.mostrarMensaje("Estado del sistema: " + estado);
        historial.add(new ModeloInvernadero(temperatura, estado));
    }
}
