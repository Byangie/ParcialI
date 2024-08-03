package gt.edu.miumg.Pasteleria;

public class Relleno implements Ingrediente{
    private String sabor;
    private int cantidad;

    public Relleno(String sabor, int cantidad) {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }


    @Override
    public String ObtenerNombre() {
        return "Chocolate" + sabor;
    }

    @Override
    public int ObtenerCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Relleno{" +
                "sabor='" + sabor + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
