package gt.edu.miumg.Pasteleria;

public class Pastel extends Postre {
    private String tipoMasa;

    public Pastel(String tipoMasa,String nombre, String tamaño, int precio) {
        super("Chocolate", "Grande", 400);
        this.tipoMasa = tipoMasa;
        ingredientes.add(new Masa("suave", 2));
        ingredientes.add(new Cobertura("Hershey", 3));
        ingredientes.add(new Relleno("Nutella", 4));
    }

    @Override
    public String toString() {
        return "Pastel{" +
                "tipoMasa='" + tipoMasa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
