package PatronFactory;

public class GaseosaUva extends Gaseosa{
    private String codBarra;

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public GaseosaUva(String nombre, Double cantLitros) {
        super(nombre, cantLitros);
    }
}
