/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deteccionintrusos;

/**
 *
 * @author Usuario
 */


public class SensoresMovimiento {

    private boolean movimientoDetectado;

    public void activarSensor() {
        movimientoDetectado = Math.random() < 0.3;  
    }

    public boolean isMovimientoDetectado() {
        return movimientoDetectado;
    }
}


