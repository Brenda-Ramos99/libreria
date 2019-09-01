package sistem.Entidades;

/**
 * Nombre de la Clase:Usuario
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

public class Usuario
{
    private int id_usuario;
    private String usuario;
    private String pass;
    private int edad;
    private String direccion;
    private int estado;
    private String id_rol;

    /*Método constructor vacío para inicializar la clase*/
    public Usuario()
    {
        
    }

    /*Método constructor de todos los campos disponible para una instancia al 
    momento de mostrar todos los datos provenientes de la tabla usuario en la 
    base de datos*/

    public Usuario(int id_usuario, String usuario, String pass, int edad,
            String direccion, int estado, String id_rol)
    {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.pass = pass;
        this.edad = edad;
        this.direccion = direccion;
        this.estado = estado;
        this.id_rol = id_rol;
    }

    public Usuario(int id_usuario, String usuario, String pass, int edad,
            String direccion, String id_rol)
    {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.pass = pass;
        this.edad = edad;
        this.direccion = direccion;
        this.id_rol = id_rol;
    }
    
    
    /*Método constructor de todos los campos necesarios para una instancia al 
    momento de insertar datos provenientes de la tabla usuario en la base de 
    datos (sin ID, ya que es autoincrementable)*/

    public Usuario(String usuario, String pass, int edad, String direccion,
            int estado, String id_rol)
    {
        this.usuario = usuario;
        this.pass = pass;
        this.edad = edad;
        this.direccion = direccion;
        this.estado = estado;
        this.id_rol = id_rol;
    }
    

    /*Método constructor para el ID del usuario, necesario para realizar la
    eliminación de registros a la tabla usuario en la base de datos*/
    public Usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /*Métodos de acceso de la Clase*/

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getId_rol() {
        return id_rol;
    }

    public void setId_rol(String id_rol) {
        this.id_rol = id_rol;
    }
}
