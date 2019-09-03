/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.LogicaNegocio;
import sistem.Dao.*;
import sistem.Entidades.Categoria;
import javax.swing.table.*;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Eduardo R.
 */
public class Transacciones 
{
    
    
    Categoria cat;
    DaoCategoria ob=new DaoCategoria();
    public DefaultTableModel datos(){
         ArrayList<Categoria> ar=new ArrayList<Categoria>();
         String[] title={"Id","Nombre Categoria"};
         DefaultTableModel tm=new DefaultTableModel(title, 0);
         Object[] row=new Object[2];
         try {
             ar.addAll(ob.mostrar());
             for(Categoria v:ar){
                row[0]=v.getId_categoria();
                row[1]=v.getNombre_cat();
               
                tm.addRow(row);
             }
             
        } catch (Exception e) {
        }
        return tm;
    }
   
     public void agregar(String nombre_cat){
       cat= new Categoria(nombre_cat, 0);
       
        try {
            if(ob.agregar(cat)>0)
                JOptionPane.showMessageDialog(null,"Registro Guardado"
                        + " Correctamente");
            else
                 JOptionPane.showMessageDialog(null,"Registro No Guardado"
                        + " Correctamente");
                
        } catch (Exception e) {
        }
    }
     
     
     
     
   public void modificar (String id_categoria,String nombre_cat,String estado){
         cat=new Categoria(Integer.valueOf(id_categoria), nombre_cat,Integer.valueOf(estado));
         try {
            if(ob.modificar(cat)>0)
                JOptionPane.showMessageDialog(null,"Registro Modificado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Modificado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
   
   public void eliminar(String id_categoria){
         cat=new Categoria(Integer.valueOf(id_categoria));
         try {
            if(ob.eliminar(cat)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    public DefaultComboBoxModel llenarCategoria()
    {
     ArrayList<Categoria> arr= new ArrayList<>();
     Object[] vec= new Object[1];
     
     DefaultComboBoxModel cm= new DefaultComboBoxModel();
        try {
            arr.addAll(ob.llenarCategorias());
            for (Categoria cat:arr) {
                cm.addElement(cat.getNombre_cat());
            }
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR(mostrar_Transacciones)",0);
        }
    return cm;
    }
    
    
    
    
    
    }

    

    
    
    
    
    
    
    
    
    

