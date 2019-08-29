/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistem.Entidades.Detalle_venta;

/**
 *
 * @author BymerGomez
 */
public class DaoDeta_Venta extends Conexion implements CrudDetalle_venta
{
    PreparedStatement ps;
    ResultSet rs;
    Detalle_venta deta_venta;
    int res;

    @Override
    public ArrayList<Detalle_venta> mostrar() throws ClassNotFoundException,
            SQLException
    {
        ps= super.con().prepareStatement("select * from detalle_venta");
        ArrayList<Detalle_venta> ar = new ArrayList<Detalle_venta>();
        try
        {
            rs = ps.executeQuery();
            while (rs.next())
            {            
                deta_venta = new Detalle_venta(rs.getInt(1), rs.getInt(2),
                        rs.getDouble(3),rs.getDouble(4),rs.getInt(5),
                        rs.getInt(6));
                ar.add(deta_venta);
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
    public int agregar(Detalle_venta deta_venta) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("insert into detalle_venta(cantidad,"
                + "precio,sutotal,id_libro,id_venta) values(?,?,?,?,?);");
        ps.setInt(1, deta_venta.getCantidad());
        ps.setDouble(2, deta_venta.getPrecio());
        ps.setDouble(3, deta_venta.getSubtotal());
        ps.setInt(4, deta_venta.getId_libro());
        ps.setInt(5, deta_venta.getId_venta());
        try
        {
            res = ps.executeUpdate();
        } catch (Exception e)
        {
            
        }
        finally
        {
            super.con().close();
        }
        return res;
    }

    @Override
    public int modificar(Detalle_venta deta_venta) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("update detalle_venta set cantidad=?,"
                + "precio=?,sutotal=?,id_libro=?,id_venta=? where "
                + "id_detalle_venta=?;");
        ps.setInt(1, deta_venta.getCantidad());
        ps.setDouble(2, deta_venta.getPrecio());
        ps.setDouble(3, deta_venta.getSubtotal());
        ps.setInt(4, deta_venta.getId_libro());
        ps.setInt(5, deta_venta.getId_libro());
        ps.setInt(6, deta_venta.getId_detalle_venta());
        try
        {
            res = ps.executeUpdate();
        } catch (Exception e)
        {
            
        }
        finally
        {
            super.con().close();
        }
        return res;
    }

    @Override
    public int eliminar(Detalle_venta deta_venta) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("delete from detalle_venta where "
                + "id_detalle_compra = ?");
        ps.setInt(1, deta_venta.getId_detalle_venta());
        try
        {
            res=ps.executeUpdate();
        } catch (Exception e)
        {
            
        }
        finally
        {
            super.con().close();
        }
        return res;
    }
    
}
