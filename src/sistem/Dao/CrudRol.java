package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Rol;

/**
 * Nombre de la Interfaz: CrudRol
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public interface CrudRol
{
    ArrayList<Rol> mostrar() throws ClassNotFoundException,SQLException;
    public int agregar(Rol rol) throws ClassNotFoundException,SQLException;
    public int modificar(Rol rol) throws ClassNotFoundException,SQLException;
    public int eliminar(Rol rol) throws ClassNotFoundException,SQLException;
}
