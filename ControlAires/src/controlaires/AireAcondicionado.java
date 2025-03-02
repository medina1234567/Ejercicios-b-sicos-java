/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlaires;

/**
 *
 * @author Usuario
 */
public class AireAcondicionado {
  
    private boolean encendido;

    public void controlar(SensorTemperatura sensorTemp, SensorHumedad sensorHum) {
        double temperatura = sensorTemp.getTemperatura();
        double humedad = sensorHum.getHumedad();

        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            encender();
        } else {
            apagar();
        }
    }

    private void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println(" Aire acondicionado ENCENDIDO.");
        } else {
            System.out.println("ℹ️ El aire ya está encendido.");
        }
    }

    private void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println(" Aire acondicionado APAGADO.");
        } else {
            System.out.println("ℹ️ El aire ya está apagado.");
        }
    }
}


