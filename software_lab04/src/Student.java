import java.util.List;

public class Student extends Utilizator {
    private String numarMatricol;
    private Integer anStudiu;

    public Student(String idCont, String numeComplet, String numarMatricol, Integer anStudiu) {
        super(idCont, numeComplet);
        this.numarMatricol = numarMatricol;
        this.anStudiu = anStudiu;
    }

    @Override
    public boolean autentificare(String password) {
        // Authentication logic for student
        return validatePassword(password);
    }

    public void inscriereMaterial(Materie materie) {
        // Logic to register for a subject
        System.out.println("Student " + numeComplet + " registered for " + materie.getDenumire());
    }

    public void vizualizareSituatie() {
        // Logic to view student situation/grades
        System.out.println("Viewing situation for student: " + numeComplet);
    }

    public List<Plata> vizualizarePlati() {
        // Logic to view student payments
        System.out.println("Viewing payments for student: " + numeComplet);
        return null;
    }

    public String getNumarMatricol() {
        return numarMatricol;
    }

    public void setNumarMatricol(String numarMatricol) {
        this.numarMatricol = numarMatricol;
    }

    public Integer getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(Integer anStudiu) {
        this.anStudiu = anStudiu;
    }

    private boolean validatePassword(String password) {
        // Password validation logic
        return password != null && !password.isEmpty();
    }
}