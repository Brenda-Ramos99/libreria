package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Editorial;

/**
 * Nombre de la Interfaz: CrudEditorial
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Eduardo R.
 */

public interface CrudEditorial 
{
     public ArrayList<Editorial> mostrar()throws ClassNotFoundException,
              SQLException;
      public int agregar(Editorial edit)throws ClassNotFoundException,SQLException;
      public int modificar(Editorial edit)throws ClassNotFoundException,SQLException;
      public int eliminar(Editorial edit)throws ClassNotFoundException,SQLException;
       public ArrayList<Editorial> llenarEditorial()throws ClassNotFoundException,
              SQLException;
}

