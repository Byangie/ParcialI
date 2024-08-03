package gt.edu.miumg.Pasteleria;

public class Cobertura implements Ingrediente{
    private String tipo;
    private int cantidad;

    public Cobertura(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String ObtenerNombre() {
        return "Cobertura" + tipo;
    }

    @Override
    public int ObtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Cobertura{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
