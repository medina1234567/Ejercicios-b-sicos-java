/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deteccionintrusos;

/**
 *
 * @author Usuario
 */
public class SistemaSeguridadd {
    private SensoresMovimiento sensor1;
    private SensoresMovimiento sensor2;
    private SensoresMovimiento sensor3;
    private boolean alarmaActivada;

    public SistemaSeguridadd() {
        sensor1 = new SensoresMovimiento();
        sensor2 = new SensoresMovimiento();
        sensor3 = new SensoresMovimiento();
        alarmaActivada = false;
    }

    public void configurarAlarma(boolean activar) {
        alarmaActivada = activar;
        if (activar) {
            System.out.println("La alarma está activada.");
        } else {
            System.out.println("La alarma está desactivada.");
        }
    }

    public void simularIntruso() {
        
        sensor1.activarSensor();
        sensor2.activarSensor();
        sensor3.activarSensor();

        int sensoresActivos = 0;
        if (sensor1.isMovimientoDetectado()) sensoresActivos++;
        if (sensor2.isMovimientoDetectado()) sensoresActivos++;
        if (sensor3.isMovimientoDetectado()) sensoresActivos++;

        System.out.println("Sensor 1: " + (sensor1.isMovimientoDetectado() ? "Movimiento detectado" : "Sin movimiento"));
        System.out.println("Sensor 2: " + (sensor2.isMovimientoDetectado() ? "Movimiento detectado" : "Sin movimiento"));
        System.out.println("Sensor 3: " + (sensor3.isMovimientoDetectado() ? "Movimiento detectado" : "Sin movimiento"));

       
        if (sensoresActivos >= 2 && alarmaActivada) {
            System.out.println("¡Alerta! Intruso detectado. La alarma ha sonado.");
        } else {
            System.out.println("El sistema está en calma.");
        }
    }
}


