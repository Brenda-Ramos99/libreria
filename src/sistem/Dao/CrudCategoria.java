package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Categoria;

/**
 * Nombre de la interfaz: CrudCategoria
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

public interface CrudCategoria
{
    ArrayList<Categoria> mostrar() throws ClassNotFoundException,SQLException;
    public int agregar(Categoria categ) throws ClassNotFoundException,
            SQLException;
    public int modificar(Categoria categ) throws ClassNotFoundException,
            SQLException;
    public int eliminar(Categoria categ) throws ClassNotFoundException,
            SQLException;
    public int eliminaLo(Categoria categ) throws ClassNotFoundException,
            SQLException;
}
