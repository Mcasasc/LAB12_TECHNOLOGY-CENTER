package app.cursos.techcenter.model;

/**
 *
 * @author Marcia
 */
public class Pago {
    
    private String fechaPago;
    private double importePago;

    public Pago(String fechaPago, double importePago) {
        this.fechaPago = fechaPago;
        this.importePago = importePago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getImportePago() {
        return importePago;
    }

    public void setImportePago(double importePago) {
        this.importePago = importePago;
    }
    
}
