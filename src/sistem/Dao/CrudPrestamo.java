package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Prestamo;

/**
 * Nombre de la Interfaz: CrudPrestamo
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public interface CrudPrestamo
{
    ArrayList<Prestamo> mostrar() throws ClassNotFoundException,SQLException;
    public int agregar(Prestamo presta) throws ClassNotFoundException,
            SQLException;
    public int modificar(Prestamo presta) throws ClassNotFoundException,
            SQLException;
    public int eliminar(Prestamo presta) throws ClassNotFoundException,
            SQLException;
    public int eliminaLo(Prestamo presta) throws ClassNotFoundException,
            SQLException;
}
