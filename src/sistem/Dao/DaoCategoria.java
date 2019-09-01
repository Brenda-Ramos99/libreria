package sistem.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistem.Entidades.Categoria;

/**
 * Nombre de la Clase: DaoCategoria
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class DaoCategoria extends Conexion implements CrudCategoria
{
    PreparedStatement ps;
    ResultSet rs;
    Categoria cat;
    int res;

    @Override
    public ArrayList<Categoria> mostrar() throws ClassNotFoundException,
            SQLException
    {
        ArrayList<Categoria> ar = new ArrayList<Categoria>();
        ps = super.con().prepareStatement("select id_categoria,nombre_cat from "
                + "categoria");
        rs=ps.executeQuery();
        try
        {
            while (rs.next())
            {                
                cat = new Categoria(rs.getInt(1),rs.getString(2));
                ar.add(cat);
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
    public int agregar(Categoria categ) throws ClassNotFoundException,
            SQLException
    {
        ps=super.con().prepareStatement("insert into categoria(nombre_cat,estado) "
                + "values(?,?);");
        ps.setString(1, cat.getNombre_cat());
        ps.setInt(2, categ.getEstado());
        try
        {
            res=ps.executeUpdate();
        } catch (Exception e)
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
    public int modificar(Categoria categ) throws ClassNotFoundException,
            SQLException
    {
        ps=super.con().prepareStatement("update categoria set nombre_cat=?,"
                + "estado=? where id_categoria=?;");
        ps.setString(1, cat.getNombre_cat());
        ps.setInt(2, categ.getEstado());
        ps.setInt(3, cat.getId_categoria());
        
        try
        {
            res=ps.executeUpdate();
        } catch (Exception e)
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
    public int eliminar(Categoria categ) throws ClassNotFoundException,
            SQLException
    {
        ps=super.con().prepareStatement("delete from categoria where "
                + "id_categoria=?;");
        ps.setInt(1, cat.getId_categoria());
        try
        {
            res=ps.executeUpdate();
        } catch (Exception e)
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
    public int eliminaLo(Categoria categ) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("update categoria set estado=? where "
                + "id_categoria=?;");
        
        ps.setInt(1, categ.getEstado());
        ps.setInt(2, cat.getId_categoria());
        
        try
        {
            res=ps.executeUpdate();
        } catch (Exception e)
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
