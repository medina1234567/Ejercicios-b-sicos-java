package cine;

public class Sala {
   private Silla[] asientos;

    public Sala(int capacidad) {
        asientos = new Silla[capacidad];
        for (int i = 0; i < capacidad; i++) {
            asientos[i] = new Silla();
        }
    }

    public boolean reservarAsiento(int numeroAsiento) {
        if (asientos[numeroAsiento].isOcupado()) {
            return false; 
        } else {
            asientos[numeroAsiento].ocupar();
            return true; 
        }
    }

    public void mostrarEstado() {
        for (int i = 0; i < asientos.length; i++) {
            if (asientos[i].isOcupado()) {
                System.out.print("[X] "); 
            } else {
                System.out.print("[ ] "); 
            }
        }
        System.out.println();
    }
}
