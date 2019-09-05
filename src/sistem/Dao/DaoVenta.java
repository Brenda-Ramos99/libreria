package sistem.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistem.Entidades.Venta;

/**
 *
 * @author BymerGomez
 */
public class DaoVenta extends Conexion implements CrudVenta
{
    PreparedStatement ps;
    ResultSet rs;
    Venta venta;
    int res;

    @Override
    public ArrayList<Venta> mostrar() throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("select id_venta, fecha,total,iva from "
                + "venta where estado=0;");
        ArrayList<Venta> ar = new ArrayList<Venta>();        
        try {
            rs = ps.executeQuery();
            while (rs.next())
            {                
                venta = new Venta(rs.getInt(1), rs.getString(2),rs.getDouble(3));
                ar.add(venta);
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
    public int agregar(Venta vent) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("insert into venta "
                + "(fecha,total,iva) values(?,?,?);");
        ps.setString(1, venta.getFecha());
        ps.setDouble(2, venta.getTotal());
        ps.setDouble(3, venta.getIVA());
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
    public int modificar(Venta vent) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("update venta set fecha=?,total=?,"
                + "iva=? where id_venta=?;");
        ps.setString(1, venta.getFecha());
        ps.setDouble(2, venta.getTotal());
        ps.setDouble(3, venta.getIVA());
        ps.setInt(4, venta.getId_venta());
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
    public int eliminar(Venta vent) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("delete from venta where id_venta=?;");
        ps.setInt(1, venta.getId_venta());
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
    public int eliminaLo(Venta vent) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("update venta set estado=1 where "
                + "id_venta=?;");
        ps.setInt(1, venta.getId_venta());
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
}
