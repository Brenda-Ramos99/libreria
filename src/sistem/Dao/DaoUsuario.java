package sistem.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistem.Entidades.Usuario;

/**
 *
 * @author BymerGomez
 */
public class DaoUsuario extends Conexion implements CrudUsuario
{
    PreparedStatement ps;
    ResultSet rs;
    Usuario usu;
    int res;

    @Override
    public ArrayList<Usuario> mostrar() throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("select * from usuario");
        ArrayList<Usuario> ar = new ArrayList<Usuario>();        
        try {
            rs = ps.executeQuery();
            while (rs.next())
            {                
                usu = new Usuario(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getInt(4), rs.getString(5),
                        rs.getInt(6), rs.getString(7));
                ar.add(usu);
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
    public int agregar(Usuario usu) throws ClassNotFoundException, SQLException
    {
        ps = super.con().prepareStatement("insert into usuario "
                + "(usuario,pass,edad,direccion,estado,id_rol) values(?,SHA(?),"
                + "?,?,?,?;");
        ps.setString(1, usu.getUsuario());
        ps.setString(2, usu.getPass());
        ps.setInt(3, usu.getEdad());
        ps.setString(4, usu.getDireccion());
        ps.setInt(5, usu.getEstado());
        ps.setInt(6, usu.getId_rol());
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
    public int modificar(Usuario usu) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("update usuario set usuario=?,"
                + "pass=SHA(?),edad=?,direccion=?,estado=?,id_rol=? "
                + "where id_usuario=?;");
        ps.setString(1, usu.getUsuario());
        ps.setString(2, usu.getPass());
        ps.setInt(3, usu.getEdad());
        ps.setString(4, usu.getDireccion());
        ps.setInt(5, usu.getEstado());
        ps.setInt(6, usu.getId_rol());
        ps.setInt(7, usu.getId_usuario());
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
    public int eliminar(Usuario usu) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("delete from usuario where "
                + "id_usuario=?;");
        ps.setInt(1, usu.getId_usuario());
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
