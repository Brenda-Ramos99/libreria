/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import sistem.Entidades.Detalle_venta;

/**
 *
 * @author BymerGomez
 */
public interface CrudDetalle_venta
{
    ArrayList<Detalle_venta> mostrar() throws ClassNotFoundException,
            SQLException;
    public int agregar(Detalle_venta deta_venta) throws 
            ClassNotFoundException, SQLException;
    public int modificar(Detalle_venta deta_venta) throws 
            ClassNotFoundException,SQLException;
    public int eliminar(Detalle_venta deta_venta) throws 
            ClassNotFoundException, SQLException;
    public int eliminaLo(Detalle_venta deta_venta) throws 
            ClassNotFoundException,SQLException;
}
