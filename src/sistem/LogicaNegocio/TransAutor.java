/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.LogicaNegocio;
import sistem.Dao.*;
import sistem.Entidades.Autor;
import javax.swing.table.*;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author william villatoro
 */
public class TransAutor 
{
      Autor auto;
    DaoAutor ob=new DaoAutor();
    public DefaultTableModel datos(){
         ArrayList<Autor> ar=new ArrayList<Autor>();
         String[] title={"Id","Nombre","seudonimo","Genero","Nacionalidad"};
         DefaultTableModel tm=new DefaultTableModel(title, 0);
         Object[] row=new Object[5];
         try {
             ar.addAll(ob.mostrarAutor());
             for(Autor v:ar){
                row[0]=v.getId_autor();
                row[1]=v.getNombre();
                row[2]=v.getSeudonimo();
                row[3]=v.getGenero();
                row[4]=v.getNacionalidad();
                
                tm.addRow(row);
             }
             
        } catch (Exception e) {
        }
        return tm;
 
    }
    
    
    public void agregar(String nombre,String seudonimo, String genero,String nacionalidad){
       auto= new Autor(nombre, seudonimo, genero, nacionalidad, 0);
       
        try {
            if(ob.agregar(auto)>0)
                JOptionPane.showMessageDialog(null,"Registro Guardado"
                        + " Correctamente");
            else
                 JOptionPane.showMessageDialog(null,"Registro No Guardado"
                        + " Correctamente");
                
        } catch (Exception e) {
        }
    }
      
    public void modificar (String id_autor,String nombre, String seudonimo,
            String genero,String nacionalidad)
    {
         auto =new Autor(Integer.valueOf(id_autor), nombre, seudonimo, genero,
                 nacionalidad);
         try {
            if(ob.modificar(auto)>0)
                JOptionPane.showMessageDialog(null,"Registro Modificado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Modificado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    
    
    
    public void eliminar(String id_autor)
    {
         auto=new Autor (Integer.valueOf(id_autor));
         try {
            if(ob.eliminar(auto)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    public void eliminaLo(String id_autor)
    {
         auto=new Autor (Integer.valueOf(id_autor));
         try {
            if(ob.eliminaLo(auto)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
  
     public DefaultComboBoxModel llenarAutor()
    {
     ArrayList<Autor> arr= new ArrayList<>();
     Object[] vec= new Object[1];
     
     DefaultComboBoxModel cm= new DefaultComboBoxModel();
        try {
            arr.addAll(ob.llenarAutor());
            for (Autor cat:arr) {
                cm.addElement(cat.getNombre());
            }
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR(mostrar_Transacciones)",0);
        }
    return cm;
    }
    
     
     
     
     
     
     
     
     
    
}
