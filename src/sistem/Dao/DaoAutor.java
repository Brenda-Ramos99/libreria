package sistem.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistem.Entidades.Autor;

/**
 * Nombre de la Clase: DaoAutor
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class DaoAutor extends Conexion implements CrudAutor
{
    PreparedStatement ps;
    ResultSet rs;
    Autor a;
    int res;

    @Override
    public ArrayList<Autor> mostrar() throws ClassNotFoundException,
            SQLException
    {
        ps= super.con().prepareStatement("select * from autor");
        ArrayList<Autor> ar = new ArrayList<Autor>();
        try
        {
            rs=ps.executeQuery();
            while (rs.next())
            {                
                a=new Autor(rs.getInt(1),rs.getString(2),rs.getString(3),
                rs.getString(4),rs.getString(5));
                ar.add(a);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            super.con().close();
        }
        return ar;
    }

    @Override
    public int agregar(Autor a) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("insert into autor(nombre, genero,"
                + " nacionalidad) values(?,?,?);");
        ps.setString(1, a.getNombre());
        ps.setString(2, a.getSeudonimo());
        ps.setString(3, a.getGenero());
        ps.setString(4, a.getNacionalidad());
        try
        {
            res=ps.executeUpdate();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",1);
        }
        finally
        {
            super.con().close();
        }
        return res;
    }

    @Override
    public int modificar(Autor a) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("update autor set nombre=?, seudonimo=?,"
                + " genero=?, nacionalidad=? where id_autor=?;");
        ps.setString(1, a.getNombre());
        ps.setString(2,a.getSeudonimo());
        ps.setString(3, a.getGenero());
        ps.setString(4, a.getNacionalidad());
        ps.setInt(5, a.getId_autor());
        
        try
        {
            res=ps.executeUpdate();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",1);
        }
        finally
        {
            super.con().close();
        }
        return res;
    }

    @Override
    public int eliminar(Autor a) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("delete from autor where id_autor=?;");
        ps.setInt(1, a.getId_autor());
        
        try
        {
            res=ps.executeUpdate();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",1);
        }
        finally
        {
            super.con().close();
        }
        return res;
    }
}
