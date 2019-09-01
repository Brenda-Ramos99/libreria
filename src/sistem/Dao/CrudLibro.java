package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Libro;

/**
 * Nombre de la Interfaz: CrudLibro
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public interface CrudLibro
{
    ArrayList<Libro> mostrar() throws ClassNotFoundException,SQLException;
    public int agregar(Libro lib) throws ClassNotFoundException,SQLException;
    public int modificar(Libro lib) throws ClassNotFoundException,SQLException;
    public int eliminar(Libro lib) throws ClassNotFoundException,SQLException;
    public int eliminaLo(Libro lib) throws ClassNotFoundException,SQLException;
}
