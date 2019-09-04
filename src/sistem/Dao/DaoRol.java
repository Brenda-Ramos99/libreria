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
import sistem.Entidades.Rol;

/**
 *
 * @author BymerGomez
 */
public class DaoRol extends Conexion implements CrudRol
{
    PreparedStatement ps;
    ResultSet rs;
    Rol rol;
    int res;

    @Override
    public ArrayList<Rol> mostrar() throws ClassNotFoundException, SQLException
    {
        ps=super.con().prepareStatement("select id_rol,rol from rol where "
                + "estado=0;");
        ArrayList<Rol> ar = new ArrayList<Rol>();        
        try {
            rs = ps.executeQuery();
            while (rs.next())
            {                
                rol = new Rol(rs.getInt(1),rs.getString(2));
                ar.add(rol);
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
    public int agregar(Rol rol) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("insert into rol "
                + "(rol) values(?);");
        ps.setString(1, rol.getRol());        
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
    public int modificar(Rol rol) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("update rol set rol=? where id_rol=?"
                + ";");
        ps.setString(1, rol.getRol()); 
        ps.setInt(2, rol.getId_rol());
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
    public int eliminar(Rol rol) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("delete from rol where id_rol=?;");
        ps.setInt(1, rol.getId_rol());
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
    public int eliminaLo(Rol rol) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("update rol set estado=1 where "
                + "id_rol=?;");
        ps.setInt(1, rol.getId_rol());
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
