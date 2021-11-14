package md.tekwill.lesson1;

public class TestElevClass {

    public static void main(String[] args) {
        // Creează două obiecte Elev
        Elev elevIonel001 = new Elev("Ionel", 14);
        Elev elevVictoria = new Elev("Victoria", 14);

        // Invocă metodele din clasa Elev pentru fiecare obiect
        elevIonel001.seteazGen("Masculin");
        elevIonel001.seteazăNotaMedie(9.6);
        elevVictoria.notaMedie = 10.0;
        elevVictoria.gen = "Femenin";
        elevVictoria.seteazăNotaMedie(9.9);

        // Printarea informatiilor despre obiectele create
        System.out.printf("Nota lui Ionel este " + elevIonel001.notaMedie);
        System.out.println("Toate detaliile lui Ionel sunt: " + elevIonel001.printezaObiectul());
        System.out.println("Toate detaliile despre Victoria: " + elevVictoria);
    }
}
