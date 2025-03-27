/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ModeloSensor;
import Vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador {
    private Vista vista;
    private ModeloSensor[] sensores;
    private boolean alarmaActivada;

    public Controlador() {
        vista = new Vista();
        sensores = new ModeloSensor[3];
        for (int i = 0; i < sensores.length; i++) {
            sensores[i] = new ModeloSensor(false);
        }
        alarmaActivada = false;
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            vista.mostrarMenu();
            int opcion = vista.scanner.nextInt();
            switch (opcion) {
                case 1:
                    alarmaActivada = vista.pedirEstadoAlarma();
                    vista.mostrarMensaje("Alarma " + (alarmaActivada ? "activada" : "desactivada"));
                    break;
                case 2:
                    simularMovimiento();
                    verificarAlarma();
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

    private void simularMovimiento() {
        for (int i = 0; i < sensores.length; i++) {
            boolean estado = vista.pedirEstadoSensor("Sensor " + (i + 1));
            sensores[i].setActivo(estado);
        }
    }

    private void verificarAlarma() {
        int detectados = 0;
        for (ModeloSensor sensor : sensores) {
            if (sensor.isActivo()) {
                detectados++;
            }
        }
        if (alarmaActivada && detectados >= 2) {
            vista.mostrarMensaje("¡Alarma activada! Intruso detectado.");
        } else {
            vista.mostrarMensaje("Sistema en calma.");
        }
    }
}
