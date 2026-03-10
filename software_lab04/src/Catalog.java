import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Catalog {
    private String nuUniversitar;
    private Map<Student, Float> noteStudenti;

    public Catalog(String nuUniversitar) {
        this.nuUniversitar = nuUniversitar;
        this.noteStudenti = new HashMap<>();
    }

    public void inregistrareOfficiaala(Student student, Float nota) {
        // Logic to officially register a student's grade
        noteStudenti.put(student, nota);
        System.out.println("Official registration for student " + student.getNumeComplet() +
                " with grade: " + nota);
    }

    public List<Student> calculClasamentAnual() {
        // Logic to calculate annual class ranking
        System.out.println("Calculating annual class ranking for: " + nuUniversitar);
        return new ArrayList<>(noteStudenti.keySet());
    }

    public String getNuUniversitar() {
        return nuUniversitar;
    }

    public void setNuUniversitar(String nuUniversitar) {
        this.nuUniversitar = nuUniversitar;
    }

    public Map<Student, Float> getNoteStudenti() {
        return noteStudenti;
    }

    public void addStudentGrade(Student student, Float nota) {
        this.noteStudenti.put(student, nota);
    }
}