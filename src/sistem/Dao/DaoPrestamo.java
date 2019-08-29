package sistem.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistem.Entidades.Prestamo;

/**
 *
 * @author BymerGomez
 */
public class DaoPrestamo extends Conexion implements CrudPrestamo
{
    PreparedStatement ps;
    ResultSet rs;
    Prestamo presta;
    int res;

    @Override
    public ArrayList<Prestamo> mostrar() throws ClassNotFoundException,
            SQLException
    {
        ps=super.con().prepareStatement("select * from prestamo");
        ArrayList<Prestamo> ar = new ArrayList<Prestamo>();        
        try {
            rs = ps.executeQuery();
            while (rs.next())
            {                
                presta = new Prestamo(rs.getString(1),rs.getString(2),
                        rs.getDouble(3));
                ar.add(presta);
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
    public int agregar(Prestamo presta) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("insert into prestamo "
                + "(fecha_inicio,fecha_final,total) values(?,?,?);");
        ps.setString(1, presta.getFecha_inicio());
        ps.setString(2, presta.getFecha_final());
        ps.setDouble(3, presta.getTotal());
        
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
    public int modificar(Prestamo presta) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("update prestamo set fecha_inicio=?,"
                + "fecha_final=?,total=? where id_prestamo=?;");
        ps.setString(1, presta.getFecha_inicio());
        ps.setString(2, presta.getFecha_final());
        ps.setDouble(3, presta.getTotal());
        ps.setInt(4, presta.getId_prestamo());
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
    public int eliminar(Prestamo presta) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("delete from prestamo where "
                + "id_prestamo = ?");
        ps.setInt(1, presta.getId_prestamo());        
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