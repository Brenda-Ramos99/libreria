package sistem.Entidades;

/**
 * Nombre de la Clase: Libro
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

public class Libro
{
    private int id_libro;
    private String titulo;
    private int existencias;
    private double precio;
    private String anio_public;
    private String tomo;
    private int id_categoria;
    private int id_autor;
    private int id_edit;
    //private String id_usuario;
    private int id_membresia;
    private int estado;
    

    /*Método constructor vacío para inicializar la clase Libro*/
    public Libro()
    {
        
    }

    /*Método constructor de todos los campos disponible para una instancia al 
    momento de mostrar todos los datos provenientes de la tabña Libro en la 
    base de datos*/

    public Libro(int id_libro, String titulo, int existencias, double precio,
            String anio_public, String tomo, int id_categoria, int id_autor,
            int id_edit, int id_membresia, int estado)
    {
        this.id_libro = id_libro;
        this.titulo = titulo;
        this.existencias = existencias;
        this.precio = precio;
        this.anio_public = anio_public;
        this.tomo = tomo;
        this.id_categoria = id_categoria;
        this.id_autor = id_autor;
        this.id_edit = id_edit;
        this.id_membresia = id_membresia;
        this.estado = estado;
    }

    public Libro(int id_libro, String titulo, int existencias, double precio,
            String anio_public, String tomo, int id_categoria, int id_autor,
            int id_edit, int id_membresia)
    {
        this.id_libro = id_libro;
        this.titulo = titulo;
        this.existencias = existencias;
        this.precio = precio;
        this.anio_public = anio_public;
        this.tomo = tomo;
        this.id_categoria = id_categoria;
        this.id_autor = id_autor;
        this.id_edit = id_edit;
        this.id_membresia = id_membresia;
    }
    
    
    /*Método constructor de todos los campos necesarios para una instancia al 
    momento de insertar datos provenientes de la tabla Libro en la base de 
    datos (sin ID, ya que es autoincrementable)*/
    public Libro(String titulo, int existencias, double precio,
            String anio_public, String tomo, int id_categoria, int id_autor,
            int id_edit, int id_membresia, int estado)
    {    
        this.titulo = titulo;
        this.existencias = existencias;
        this.precio = precio;
        this.anio_public = anio_public;
        this.tomo = tomo;
        this.id_categoria = id_categoria;
        this.id_autor = id_autor;
        this.id_edit = id_edit;
        this.id_membresia = id_membresia;
        this.estado = estado;
    }

    /*Método constructor para el ID del Libro, necesario para realizar la
    eliminación de registros a la tabla Libro en la base de datos*/
    public Libro(int id_libro) {
        this.id_libro = id_libro;
    }

    /*Métodos de acceso de la Clase*/

    public int getId_libro() {
        return id_libro;
    }

    public void setId_libro(int id_libro) {
        this.id_libro = id_libro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAnio_public() {
        return anio_public;
    }

    public void setAnio_public(String anio_public) {
        this.anio_public = anio_public;
    }

    public String getTomo() {
        return tomo;
    }

    public void setTomo(String tomo) {
        this.tomo = tomo;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public int getId_edit() {
        return id_edit;
    }

    public void setId_edit(int id_edit) {
        this.id_edit = id_edit;
    }

    public int getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(int id_membresia) {
        this.id_membresia = id_membresia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
