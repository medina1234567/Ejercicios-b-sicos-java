package cine;

public class Silla {
   private boolean ocupado;

    public Silla() {
        this.ocupado = false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void ocupar() {
        this.ocupado = true;
    }

    public void desocupar() {
        this.ocupado = false;
    }
}
