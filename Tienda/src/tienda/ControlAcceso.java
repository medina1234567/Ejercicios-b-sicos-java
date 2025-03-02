/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;



/**
 *
 * @author Usuario
 */
public class ControlAcceso {
   public static void verificarAcceso(boolean tieneMembresia, boolean esEmpleado, boolean horarioAtencion) {
        Usuario cliente = new Usuario(tieneMembresia, esEmpleado, horarioAtencion);

        if ((cliente.tieneMembresia() && cliente.estaEnHorarioAtencion()) || cliente.esEmpleado()) {
            System.out.println("Acceso permitido a la tienda.");
        } else {
            System.out.println("Acceso denegado a la tienda.");
        }
    }
}
