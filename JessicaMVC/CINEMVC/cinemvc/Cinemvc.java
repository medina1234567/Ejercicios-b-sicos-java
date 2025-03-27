/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinemvc;

import Controlador.ControladorCine;
import Vista.VistaCine;

/**
 *
 * @author Usuario
 */
public class Cinemvc {

  
    public static void main(String[] args) {
        VistaCine vista = new VistaCine();
        String nombreCine = vista.pedirNombreCine();
        ControladorCine controlador = new ControladorCine(nombreCine, 20);
        controlador.iniciar();
    }
    
}
