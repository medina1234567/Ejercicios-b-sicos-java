/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Usuario extends Persona{
     private int id;

    public Usuario(String nombre, int edad, int id) {
        super(nombre, edad);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
