package gt.edu.miumg.Pasteleria;

public class Cheesecake extends Postre{
    private String tipoQueso;


    public Cheesecake(String tipoQueso, String nombre, String tamaño, int precio) {
        super("vainilla", "pequeño", 20);
        this.tipoQueso = tipoQueso;
        ingredientes.add(new Masa("suave", 2));
        ingredientes.add(new Cobertura("Hershey", 3));
        ingredientes.add(new Relleno("Nutella", 4));
    }

    @Override
    public String toString() {
        return "Cheesecake{" +
                "tipoQueso='" + tipoQueso + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
