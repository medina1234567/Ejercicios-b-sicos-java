/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class ModeloInvernadero {
     private double temperatura;
    private String estado;

    public ModeloInvernadero(double temperatura, String estado) {
        this.temperatura = temperatura;
        this.estado = estado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public String getEstado() {
        return estado;
    }
}
