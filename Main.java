// clasa Utilizator
abstract class Utilizator {
    private String idCont;
    private String numeComplet;
    public Utilizator(String idCont, String numeComplet) {
        this.idCont = idCont;
        this.numeComplet = numeComplet;
    }
    public String getIdCont() {
        return idCont;
    }
    public String getNumeComplet() {
        return numeComplet;
    }
    public boolean autentificare(String idIntrodus) {
        boolean rezultat = this.idCont.equals(idIntrodus);
        if (rezultat == true) {
            System.out.println("Autentificare reusita pentru: " + numeComplet);
        } else {
            System.out.println("Autentificare esuata. ID incorect.");
        }
        return rezultat;
    }
    public abstract String getRol();
}

class Student extends Utilizator {
    private String numarMatricol;
    private int anStudiu;
    public Student(String idCont, String numeComplet, String numarMatricol, int anStudiu) {
        super(idCont, numeComplet);
        this.numarMatricol = numarMatricol;
        this.anStudiu = anStudiu;
    }
    @Override
    public String getRol() {
        return "Student";
    }
    public String getNumarMatricol() {
        return numarMatricol;
    }
}

public class Main {
    public static void main(String[] args) {
        Utilizator utilizator = new Student("12345", "Ion Popescu", "MATRICOL1234", 2);

        System.out.println("Utilizator: " + utilizator.getNumeComplet());
        System.out.println("Rol: " + utilizator.getRol());

        boolean succes = utilizator.autentificare("12345");
        boolean esuata = utilizator.autentificare("67890");
    }
}