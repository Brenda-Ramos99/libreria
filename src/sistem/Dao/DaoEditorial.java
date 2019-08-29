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
import sistem.Entidades.Editorial;

/**
 *
 * @author BymerGomez
 */
public class DaoEditorial extends Conexion implements CrudEditorial
{
    PreparedStatement ps;
    ResultSet rs;
    Editorial edit;
    int res;

    @Override
    public ArrayList<Editorial> mostrar() throws ClassNotFoundException, SQLException {
        ps= super.con().prepareStatement("select * from editorial");
        ArrayList<Editorial> ar = new ArrayList<Editorial>();
        try
        {
            rs = ps.executeQuery();
            while (rs.next())
            {            
                edit = new Editorial(rs.getInt(1), rs.getString(2),
                        rs.getString(3),rs.getString(4),rs.getString(5));
                ar.add(edit);
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
    public int agregar(Editorial edit) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("insert into editorial(telefono,"
                + "nombre,pais,direccion) values(?,?,?,?);");
        ps.setString(1, edit.getTelefono());
        ps.setString(2, edit.getNombre());
        ps.setString(3, edit.getDireccion());
        ps.setString(4, edit.getDireccion());        
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
    public int modificar(Editorial edit) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("update editorialset telefono=?,"
                + "nombre=?,pais=?,direccion=? where id_editorial=?;");
        ps.setString(1, edit.getTelefono());
        ps.setString(2, edit.getNombre());
        ps.setString(3, edit.getDireccion());
        ps.setString(4, edit.getDireccion());
        ps.setInt(5, edit.getId_edit());
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
    public int eliminar(Editorial edit) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("delete from editorial where "
                + "id_editorial = ?");
        ps.setInt(1, edit.getId_edit());
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