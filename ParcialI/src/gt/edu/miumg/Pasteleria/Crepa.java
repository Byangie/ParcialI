package gt.edu.miumg.Pasteleria;

public class Crepa extends Postre{
    private String tipoMasa;


    public Crepa(String tipoMasa, long tamaño, int precio) {
        super("Crepa Nutella", "Mediana", 300);
        this.tipoMasa = tipoMasa;
        ingredientes.add(new Masa("suave", 2));
        ingredientes.add(new Cobertura("Hershey", 3));
        ingredientes.add(new Relleno("Nutella", 4));
    }

    @Override
    public String toString() {
        return "Crepa{" +
                "tipoMasa='" + tipoMasa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
