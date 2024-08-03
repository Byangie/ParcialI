package gt.edu.miumg.Pasteleria;

public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender(){
        System.out.println("Encendiendo Equipo");
        estado = "Encendido";
    }
    public void apagar(){
        System.out.println("Apangando Equipo");
        estado = "Apagado";
    }
    public void reparar(){
        System.out.println("Reparando Equipo");
        estado = "Reparado";
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
