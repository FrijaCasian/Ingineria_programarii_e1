import java.util.Date;

public class BorderouNota {
    private Date dataEmiterii;
    private Boolean aprobat;

    public BorderouNota(Date dataEmiterii, Boolean aprobat) {
        this.dataEmiterii = dataEmiterii;
        this.aprobat = aprobat;
    }

    public boolean validareSemnatura() {
        // Logic to validate signature on grade report
        System.out.println("Validating signature on grade report from: " + dataEmiterii);
        return aprobat != null && aprobat;
    }

    public Date getDataEmiterii() {
        return dataEmiterii;
    }

    public void setDataEmiterii(Date dataEmiterii) {
        this.dataEmiterii = dataEmiterii;
    }

    public Boolean getAprobat() {
        return aprobat;
    }

    public void setAprobat(Boolean aprobat) {
        this.aprobat = aprobat;
    }
}