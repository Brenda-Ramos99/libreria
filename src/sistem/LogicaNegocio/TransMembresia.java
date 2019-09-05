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
import sistem.Entidades.Membresia;



/**
 *
 * @author Eduardo Recinos
 * 
 */
public class TransMembresia

{
    Membresia memb;
    DaoMembresia ob=new DaoMembresia();
    public DefaultTableModel datos(){
         ArrayList<Membresia> ar=new ArrayList<Membresia>();
         String[] title={"Id","Tipo Membresia","Fecha Validación",
             "Fecha Vencimiento","Precio Membresia","Id Usuario"};
         DefaultTableModel tm=new DefaultTableModel(title, 0);
         Object[] row=new Object[6];
         try {
             ar.addAll(ob.mostrar());
             for(Membresia v:ar){
                row[0]=v.getId_membresia();
                row[1]=v.getTipo_membresia();
                row[2]=v.getFecha_validacion();
                row[3]=v.getFecha_vencimiento();
                row[4]=v.getPrecio_membresia();
                row[5]=v.getId_usuario();
                tm.addRow(row);
             }
             
        } catch (Exception e) {
        }
        return tm;
    }
   
     public void agregar (String tipo_membresia,
             String fecha_validacion,String fecha_vencimiento, String precio_membresia,
             String id_usuario)
     {
         memb= new Membresia(tipo_membresia,fecha_validacion, fecha_vencimiento,
                 Double.valueOf(precio_membresia),Integer.valueOf(id_usuario), 0);
         try {
            if(ob.agregar(memb)>0)
                JOptionPane.showMessageDialog(null,"Registro Guardado"
                        + " Correctamente");
            else
                 JOptionPane.showMessageDialog(null,"Registro No Guardado"
                        + " Correctamente");
                
        } catch (Exception e) {
        }
    }
     
   public void modificar (String id_membresia,String tipo_membresia,
             String fecha_validacion,String fecha_vencimiento, String precio_membresia,
             String id_usuario)
   {
         memb = new Membresia(Integer.valueOf(id_membresia),tipo_membresia,
                 fecha_validacion,fecha_vencimiento, Double.valueOf(precio_membresia),
                 Integer.valueOf(id_usuario),0);
         try {
            if(ob.modificar(memb)>0)
                JOptionPane.showMessageDialog(null,"Registro Modificado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Modificado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
   
   public void eliminar(String id_membresia){
         memb=new Membresia (Integer.valueOf(id_membresia));
         try {
            if(ob.eliminar(memb)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    public void eliminaLo(String id_libro){
         memb=new Membresia (Integer.valueOf(id_libro));
         try {
            if(ob.eliminaLo(memb)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
}
