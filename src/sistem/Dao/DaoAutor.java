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
 * @author Eduardo R.
 */
public class DaoAutor extends Conexion implements CrudAutor
{ PreparedStatement ps;
    ResultSet rs;
    Autor auto;
    int res;
    
    @Override
    public ArrayList<Autor> mostrarAutor() throws ClassNotFoundException, SQLException {
        ArrayList<Autor> ar=new ArrayList<Autor>();
        ps=super.con().prepareStatement("select * from autor");
        try {
            rs=ps.executeQuery();
            while(rs.next()){
               auto=new Autor(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
               ar.add(auto);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
           //ps.close();
           //rs.close();
           super.con().close();
        }
        return ar;
    }
    

    
    
    
    
    
    
    
    
     @Override
    public int agregar(Autor auto) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("insert into autor (nombre,seudonimo,genero,nacionalidad)"
                + "values(?,?,?,?)");
        ps.setString(1,auto.getNombre());
        ps.setString(2,auto.getSeudonimo());
        ps.setString(3,auto.getGenero());
        ps.setString(4,auto.getNacionalidad());
      
        try {
            res=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
          super.con().close();
        }
        return res;
    }
    
    @Override
    public int modificar(Autor auto )throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("update autor set nombre=?,seudonimo=?,genero=?,nacionalidad=?"
                + "where id_autor=?");
         ps.setString(1,auto.getNombre());
        ps.setString(2,auto.getGenero());
         ps.setString(3,auto.getSeudonimo());
        ps.setString(4,auto.getNacionalidad());
        ps.setInt(5,auto.getId_autor());
      
        try {
            res=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
          super.con().close();
        }
        return res;
    }
 
    
    
    
     @Override
    public int eliminar(Autor auto) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("delete from autor where id_autor=?");
       ps.setInt(1,auto.getId_autor());
        
        try {
            res=ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
          super.con().close();
        }
        return res;
    }
    
    @Override
    public ArrayList<Autor> llenarAutor() throws ClassNotFoundException, SQLException {
       ArrayList<Autor> autor= new ArrayList<Autor>();
         try {
        ps= super.con().prepareStatement("select nombre from autor");
        rs=ps.executeQuery();
             while (rs.next()) {
                 
                 auto=new Autor();
                 auto.setNombre(rs.getString(1));
                 autor.add(auto);
             }
    } catch (Exception e) 
    {
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
     finally
         {
         super.con().close();
         }
             
     return autor;
          
    }
    
    
    
    
    
    
    
    
    
    
}