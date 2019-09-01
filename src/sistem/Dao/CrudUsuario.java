package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Usuario;

/**
 * Nombre de la Interfaz: CrudUsuario
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public interface CrudUsuario
{
    ArrayList<Usuario> mostrar() throws ClassNotFoundException,SQLException;
    public int agregar(Usuario usu) throws ClassNotFoundException,SQLException;
    public int modificar(Usuario usu) throws ClassNotFoundException,
            SQLException;
    public int eliminar(Usuario usu) throws ClassNotFoundException,SQLException;
    public int eliminaLo(Usuario usu) throws ClassNotFoundException,
            SQLException;
}
