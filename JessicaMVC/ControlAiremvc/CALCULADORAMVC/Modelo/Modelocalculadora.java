/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Modelocalculadora {
     private double numero1;
    private double numero2;
    private String operador;
    private double resultado;

    public Modelocalculadora(double numero1, double numero2, String operador, double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
        this.resultado = resultado;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public String getOperador() {
        return operador;
    }

    public double getResultado() {
        return resultado;
    }
}
