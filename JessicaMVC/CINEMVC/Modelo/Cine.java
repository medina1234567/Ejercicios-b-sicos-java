/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cine {
     private String nombre;
    private ArrayList<Asiento> asientos;

    public Cine(String nombre, int capacidad) {
        this.nombre = nombre;
        asientos = new ArrayList<>();
        for (int i = 1; i <= capacidad; i++) {
            asientos.add(new Asiento(i));
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }
}
