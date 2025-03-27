/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Asiento;
import Modelo.Cine;
import Vista.VistaCine;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControladorCine {
   private Cine cine;
    private VistaCine vista;

    public ControladorCine(String nombreCine, int capacidad) {
        cine = new Cine(nombreCine, capacidad);
        vista = new VistaCine();
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            vista.mostrarMenu();
            int opcion = vista.leerOpcion();
            switch (opcion) {
                case 1 :
                    realizarReserva();
                    break;
                case 2 : 
                    vista.mostrarReservas(cine.getAsientos());
                break;
                case 3 :
                    continuar = false;
                    break;
                default :
                    vista.mostrarMensaje("Opción no válida.");
                    break;
            }
        }
    }

    private void realizarReserva() {
        int numeroAsiento = vista.pedirNumeroAsiento();
        ArrayList<Asiento> asientos = cine.getAsientos();
        if (numeroAsiento > 0 && numeroAsiento <= asientos.size()) {
            Asiento asiento = asientos.get(numeroAsiento - 1);
            if (!asiento.isOcupado()) {
                asiento.reservar();
                vista.mostrarMensaje("Reserva exitosa para el asiento " + numeroAsiento);
            } else {
                vista.mostrarMensaje("El asiento ya está ocupado.");
            }
        } else {
            vista.mostrarMensaje("Número de asiento inválido.");
        }
    } 
}
