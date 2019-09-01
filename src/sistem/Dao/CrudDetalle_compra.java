package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Detalle_compra;

/**
 * Nombre de la Interfaz: CrudDetalle_compra
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public interface CrudDetalle_compra
{
    ArrayList<Detalle_compra> mostrar() throws ClassNotFoundException,
            SQLException;
    public int agregar(Detalle_compra deta_comp) throws ClassNotFoundException,
            SQLException;
    public int modificar(Detalle_compra deta_comp) throws 
            ClassNotFoundException,SQLException;
    public int eliminar(Detalle_compra deta_comp) throws ClassNotFoundException,
            SQLException;
    public int eliminaLo(Detalle_compra deta_comp) throws 
            ClassNotFoundException,SQLException;
}
