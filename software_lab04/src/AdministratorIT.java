public class AdministratorIT extends Utilizator {
    private Integer nivelAcces;

    public AdministratorIT(String idCont, String numeComplet, Integer nivelAcces) {
        super(idCont, numeComplet);
        this.nivelAcces = nivelAcces;
    }

    @Override
    public boolean autentificare(String password) {
        // Authentication logic for IT administrator
        return validatePassword(password);
    }

    public void gestionareCont(Utilizator utilizator) {
        // Logic to manage user accounts
        System.out.println("IT Administrator " + numeComplet + " managing account: " +
                utilizator.getIdCont());
    }

    public void mentinamereSistem() {
        // Logic for system maintenance
        System.out.println("IT Administrator " + numeComplet + " performing system maintenance");
    }

    public Integer getNivelAcces() {
        return nivelAcces;
    }

    public void setNivelAcces(Integer nivelAcces) {
        this.nivelAcces = nivelAcces;
    }

    private boolean validatePassword(String password) {
        // Password validation logic
        return password != null && !password.isEmpty();
    }
}