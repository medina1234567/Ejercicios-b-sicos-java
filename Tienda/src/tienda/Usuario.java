/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author Usuario
 */



public class Usuario {
      private boolean tieneMembresia;
    private boolean esEmpleado;
    private boolean horarioAtencion;

    public Usuario(boolean tieneMembresia, boolean esEmpleado, boolean horarioAtencion) {
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
        this.horarioAtencion = horarioAtencion;
    }

    public boolean tieneMembresia() {
        return tieneMembresia;
    }

    public boolean esEmpleado() {
        return esEmpleado;
    }

    public boolean estaEnHorarioAtencion() {
        return horarioAtencion;
    }
}
