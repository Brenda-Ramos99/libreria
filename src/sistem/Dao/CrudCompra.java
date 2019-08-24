package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Compra;

/**
 * Nombre de la Interfaz: CrudCompra
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public interface CrudCompra
{
    ArrayList<Compra> mostrar() throws ClassNotFoundException,SQLException;
    public int agregar(Compra comp) throws ClassNotFoundException,SQLException;
    public int modificar(Compra comp) throws ClassNotFoundException,
            SQLException;
    public int eliminar(Compra comp) throws ClassNotFoundException,SQLException;
}
