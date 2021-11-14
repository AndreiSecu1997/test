package md.tekwill.lesson1;

public class Elev {

    String nume;
    int varsta;
    String gen;
    double notaMedie;
    //Acesta este un constructor care acceptă 2 parametri de intrare
    public Elev(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    //Această metodă asignează genul obiectului Elev
    public void seteazGen(String gen){
        this.gen = gen;
    }
    public void seteazăNotaMedie(double notaMedie){
        this.notaMedie = notaMedie;
    }

    //Aceasta metoda printeaza toate proprietatile obiectului Elev creat
    public String printezaObiectul() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", gen='" + gen + '\'' +
                ", notaMedie=" + notaMedie +
                '}';
    }
}
