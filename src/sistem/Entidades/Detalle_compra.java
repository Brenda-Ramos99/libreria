package sistem.Entidades;

/**
 * Nombre de la Clase: Detalle_compra
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class Detalle_compra
{
    private int id_detalle_compra;
    private int id_libro;//fk de libro
    private int id_compra;//fk de compra
    private int cantidad;
    private double precio;
    private double subtotal;
    private int estado;

    /*Método constructor vacío para inicializar la clase*/
    public Detalle_compra()
    {
        
    }

    /*Método constructor de todos los campos disponible para una instancia al 
    momento de mostrar todos los datos provenientes de la tabla detalle_compra
    en la base de datos*/

    public Detalle_compra(int id_detalle_compra, int id_libro, int id_compra,
            int cantidad, double precio, double subtotal, int estado)
    {
        this.id_detalle_compra = id_detalle_compra;
        this.id_libro = id_libro;
        this.id_compra = id_compra;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.estado = estado;
    }

    public Detalle_compra(int id_detalle_compra, int id_libro, int id_compra, int cantidad, double precio, double subtotal) {
        this.id_detalle_compra = id_detalle_compra;
        this.id_libro = id_libro;
        this.id_compra = id_compra;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }
    
    
    
    /*Método constructor de todos los campos necesarios para una instancia al 
    momento de insertar datos provenientes de la tabla detalle_compra en la
    base de datos (sin ID, ya que es autoincrementable)*/
    public Detalle_compra(int id_libro, int id_compra, int cantidad,
            double precio, double subtotal, int estado)    
    {
        this.id_libro = id_libro;
        this.id_compra = id_compra;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.estado = estado;
    }

    /*Método constructor para el ID del detalle_compra, necesario para realizar
    la eliminación de registros a la tabla detalle_compra en la base de datos*/
    public Detalle_compra(int id_detalle_compra) {
        this.id_detalle_compra = id_detalle_compra;
    }
    
    /*Métodos de acceso de la Clase*/
    public int getId_detalle_compra() {
        return id_detalle_compra;
    }

    public void setId_detalle_compra(int id_detalle_compra) {
        this.id_detalle_compra = id_detalle_compra;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
