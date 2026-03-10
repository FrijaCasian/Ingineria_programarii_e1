import java.util.ArrayList;
import java.util.List;

public class Secretar extends Utilizator {
    private String birou;

    public Secretar(String idCont, String numeComplet, String birou) {
        super(idCont, numeComplet);
        this.birou = birou;
    }

    @Override
    public boolean autentificare(String password) {
        // Authentication logic for secretary
        return validatePassword(password);
    }

    public void introducereNota(Catalog catalog, BorderouNota borderu) {
        // Logic to introduce grades into the catalog
        System.out.println("Secretary " + numeComplet + " entered grades into the system");
    }

    public void alocareMaterial(Profesor profesor, Materie materie) {
        // Logic to allocate material/subject to a professor
        System.out.println("Secretary " + numeComplet + " allocated material " +
                materie.getDenumire() + " to professor " + profesor.getNumeComplet());
    }

    public List<Student> generareClasament(Catalog catalog) {
        // Logic to generate class ranking
        System.out.println("Generating class ranking for catalog: " + catalog.getNuUniversitar());
        return new ArrayList<>();
    }

    public String getBirou() {
        return birou;
    }

    public void setBirou(String birou) {
        this.birou = birou;
    }

    private boolean validatePassword(String password) {
        // Password validation logic
        return password != null && !password.isEmpty();
    }
}