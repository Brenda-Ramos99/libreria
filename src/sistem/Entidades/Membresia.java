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

    public Membresia()
    {
        
    }

    public Membresia(int id_membresia, String fecha_validacion,
            String fecha_vencimiento)
    {
        this.id_membresia = id_membresia;
        this.fecha_validacion = fecha_validacion;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Membresia(int id_membresia)
    {
        this.id_membresia = id_membresia;
    }

    public int getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(int id_membresia) {
        this.id_membresia = id_membresia;
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
    
    
}
