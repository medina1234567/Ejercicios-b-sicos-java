/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlluces;

/**
 *
 * @author Usuario
 */

 public class Luces {
    private boolean encendidas;

    public void controlar(SensorLuz sensorLuz, SensorMovimiento sensorMov) {
        boolean esNoche = sensorLuz.getEsNoche();
        boolean hayMovimiento = sensorMov.getHayMovimiento();

        if (esNoche && hayMovimiento) {
            encender();
        } else {
            apagar();
        }
    }

    private void encender() {
        if (!encendidas) {
            encendidas = true;
            System.out.println("Las luces se han encendido.");
        } else {
            System.out.println("Las luces ya están encendidas.");
        }
    }

    private void apagar() {
        if (encendidas) {
            encendidas = false;
            System.out.println("Las luces se han apagado.");
        } else {
            System.out.println("Las luces ya están apagadas.");
        }
    }
}



