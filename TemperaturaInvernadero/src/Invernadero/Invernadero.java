/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Invernadero;

/**
 *
 * @author Usuario
 */
public class Invernadero {
    private SensorTemperatura sensorTemperatura;
    private Calefactor calefactor;
    private Ventilador ventilador;

    public Invernadero() {
        sensorTemperatura = new SensorTemperatura();
        calefactor = new Calefactor();
        ventilador = new Ventilador();
    }

    public void actualizarTemperatura(double temperatura) {
        sensorTemperatura.setTemperatura(temperatura);
    }

    public void controlarSistema() {
        double temperatura = sensorTemperatura.getTemperatura();

        if (temperatura < 10) {
            activarCalefactor();
            desactivarVentilador();
        } else if (temperatura > 25) {
            desactivarCalefactor();
            activarVentilador();
        } else {
            desactivarCalefactor();
            desactivarVentilador();
            System.out.println("El sistema está en estado inactivo.");
        }
    }

    private void activarCalefactor() {
        calefactor.encender();
    }

    private void desactivarCalefactor() {
        calefactor.apagar();
    }

    private void activarVentilador() {
        ventilador.encender();
    }

    private void desactivarVentilador() {
        ventilador.apagar();
    }
}
    
