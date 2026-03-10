import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   School Management System Demo");
        System.out.println("========================================\n");

        // Create subjects/materials
        System.out.println("--- Creating Subjects ---");
        Materie matematica = new Materie("Matematica", 5, 30);
        Materie informatica = new Materie("Informatica", 6, 25);
        Materie fizica = new Materie("Fizica", 4, 28);
        System.out.println("✓ Created subjects: Matematica, Informatica, Fizica\n");

        // Create users
        System.out.println("--- Creating Users ---");

        // Students
        Student student1 = new Student("STU001", "Ana Popescu", "MAT2024001", 1);
        Student student2 = new Student("STU002", "Ion Vasile", "MAT2024002", 1);
        Student student3 = new Student("STU003", "Maria Mihai", "MAT2024003", 1);
        System.out.println("✓ Created students: Ana Popescu, Ion Vasile, Maria Mihai");

        // Professors
        Profesor profesor1 = new Profesor("PROF001", "Dr. Alexandru Ionescu", "Matematica");
        Profesor profesor2 = new Profesor("PROF002", "Dr. Carmen Dumitrescu", "Informatica");
        System.out.println("✓ Created professors: Dr. Alexandru Ionescu, Dr. Carmen Dumitrescu");

        // Secretary
        Secretar secretar = new Secretar("SEC001", "Grigore Moldovan", "Birou A1");
        System.out.println("✓ Created secretary: Grigore Moldovan");

        // IT Administrator
        AdministratorIT admin = new AdministratorIT("ADMIN001", "Vasile Popescu", 5);
        System.out.println("✓ Created IT Administrator: Vasile Popescu\n");

        // Authentication
        System.out.println("--- Authentication ---");
        boolean auth1 = student1.autentificare("password123");
        boolean auth2 = profesor1.autentificare("profesorPass");
        boolean auth3 = admin.autentificare("adminPass");
        System.out.println("✓ Student authentication: " + (auth1 ? "Success" : "Failed"));
        System.out.println("✓ Professor authentication: " + (auth2 ? "Success" : "Failed"));
        System.out.println("✓ Admin authentication: " + (auth3 ? "Success" : "Failed") + "\n");

        // Student enrollment
        System.out.println("--- Student Enrollment ---");
        student1.inscriereMaterial(matematica);
        student1.inscriereMaterial(informatica);
        student2.inscriereMaterial(fizica);
        student3.inscriereMaterial(matematica);
        System.out.println();

        // Professor operations
        System.out.println("--- Professor Operations ---");
        profesor1.addMaterie(matematica);
        profesor1.incarcareSuport(matematica);
        profesor2.addMaterie(informatica);
        profesor2.incarcareSuport(informatica);
        System.out.println();

        // Secretary allocates materials to professors
        System.out.println("--- Secretary Operations ---");
        secretar.alocareMaterial(profesor1, matematica);
        secretar.alocareMaterial(profesor2, informatica);
        System.out.println();

        // Create payments
        System.out.println("--- Student Payments ---");
        Date deadline = new Date(System.currentTimeMillis() + 30 * 24 * 60 * 60 * 1000); // 30 days from now
        Plata payment1 = new Plata("PAY001", 500.0f, "pending", deadline);
        Plata payment2 = new Plata("PAY002", 500.0f, "pending", deadline);
        Plata payment3 = new Plata("PAY003", 500.0f, "paid", deadline);

        payment1.procesarePlata();
        payment2.procesarePlata();
        payment3.procesarePlata();
        System.out.println();

        // Create catalogs (grade books)
        System.out.println("--- Creating Grade Catalogs ---");
        Catalog catalog = new Catalog("Matematica - Anul 1");
        System.out.println("✓ Created catalog: " + catalog.getNuUniversitar() + "\n");

        // Create grade reports
        System.out.println("--- Creating Grade Reports ---");
        BorderouNota gradeReport1 = new BorderouNota(new Date(), true);
        BorderouNota gradeReport2 = new BorderouNota(new Date(), true);

        gradeReport1.validareSemnatura();
        gradeReport2.validareSemnatura();
        System.out.println();

        // Register grades in catalog
        System.out.println("--- Registering Grades ---");
        secretar.introducereNota(catalog, gradeReport1);
        catalog.addStudentGrade(student1, 9.5f);
        catalog.addStudentGrade(student2, 8.0f);
        catalog.addStudentGrade(student3, 9.0f);
        System.out.println();

        // Generate class ranking
        System.out.println("--- Generating Class Rankings ---");
        List<Student> ranking = secretar.generareClasament(catalog);
        System.out.println("Class ranking completed for " + ranking.size() + " students\n");

        // View student information
        System.out.println("--- Student Information ---");
        student1.vizualizareSituatie();
        student1.vizualizarePlati();
        System.out.println();

        // Verify available spots in subjects
        System.out.println("--- Verifying Subject Capacity ---");
        matematica.verificareLocuri();
        informatica.verificareLocuri();
        fizica.verificareLocuri();
        System.out.println();

        // IT Administrator system management
        System.out.println("--- IT Administrator Operations ---");
        admin.gestionareCont(student1);
        admin.gestionareCont(profesor1);
        admin.mentinamereSistem();
        System.out.println();

        // Display summary
        System.out.println("========================================");
        System.out.println("   System Summary");
        System.out.println("========================================");
        System.out.println("Total Students: 3");
        System.out.println("Total Professors: 2");
        System.out.println("Total Staff: 1 (Secretary)");
        System.out.println("Total Administrators: 1");
        System.out.println("Total Subjects: 3");
        System.out.println("Total Payments Processed: 3");
        System.out.println("Total Catalogs: 1");
        System.out.println("========================================\n");

        System.out.println("✓ School Management System Demo Completed Successfully!");
    }
}