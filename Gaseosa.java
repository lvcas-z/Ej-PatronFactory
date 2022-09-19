package PatronFactory;

public abstract class Gaseosa {
    private String nombre;
    private Double cantLitros;

    public Gaseosa(String nombre, Double cantLitros) {
        this.nombre = nombre;
        this.cantLitros = cantLitros;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getCantLitros() {
        return cantLitros;
    }
}
