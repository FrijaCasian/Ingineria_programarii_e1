import java.util.Date;

public class Plata {
    private String idTranzactie;
    private Float suma;
    private String status;
    private Date dataScadenta;

    public Plata(String idTranzactie, Float suma, String status, Date dataScadenta) {
        this.idTranzactie = idTranzactie;
        this.suma = suma;
        this.status = status;
        this.dataScadenta = dataScadenta;
    }

    public boolean procesarePlata() {
        // Logic to process payment
        System.out.println("Processing payment: " + idTranzactie + " for amount: " + suma);
        return true;
    }

    public String getIdTranzactie() {
        return idTranzactie;
    }

    public void setIdTranzactie(String idTranzactie) {
        this.idTranzactie = idTranzactie;
    }

    public Float getSuma() {
        return suma;
    }

    public void setSuma(Float suma) {
        this.suma = suma;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataScadenta() {
        return dataScadenta;
    }

    public void setDataScadenta(Date dataScadenta) {
        this.dataScadenta = dataScadenta;
    }
}