/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Modelo {
    private double temperatura;
    private double humedad;
    private String estado;

    public Modelo(double temperatura, double humedad, String estado) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.estado = estado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public String getEstado() {
        return estado;
    }
}
