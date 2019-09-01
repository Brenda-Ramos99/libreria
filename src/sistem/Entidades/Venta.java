/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.Entidades;

/**
 *
 * @author Brenda Ramos
 */
public class Venta
{
    private int id_venta;
    private String fecha;
    private double IVA=0.13;
    private double total;
    private int estado;

    public Venta()
    {
        
    }

    public Venta(int id_venta, String fecha, double total, int estado)
    {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public Venta(int id_venta, String fecha, double total) {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.total = total;
    }

    
    public Venta(String fecha, double total, int estado) {
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public Venta(int id_venta)
    {
        this.id_venta = id_venta;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
