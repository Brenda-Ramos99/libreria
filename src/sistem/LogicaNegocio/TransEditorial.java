/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.LogicaNegocio;
import sistem.Dao.*;
import sistem.Entidades.Editorial;
import javax.swing.table.*;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author william villatoro
 */
public class TransEditorial 
{
    Editorial edit;
    DaoEditorial ob=new DaoEditorial();
    public DefaultTableModel datos(){
         ArrayList<Editorial> ar=new ArrayList<Editorial>();
         String[] title={"Id","Telefono","Nombre","Pais","Direccion"};
         DefaultTableModel tm=new DefaultTableModel(title, 0);
         Object[] row=new Object[5];
         try {
             ar.addAll(ob.mostrar());
             for(Editorial v:ar){
                row[0]=v.getId_edit();
                row[1]=v.getTelefono();
                row[2]=v.getNombre();
                row[3]=v.getPais();
                row[4]=v.getDireccion();
               
                tm.addRow(row);
             }
             
        } catch (Exception e) {
        }
        return tm;
    }
    
    
    
    
     public void agregar(String telefono, String nombre, String direccion, String pais){
       edit= new Editorial(telefono, nombre, pais, direccion, 0);
       
        try {
            if(ob.agregar(edit)>0)
                JOptionPane.showMessageDialog(null,"Registro Guardado"
                        + " Correctamente");
            else
                 JOptionPane.showMessageDialog(null,"Registro No Guardado"
                        + " Correctamente");
                
        } catch (Exception e) {
        }
    }
    
    public void modificar (String id_editorial,String telefono, String nombre,
            String direccion, String pais)
    {
         edit =new Editorial(Integer.valueOf(id_editorial), telefono, nombre,
                 direccion ,pais);
         try {
            if(ob.modificar(edit)>0)
                JOptionPane.showMessageDialog(null,"Registro Modificado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Modificado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    
    public void eliminar(String id_editorial)
    {
         edit=new Editorial(Integer.valueOf(id_editorial));
         try {
            if(ob.eliminar(edit)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    public void eliminaLo(String id_editorial)
    {
         edit=new Editorial(Integer.valueOf(id_editorial));
         try {
            if(ob.eliminaLo(edit)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
 public DefaultComboBoxModel llenarEditorial()
    {
     ArrayList<Editorial> arr= new ArrayList<>();
     Object[] vec= new Object[1];
     
     DefaultComboBoxModel cm= new DefaultComboBoxModel();
        try {
            arr.addAll(ob.llenarEditorial());
            for (Editorial cat:arr) {
                cm.addElement(cat.getNombre());
            }
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR(mostrar_Transacciones)",0);
        }
    return cm;
    }
       
    
}
