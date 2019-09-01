package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Venta;

/**
 *
 * @author Brenda Ramos
 */
public interface CrudVenta
{
    ArrayList<Venta> mostrar() throws ClassNotFoundException,SQLException;
    public int agregar(Venta vent) throws ClassNotFoundException,SQLException;
    public int modificar(Venta vent) throws ClassNotFoundException,SQLException;
    public int eliminar(Venta vent) throws ClassNotFoundException,SQLException;
    public int eliminaLo(Venta vent) throws ClassNotFoundException,SQLException;
}
