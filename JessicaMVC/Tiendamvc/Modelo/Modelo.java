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
     private String nombre;
    private boolean tieneMembresia;
    private boolean esEmpleado;
    private boolean horarioValido;
    private String estadoAcceso;

    public Modelo(String nombre, boolean tieneMembresia, boolean esEmpleado, boolean horarioValido, String estadoAcceso) {
        this.nombre = nombre;
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
        this.horarioValido = horarioValido;
        this.estadoAcceso = estadoAcceso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadoAcceso() {
        return estadoAcceso;
    }
}
