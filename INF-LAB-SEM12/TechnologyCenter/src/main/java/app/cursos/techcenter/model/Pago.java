/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.cursos.techcenter.model;

/**
 *
 * @author Marcia
 */
public class Pago {
    String fechaPago;
    double importePago;

    public Pago() {
    }

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
