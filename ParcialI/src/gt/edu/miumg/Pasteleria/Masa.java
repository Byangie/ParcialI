package gt.edu.miumg.Pasteleria;

public class Masa implements Ingrediente{
    private String tipo;
    private int cantidad ;

    public Masa(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String ObtenerNombre() {
        return "Suave" + tipo;
    }

    @Override
    public int ObtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
