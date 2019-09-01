package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Autor;

/**
 * Nombre de interfaz: CrudAutor
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

public interface CrudAutor
{   
    ArrayList<Autor> mostrar() throws ClassNotFoundException,SQLException;
    public int agregar(Autor a) throws ClassNotFoundException,SQLException;
    public int modificar(Autor a) throws ClassNotFoundException,SQLException;
    public int eliminar(Autor a) throws ClassNotFoundException,SQLException;
    public int eliminaLo(Autor a) throws ClassNotFoundException,SQLException;
}
