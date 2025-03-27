/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Controlador {
    private Vista vista;
    private ArrayList<Modelo> historial;

    public Controlador() {
        vista = new Vista();
        historial = new ArrayList<>();
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            vista.mostrarMenu();
            int opcion = vista.scanner.nextInt();
            vista.scanner.nextLine();
            switch (opcion) {
                case 1:
                    registrarAcceso();
                    break;
                case 2:
                    vista.mostrarHistorial(historial);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    vista.mostrarEstado("Opción no válida.");
                    break;
            }
        }
    }

    private void registrarAcceso() {
        String nombre = vista.pedirNombre();
        boolean tieneMembresia = vista.pedirMembresia();
        boolean esEmpleado = vista.pedirEmpleado();
        boolean horarioValido = vista.pedirHorarioValido();

        String estado;
        if ((tieneMembresia && horarioValido) || esEmpleado) {
            estado = "Acceso Permitido";
        } else {
            estado = "Acceso Denegado";
        }

        vista.mostrarEstado(estado);
        historial.add(new Modelo(nombre, tieneMembresia, esEmpleado, horarioValido, estado));
    }
}
