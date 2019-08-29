package sistem.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import sistem.Entidades.Libro;

/**
 *
 * @author BymerGomez
 */
public class DaoLibro extends Conexion implements CrudLibro
{
    PreparedStatement ps;
    ResultSet rs;
    Libro libro;
    int res;

    @Override
    public ArrayList<Libro> mostrar() throws ClassNotFoundException,
            SQLException
    {
        ps = super.con().prepareStatement("select * from libro where estado=0;");
        ArrayList<Libro> ar = new ArrayList<Libro>();
        try
        {
            rs = ps.executeQuery();
            while (rs.next())
            {            
                libro = new Libro(rs.getInt(1), rs.getString(2),
                        rs.getInt(3),rs.getDouble(4),rs.getString(5),
                        rs.getString(6), rs.getInt(7),rs.getString(8),
                        rs.getString(9), rs.getString(10),rs.getString(11));
                ar.add(libro);
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
    public int agregar(Libro lib) throws ClassNotFoundException, SQLException
    {
        ps = super.con().prepareStatement("insert into libro (titulo,"
                + "existencias,precio,anio_public,tomo,estado,id_categoria,"
                + "id_autor,id_edit,id_membresia) values(?,?,?,?,?,?,(select "
                + "id_categoria from categoria where nombre_cat=?),(select "
                + "id_autor from autor where nombre=?),(select id_edit from "
                + "editorial where nombre=?),(select id_membresia from membresia"
                + " where tipo_membresia=?));");
        ps.setString(1, libro.getTitulo());
        ps.setInt(2, libro.getExistencias());
        ps.setDouble(3, libro.getPrecio());
        ps.setString(4, libro.getAnio_public());
        ps.setString(5, libro.getTomo());
        ps.setInt(6, libro.getEstado());
        ps.setString(7, libro.getId_categoria());
        ps.setString(8, libro.getId_autor());
        ps.setString(9, libro.getId_edit());
        //ps.setString(9, libro.getId_usuario());
        ps.setString(10, libro.getId_membresia());
        
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
    public int modificar(Libro lib) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("update libro set titulo=?,"
                + "existencias=?,precio=?,anio_public=?,tomo=?,estado=?,"
                + "id_categoria=?,id_autor=?,id_edit=?,id_membresia=? "
                + "where id_libro=?;");
        ps.setString(1, libro.getTitulo());
        ps.setInt(2, libro.getExistencias());
        ps.setDouble(3, libro.getPrecio());
        ps.setString(4, libro.getAnio_public());
        ps.setString(5, libro.getTomo());
        ps.setInt(6, libro.getEstado());
        ps.setString(7, libro.getId_categoria());
        ps.setString(8, libro.getId_autor());
        ps.setString(9, libro.getId_edit());
        //ps.setString(9, libro.getId_usuario());
        ps.setString(10, libro.getId_membresia());
        ps.setInt(11, libro.getId_libro());
        
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
    public int eliminar(Libro lib) throws ClassNotFoundException, SQLException {
        ps = super.con().prepareStatement("delete from libro where "
                + "id_libro = ?");
        ps.setInt(1, libro.getId_libro());
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
