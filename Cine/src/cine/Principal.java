package cine;

import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
        Cine cine = new Cine(10); // Sala con 10 asientos
        cine.gestionarReservas();
    }
}
