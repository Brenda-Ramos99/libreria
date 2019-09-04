/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.LogicaNegocio;
import sistem.Dao.*;
import javax.swing.table.*;
import java.util.*;
import javax.swing.JOptionPane;
import sistem.Entidades.Rol;



/**
 *
 * @author Eduardo Recinos
 * 
 */
public class TransRol

{
    Rol ro;
    DaoRol ob =new DaoRol();
    public DefaultTableModel datos(){
         ArrayList<Rol> ar=new ArrayList<Rol>();
         String[] title={"Id","Rol"};
         DefaultTableModel tm=new DefaultTableModel(title, 0);
         Object[] row = new Object[2];
         try {
             ar.addAll(ob.mostrar());
             for(Rol v:ar){
                row[0]=v.getId_rol();
                row[1]=v.getRol();
                tm.addRow(row);
             }
             
        } catch (Exception e) {
        }
        return tm;
    }
   
     public void agregar (String rol)
     {
         ro = new Rol(rol, 0);
         try {
            if(ob.agregar(this.ro)>0)
                JOptionPane.showMessageDialog(null,"Registro Guardado"
                        + " Correctamente");
            else
                 JOptionPane.showMessageDialog(null,"Registro No Guardado"
                        + " Correctamente");
                
        } catch (Exception e) {
        }
    }
     
   public void modificar (String id_rol,String rol)
   {
         ro = new Rol(Integer.valueOf(id_rol),rol);
         try {
            if(ob.modificar(ro)>0)
                JOptionPane.showMessageDialog(null,"Registro Modificado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Modificado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
   
   public void eliminar(String id_rol){
         ro=new Rol (Integer.valueOf(id_rol));
         try {
            if(ob.eliminar(ro)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    public void eliminaLo(String id_rol){
         ro=new Rol (Integer.valueOf(id_rol));
         try {
            if(ob.eliminaLo(ro)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
}
