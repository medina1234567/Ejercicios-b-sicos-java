/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Invernadero;

/**
 *
 * @author Usuario
 */
public class Calefactor {
    private boolean encendido;

    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El calefactor se ha encendido.");
        }
    }

    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El calefactor se ha apagado.");
        }
    }
}


