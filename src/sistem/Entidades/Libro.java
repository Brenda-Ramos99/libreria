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
    private String id_categoria;
    private String id_autor;
    private String id_edit;
    private String id_usuario;

    /*Método constructor vacío para inicializar la clase Libro*/
    public Libro()
    {
        
    }

    /*Método constructor de todos los campos disponible para una instancia al 
    momento de mostrar todos los datos provenientes de la tabña Libro en la 
    base de datos*/
    public Libro(int id_libro, String titulo, int existencias, double precio,
            String anio_public, String tomo, String id_categoria,
            String id_autor, String id_edit, String id_usuario)
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
        this.id_usuario = id_usuario;
    }

    /*Método constructor de todos los campos necesarios para una instancia al 
    momento de insertar datos provenientes de la tabla Libro en la base de 
    datos (sin ID, ya que es autoincrementable)*/
    public Libro(String titulo, int existencias, double precio,
            String anio_public, String tomo, String id_categoria,
            String id_autor, String id_edit, String id_usuario)
    {
        this.titulo = titulo;
        this.existencias = existencias;
        this.precio = precio;
        this.anio_public = anio_public;
        this.tomo = tomo;
        this.id_categoria = id_categoria;
        this.id_autor = id_autor;
        this.id_edit = id_edit;
        this.id_usuario = id_usuario;
    }

    /*Método constructor para el ID del Libro, necesario para realizar la 
    eliminación de registros a la tabla Libro en la base de datos*/
    public Libro(int id_libro)
    {
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

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getId_autor() {
        return id_autor;
    }

    public void setId_autor(String id_autor) {
        this.id_autor = id_autor;
    }

    public String getId_edit() {
        return id_edit;
    }

    public void setId_edit(String id_edit) {
        this.id_edit = id_edit;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }
    
}
