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
    public ArrayList<Detalle_compra> mostrar() throws ClassNotFoundException,
            SQLException
    {
        ps= super.con().prepareStatement("select * from detalle_compra");
        ArrayList<Detalle_compra> ar = new ArrayList<Detalle_compra>();
        try
        {
            rs = ps.executeQuery();
            while (rs.next())
            {            
                deta_compra = new Detalle_compra(rs.getInt(1), rs.getInt(2),
                        rs.getInt(3),rs.getInt(4),rs.getDouble(5),
                        rs.getDouble(6));
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
    public int agregar(Detalle_compra deta_comp) throws ClassNotFoundException,
            SQLException
    {
        ps = super.con().prepareStatement("insert into detalle_compra(id_liro,"
                + "id_compra,cantidad,precio,sutotal) values(?,?,?);");
        ps.setInt(1, deta_compra.getId_libro());
        ps.setInt(2, deta_compra.getId_compra());
        ps.setInt(3, deta_compra.getCantidad());
        ps.setDouble(4, deta_compra.getPrecio());
        ps.setDouble(5, deta_compra.getSubtotal());
        try
        {
            res = ps.executeUpdate();
        } catch (Exception e)
        {
            
        }
        return res;
    }

    @Override
    public int modificar(Detalle_compra deta_comp) throws ClassNotFoundException,
            SQLException
    {
        ps = super.con().prepareStatement("update detalle_compra set id_liro=?,"
                + "id_compra=?,cantidad=?,precio=?,sutotal=? where "
                + "id_detalle_compra=?;");
        ps.setInt(1, deta_compra.getId_libro());
        ps.setInt(2, deta_compra.getId_compra());
        ps.setInt(3, deta_compra.getCantidad());
        ps.setDouble(4, deta_compra.getPrecio());
        ps.setDouble(5, deta_compra.getSubtotal());
        ps.setInt(6, deta_compra.getId_detalle_compra());
        try
        {
            res = ps.executeUpdate();
        } catch (Exception e)
        {
            
        }
        return res;
    }

    @Override
    public int eliminar(Detalle_compra deta_comp) throws ClassNotFoundException,
            SQLException
    {
        ps = super.con().prepareStatement("delete from compra where "
                + "id_detalle_compra = ?");
        ps.setInt(1, deta_compra.getId_detalle_compra());
        try
        {
            res=ps.executeUpdate();
        } catch (Exception e)
        {
            
        }
        return res;
    }
    
    
}
