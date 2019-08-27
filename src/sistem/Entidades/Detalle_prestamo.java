package sistem.Entidades;

/**
 * Nombre de la Clase:
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

public class Detalle_prestamo
{
    private int id_detalle_prestamo;
    private int id_libro; //fk del código del libro prestado
    private int id_prestamo;//fk del codigo de prestamo generado
    private int cantidad;
    private double precio;
    private double subtotal;

    /*Método constructor vacío para inicializar la clase*/
    public Detalle_prestamo()
    {
        
    }

    /*Método constructor de todos los campos disponible para una instancia al 
    momento de mostrar todos los datos provenientes de la tabla detalle_prestamo
    en la base de datos*/

    public Detalle_prestamo(int id_detalle_prestamo, int id_libro,
            int id_prestamo, int cantidad, double precio, double subtotal)
    {
        this.id_detalle_prestamo = id_detalle_prestamo;
        this.id_libro = id_libro;
        this.id_prestamo = id_prestamo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }
    
    
    /*Método constructor de todos los campos necesarios para una instancia al 
    momento de insertar datos provenientes de la tabla detalle_prestamo en la 
    base de datos (sin ID, ya que es autoincrementable)*/
    public Detalle_prestamo(int id_libro, int id_prestamo, int cantidad,
            double precio, double subtotal)
    {
        this.id_libro = id_libro;
        this.id_prestamo = id_prestamo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
    }

    /*Método constructor para el ID del detalle de prestamo, necesario para
    realizar la eliminación de registros a la tabla detalle de prestamo en la
    base de datos*/
    public Detalle_prestamo(int id_detalle_prestamo) {
        this.id_detalle_prestamo = id_detalle_prestamo;
    }

    /*Métodos de acceso de la Clase*/

    public int getId_detalle_prestamo() {
        return id_detalle_prestamo;
    }

    public void setId_detalle_prestamo(int id_detalle_prestamo) {
        this.id_detalle_prestamo = id_detalle_prestamo;
    }

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
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
}
