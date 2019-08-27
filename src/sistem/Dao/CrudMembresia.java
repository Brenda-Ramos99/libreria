
package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Membresia;

/**
 *
 * @author Brenda Ramos
 */
public interface CrudMembresia
{
    ArrayList<Membresia> mostrar() throws ClassNotFoundException,SQLException;
    public int agregar(Membresia memb) throws ClassNotFoundException,
            SQLException;
    public int modificar(Membresia memb) throws ClassNotFoundException,
            SQLException;
    public int eliminar(Membresia memb) throws ClassNotFoundException,
            SQLException;
}
