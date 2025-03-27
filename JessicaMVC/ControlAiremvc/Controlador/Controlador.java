
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Controlador {
    private Vista vista;
    private ArrayList<Modelo> historial;

    public Controlador() {
        vista = new Vista();
        historial = new ArrayList<>();
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            vista.mostrarMenu();
            int opcion = vista.scanner.nextInt();
            switch (opcion) {
                case 1:
                    registrarLectura();
                    break;
                case 2:
                    vista.mostrarHistorial(historial);
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    vista.mostrarEstado("Opción no válida.");
                    break;
            }
        }
    }

    private void registrarLectura() {
        double temperatura = vista.pedirTemperatura();
        double humedad = vista.pedirHumedad();
        String estado;

        if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
            estado = "Aire Acondicionado Activado";
        } else {
            estado = "Aire Acondicionado Apagado";
        }

        vista.mostrarEstado(estado);
        historial.add(new Modelo(temperatura, humedad, estado));
    }
}