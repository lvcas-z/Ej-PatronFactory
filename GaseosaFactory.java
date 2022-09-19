package PatronFactory;

public class GaseosaFactory {
    private static GaseosaFactory gf = new GaseosaFactory();

    private GaseosaFactory(){
    }

    public static GaseosaFactory getInstance(){
        return gf;
    }

    public static Gaseosa fabricarGaseosa(String nombreGaseosa){
        switch (nombreGaseosa) {
            case "uvaChica":
                return new GaseosaUva("Uva Drink", 1.5);
            case "uvaGrande":
                return new GaseosaUva("Uva Drink", 3.0);
            case "naranjaChica":
                return new GaseosaNaranja("Naranja Drink", 1.5);
            case "naranjaGrande":
                return new GaseosaNaranja("Naranja Drink", 3.0);
            default:
                System.out.println("Producto inexistente");
                return null;
        }
        }
}
