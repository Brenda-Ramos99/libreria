package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Autor;

/**
 * Nombre de interfaz: CrudAutor
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Eduardo R.
 */

public interface CrudAutor
{   
  
      public ArrayList<Autor> mostrarAutor()throws ClassNotFoundException,
              SQLException;
      public int agregar(Autor aut)throws ClassNotFoundException,SQLException;
      public int modificar(Autor aut)throws ClassNotFoundException,SQLException;
      public int eliminar(Autor aut)throws ClassNotFoundException,SQLException;
      public ArrayList<Autor> llenarAutor()throws ClassNotFoundException,
              SQLException;
    
}
