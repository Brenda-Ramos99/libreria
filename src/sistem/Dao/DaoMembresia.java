package sistem.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistem.Entidades.Membresia;

/**
 *
 * @author BymerGomez
 */
public class DaoMembresia extends Conexion implements CrudMembresia
{
    PreparedStatement ps;
    ResultSet rs;
    Membresia membre;
    int res;

    @Override
    public ArrayList<Membresia> mostrar() throws ClassNotFoundException,
            SQLException
    {
        ps=super.con().prepareStatement("select * from membresia");
        ArrayList<Membresia> ar = new ArrayList<Membresia>();        
        try {
            rs = ps.executeQuery();
            while (rs.next())
            {                
                membre = new Membresia(rs.getString(1),rs.getString(2),
                        rs.getString(3), rs.getDouble(4), rs.getInt(5));
                ar.add(membre);
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
    public int agregar(Membresia memb) throws ClassNotFoundException,
            SQLException
    {
        ps = super.con().prepareStatement("insert into membresia "
                + "(tipo_membresia,fecha_validacion,fecha_vencimiento,"
                + "precio_membresia,id_usuario) values(?,?,?,?,?);");
        ps.setString(1, membre.getTipo_membresia());
        ps.setString(2, membre.getFecha_validacion());
        ps.setString(3, membre.getFecha_vencimiento());
        ps.setDouble(4, membre.getPrecio_membresia());
        ps.setInt(5, membre.getId_usuario());
        
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
    public int modificar(Membresia memb) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("update membresia set tipo_membresia=?"
                + ",fecha_validacion=?,fecha_vencimiento=?,precio_membresia=?,"
                + "id_usuario=? where id_membresia=?;");
        ps.setString(1, membre.getTipo_membresia());
        ps.setString(2, membre.getFecha_validacion());
        ps.setString(3, membre.getFecha_vencimiento());
        ps.setDouble(4, membre.getPrecio_membresia());
        ps.setInt(5, membre.getId_usuario());
        ps.setInt(6, membre.getId_membresia());
        
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
    public int eliminar(Membresia memb) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("delete from membresia where "
                + "id_membresia = ?");
        ps.setInt(1, membre.getId_membresia());
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
