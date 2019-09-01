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
public class Membresia
{
    private int id_membresia;
    private String tipo_membresia;
    private String fecha_validacion;
    private String fecha_vencimiento;
    private double precio_membresia;
    private int id_usuario;
    private int estado;

    public Membresia()
    {
        
    }

    public Membresia(int id_membresia, String tipo_membresia,
            String fecha_validacion, String fecha_vencimiento,
            double precio_membresia, int id_usuario, int estado)
    {
        this.id_membresia = id_membresia;
        this.tipo_membresia = tipo_membresia;
        this.fecha_validacion = fecha_validacion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.precio_membresia = precio_membresia;
        this.id_usuario = id_usuario;
        this.estado = estado;
    }

    public Membresia(int id_membresia, String tipo_membresia,
            String fecha_validacion, String fecha_vencimiento,
            double precio_membresia, int id_usuario)
    {
        this.id_membresia = id_membresia;
        this.tipo_membresia = tipo_membresia;
        this.fecha_validacion = fecha_validacion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.precio_membresia = precio_membresia;
        this.id_usuario = id_usuario;
    }
    
    

    public Membresia(String tipo_membresia, String fecha_validacion,
            String fecha_vencimiento, double precio_membresia,
            int id_usuario, int estado)
    {
        this.tipo_membresia = tipo_membresia;
        this.fecha_validacion = fecha_validacion;
        this.fecha_vencimiento = fecha_vencimiento;
        this.precio_membresia = precio_membresia;
        this.id_usuario = id_usuario;
        this.estado = estado;
    }

    public Membresia(int id_membresia) {
        this.id_membresia = id_membresia;
    }

    public int getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(int id_membresia) {
        this.id_membresia = id_membresia;
    }

    public String getTipo_membresia() {
        return tipo_membresia;
    }

    public void setTipo_membresia(String tipo_membresia) {
        this.tipo_membresia = tipo_membresia;
    }

    public String getFecha_validacion() {
        return fecha_validacion;
    }

    public void setFecha_validacion(String fecha_validacion) {
        this.fecha_validacion = fecha_validacion;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public double getPrecio_membresia() {
        return precio_membresia;
    }

    public void setPrecio_membresia(double precio_membresia) {
        this.precio_membresia = precio_membresia;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
}
