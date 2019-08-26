package sistem.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistem.Entidades.Detalle_compra;

/**
 * Nombre de la Clase: DaoDeta_Compra
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class DaoDeta_Compra extends Conexion implements CrudDetalle_compra
{
    PreparedStatement ps;
    ResultSet rs;
    Detalle_compra deta_compra;
    int res;

    @Override
    public ArrayList<Detalle_compra> mostrar() throws ClassNotFoundException, SQLException {
        ps= super.con().prepareStatement("select * from detalle_compra");
        ArrayList<Detalle_compra> ar = new ArrayList<Detalle_compra>();
        try
        {
            rs = ps.executeQuery();
            while (rs.next())
            {            
                deta_compra = new Detalle_compra(rs.getInt(1), rs.getInt(2),
                        rs.getInt(3),rs.getInt(4),rs.getDouble(5),
                        rs.getInt(6));
                ar.add(deta_compra);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",1);
        }
        finally
        {
            super.con().close();
        }
        return ar;
    }

    @Override
    public int agregar(Detalle_compra deta_comp) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int modificar(Detalle_compra deta_comp) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Detalle_compra deta_comp) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
