package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Detalle_prestamo;

/**
 * Nombre de la Interfaz: CrudDetalle_prestamo
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public interface CrudDetalle_prestamo
{
    ArrayList<Detalle_prestamo> mostrar() throws ClassNotFoundException,
            SQLException;
    public int agregar(Detalle_prestamo deta_presta) throws 
            ClassNotFoundException, SQLException;
    public int modificar(Detalle_prestamo deta_presta) throws 
            ClassNotFoundException,SQLException;
    public int eliminar(Detalle_prestamo deta_presta) throws 
            ClassNotFoundException, SQLException;
}
