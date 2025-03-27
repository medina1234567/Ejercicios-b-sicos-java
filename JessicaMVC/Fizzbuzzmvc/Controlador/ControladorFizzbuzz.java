/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelofizzbuzz;
import Vista.VistaFizzbuzz;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ControladorFizzbuzz {
     private ArrayList<Modelofizzbuzz> resultados;
    private VistaFizzbuzz vista;

    public ControladorFizzbuzz() {
        resultados = new ArrayList<>();
        vista = new VistaFizzbuzz();
    }

    public void ejecutarFizzBuzz() {
        int limite = vista.pedirNumero();
        for (int i = 1; i <= limite; i++) {
            String resultado;
            if (i % 3 == 0 && i % 5 == 0) {
                resultado = "FizzBuzz";
            } else if (i % 3 == 0) {
                resultado = "Fizz";
            } else if (i % 5 == 0) {
                resultado = "Buzz";
            } else {
                resultado = String.valueOf(i);
            }
            resultados.add(new Modelofizzbuzz(i, resultado));
        }
        vista.mostrarResultado(resultados);
    }
}
