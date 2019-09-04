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
import sistem.Entidades.Prestamo;



/**
 *
 * @author Eduardo Recinos
 * 
 */
public class TransPrestamo

{
    Prestamo presta;
    DaoPrestamo ob=new DaoPrestamo();
    public DefaultTableModel datos(){
         ArrayList<Prestamo> ar=new ArrayList<Prestamo>();
         String[] title={"Id","Fecha Inicio","Fecha Final",
             "Total"};
         DefaultTableModel tm=new DefaultTableModel(title, 0);
         Object[] row = new Object[4];
         try {
             ar.addAll(ob.mostrar());
             for(Prestamo v:ar){
                row[0]=v.getId_prestamo();
                row[1]=v.getFecha_inicio();
                row[2]=v.getFecha_final();
                row[3]=v.getTotal();
                tm.addRow(row);
             }
             
        } catch (Exception e) {
        }
        return tm;
    }
   
     public void agregar (String fecha_inicio,String fecha_final,String total)
     {
         presta= new Prestamo(fecha_inicio,fecha_final,Double.valueOf(total),0);
         try {
            if(ob.agregar(presta)>0)
                JOptionPane.showMessageDialog(null,"Registro Guardado"
                        + " Correctamente");
            else
                 JOptionPane.showMessageDialog(null,"Registro No Guardado"
                        + " Correctamente");
                
        } catch (Exception e) {
        }
    }
     
   public void modificar (String id_prestamo,String fecha_inicio,String fecha_final,
           String total)
   {
         presta = new Prestamo(Integer.valueOf(id_prestamo),fecha_inicio,fecha_final,
                 Double.valueOf(total));
         try {
            if(ob.modificar(presta)>0)
                JOptionPane.showMessageDialog(null,"Registro Modificado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Modificado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
   
   public void eliminar(String id_membresia){
         presta=new Prestamo (Integer.valueOf(id_membresia));
         try {
            if(ob.eliminar(presta)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    public void eliminaLo(String id_libro){
         presta=new Prestamo (Integer.valueOf(id_libro));
         try {
            if(ob.eliminaLo(presta)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
}
