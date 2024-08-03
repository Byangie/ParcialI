package gt.edu.miumg.Pasteleria;

import java.util.ArrayList;
import java.util.List;

public abstract class Postre {
    private String nombre;
    private String tamaño;
    private int precio;
    protected List<Ingrediente> ingredientes = new ArrayList<>();

    public Postre(String nombre, String tamaño, int precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public void preparar() {
        System.out.println("Preparando Postre");
    }

    public void servir(){
        System.out.println("Servir Postre");
    }

    @Override
    public String toString() {
        return "Postre{" +
                "nombre='" + nombre + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", precio=" + precio +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
