package sistem.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistem.Entidades.Compra;

/**
 * Nombre de la Clase: DaoCompra
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class DaoCompra extends Conexion implements CrudCompra
{
    PreparedStatement ps;
    ResultSet rs;
    Compra com;
    int res;

    @Override
    public ArrayList<Compra> mostrar() throws ClassNotFoundException,
            SQLException
    {
        ps= super.con().prepareStatement("SELECT id_compra, DATE_FORMAT(fecha,"
                + " '%d/%m/%y') AS fecha,total,iva FROM compra;");
        ArrayList<Compra> ar = new ArrayList<Compra>();
        try
        {
            rs = ps.executeQuery();
            while (rs.next())
            {            
                com = new Compra(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                ar.add(com);
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
    public int agregar(Compra comp) throws ClassNotFoundException, SQLException
    {
        ps = super.con().prepareStatement("insert into compra(fecha,total,iva) "
                + "values(?,?,?);");
        ps.setString(1, com.getFecha());
        ps.setDouble(2, com.getTotal());
        ps.setDouble(3, com.getIVA());
        try
        {
            res = ps.executeUpdate();
        } catch (Exception e)
        {
            
        }
        return res;
    }

    @Override
    public int modificar(Compra comp) throws ClassNotFoundException,
            SQLException
    {
        ps = super.con().prepareStatement("update compra set fecha=?,total=?,"
                + "iva=? where id_compra = ?");
        ps.setString(1, comp.getFecha());
        ps.setDouble(2, com.getTotal());
        ps.setDouble(3, com.getIVA());
        ps.setInt(4, com.getId_compra());
        try
        {
            res=ps.executeUpdate();
        } catch (Exception e)
        {
            
        }
        return res;
    }

    @Override
    public int eliminar(Compra comp) throws ClassNotFoundException, SQLException
    {
        ps = super.con().prepareStatement("delete from compra where "
                + "id_compra = ?");
        ps.setInt(1, comp.getId_compra());
        try
        {
            res=ps.executeUpdate();
        } catch (Exception e)
        {
            
        }
        return res;
    }
    
    
}
