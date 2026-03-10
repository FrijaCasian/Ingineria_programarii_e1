public class Materie {
    private String denumire;
    private Integer credite;
    private Integer capacitateMax;

    public Materie(String denumire, Integer credite, Integer capacitateMax) {
        this.denumire = denumire;
        this.credite = credite;
        this.capacitateMax = capacitateMax;
    }

    public boolean verificareLocuri() {
        // Logic to verify if there are available spots
        System.out.println("Verifying available spots for " + denumire);
        return capacitateMax > 0;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Integer getCredite() {
        return credite;
    }

    public void setCredite(Integer credite) {
        this.credite = credite;
    }

    public Integer getCapacitateMax() {
        return capacitateMax;
    }

    public void setCapacitateMax(Integer capacitateMax) {
        this.capacitateMax = capacitateMax;
    }
}