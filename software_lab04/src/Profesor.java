import java.util.ArrayList;
import java.util.List;

public class Profesor extends Utilizator {
    private String departament;
    private List<Materie> materieriIncarcare;

    public Profesor(String idCont, String numeComplet, String departament) {
        super(idCont, numeComplet);
        this.departament = departament;
        this.materieriIncarcare = new ArrayList<>();
    }

    @Override
    public boolean autentificare(String password) {
        // Authentication logic for professor
        return validatePassword(password);
    }

    public void incarcareSuport(Materie materie) {
        // Logic for professor to upload course material
        if (materie != null) {
            materieriIncarcare.add(materie);
            System.out.println("Professor " + numeComplet + " uploaded support for " + materie.getDenumire());
        }
    }

    public void generareBorderoNota(Materie materie, BorderouNota borderu) {
        // Logic to generate grade report
        System.out.println("Generating grade report for " + materie.getDenumire());
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public List<Materie> getMaterieriIncarcare() {
        return materieriIncarcare;
    }

    public void addMaterie(Materie materie) {
        this.materieriIncarcare.add(materie);
    }

    private boolean validatePassword(String password) {
        // Password validation logic
        return password != null && !password.isEmpty();
    }
}