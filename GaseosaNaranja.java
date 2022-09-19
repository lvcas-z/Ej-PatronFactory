package PatronFactory;

public class GaseosaNaranja extends Gaseosa{
    private String codBarra;

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }
    public GaseosaNaranja(String nombre, Double cantLitros) {
        super(nombre, cantLitros);
    }
}
