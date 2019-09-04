/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.LogicaNegocio;
import sistem.Dao.*;
import sistem.Entidades.Libro;
import javax.swing.table.*;
import java.util.*;
import javax.swing.JOptionPane;



/**
 *
 * @author Eduardo Recinos
 * 
 */
public class TransLibro

{
    Libro lbr;
    DaoLibro ob=new DaoLibro();
    public DefaultTableModel datos(){
         ArrayList<Libro> ar=new ArrayList<Libro>();
         String[] title={"Id","Titulo","Existencias","Precio","Publicacion","Tomo","Categoria","Autor","Editorial","Membresia"};
         DefaultTableModel tm=new DefaultTableModel(title, 0);
         Object[] row=new Object[10];
         try {
             ar.addAll(ob.mostrar());
             for(Libro v:ar){
                row[0]=v.getId_libro();
                row[1]=v.getTitulo();
                row[2]=v.getExistencias();
                row[3]=v.getPrecio();
                row[4]=v.getAnio_public();
                row[5]=v.getTomo();
                row[6]=v.getId_categoria();
                row[7]=v.getId_autor();
                row[8]=v.getId_edit();
                row[9]=v.getId_membresia();
                
               
                tm.addRow(row);
             }
             
        } catch (Exception e) {
        }
        return tm;
    }
   
     public void agregar (String titulo,String existencias, String precio, String anio_public, String tomo
     ,String id_categoria,String id_autor,String id_edit,String id_membresia)
     {
       lbr= new Libro(titulo, Integer.valueOf(existencias),Double.valueOf(precio),
               anio_public, tomo, Integer.valueOf(id_categoria), Integer.valueOf(id_autor),
               Integer.valueOf(id_edit), Integer.valueOf(id_membresia),0);
       
        try {
            if(ob.agregar(lbr)>0)
                JOptionPane.showMessageDialog(null,"Registro Guardado"
                        + " Correctamente");
            else
                 JOptionPane.showMessageDialog(null,"Registro No Guardado"
                        + " Correctamente");
                
        } catch (Exception e) {
        }
    }
     
     
     
     
   public void modificar (String id_libro,String titulo,String existencias,
           String precio, String anio_public, String tomo,String id_categoria,
           String id_autor,String id_edit,String id_membresia)
   {
         lbr=new Libro(Integer.valueOf(id_libro),titulo,
                 Integer.valueOf(existencias), Double.valueOf(precio),
                 anio_public,tomo, Integer.valueOf(id_categoria),
                 Integer.valueOf(id_autor), Integer.valueOf(id_edit),
                 Integer.valueOf(id_membresia),0);
         try {
            if(ob.modificar(lbr)>0)
                JOptionPane.showMessageDialog(null,"Registro Modificado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Modificado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
   
   public void eliminar(String id_libro){
         lbr=new Libro (Integer.valueOf(id_libro));
         try {
            if(ob.eliminar(lbr)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    public void eliminaLo(String id_libro){
         lbr=new Libro (Integer.valueOf(id_libro));
         try {
            if(ob.eliminaLo(lbr)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
}
