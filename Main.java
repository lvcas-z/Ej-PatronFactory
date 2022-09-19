package PatronFactory;

public class Main {
    public static void main(String[] args) {
        GaseosaFactory drinkFactory= GaseosaFactory.getInstance();
        System.out.println("---SE CREAN LAS GASEOSAS---");
        Gaseosa g1Uva = drinkFactory.fabricarGaseosa("uvaChica");
        Gaseosa g2Uva = drinkFactory.fabricarGaseosa("uvaGrande");
        System.out.println(g2Uva.getNombre() +" "+ g2Uva.getCantLitros());
        Gaseosa g1Naranja = drinkFactory.fabricarGaseosa("naranjaChica");
        System.out.println(g1Naranja.getNombre() +" "+ g1Naranja.getCantLitros());
        Gaseosa g2Naranja = drinkFactory.fabricarGaseosa("naranjaGrande");
        System.out.println("---NO SE CREA LA GASEOSA YA QUE NO EXISTE LA CLASE---");
        Gaseosa g3Limon = drinkFactory.fabricarGaseosa("limonGrande");
    }
}
