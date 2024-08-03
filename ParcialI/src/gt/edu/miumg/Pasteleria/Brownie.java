package gt.edu.miumg.Pasteleria;

public class Brownie extends Postre{
    private String tipoChocolate;

    public Brownie(String tipoChocolate ,String nombre, String tamaño, int precio) {
        super("Browniedeli", "pequeño", 20);
        this.tipoChocolate = tipoChocolate;
        ingredientes.add(new Masa("suave", 2));
        ingredientes.add(new Cobertura("Hershey", 3));
        ingredientes.add(new Relleno("Nutella", 4));
    }

    @Override
    public String toString() {
        return "Brownie{" +
                "tipoChocolate='" + tipoChocolate + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
