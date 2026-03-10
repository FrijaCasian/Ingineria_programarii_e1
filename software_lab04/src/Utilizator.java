public abstract class Utilizator {
    protected String idCont;
    protected String numeComplet;

    public Utilizator(String idCont, String numeComplet) {
        this.idCont = idCont;
        this.numeComplet = numeComplet;
    }

    public abstract boolean autentificare(String password);

    public String getIdCont() {
        return idCont;
    }

    public void setIdCont(String idCont) {
        this.idCont = idCont;
    }

    public String getNumeComplet() {
        return numeComplet;
    }

    public void setNumeComplet(String numeComplet) {
        this.numeComplet = numeComplet;
    }
}