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
public class Detalle_venta
{
    private int id_detalle_venta;
    private int cantidad;
    private double precio;
    private double subtotal;
    private int id_libro;
    private int id_venta;
    private int estado;

    public Detalle_venta()
    {
        
    }

    public Detalle_venta(int id_detalle_venta, int cantidad, double precio,
            double subtotal, int id_libro, int id_venta, int estado)
    {
        this.id_detalle_venta = id_detalle_venta;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.id_libro = id_libro;
        this.id_venta = id_venta;
        this.estado = estado;
    }

    public Detalle_venta(int id_detalle_venta, int cantidad, double precio,
            double subtotal, int id_libro, int id_venta) {
        this.id_detalle_venta = id_detalle_venta;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.id_libro = id_libro;
        this.id_venta = id_venta;
    }
    
    

    public Detalle_venta(int cantidad, double precio, double subtotal,
            int id_libro, int id_venta, int estado)
    {
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.id_libro = id_libro;
        this.id_venta = id_venta;
        this.estado = estado;
    }

    
    public Detalle_venta(int id_detalle_venta)
    {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
}
