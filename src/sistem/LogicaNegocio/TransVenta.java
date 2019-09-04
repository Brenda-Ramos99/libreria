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
import sistem.Entidades.Venta;



/**
 *
 * @author Eduardo Recinos
 * 
 */
public class TransVenta

{
    Venta vent;
    DaoVenta ob =new DaoVenta();
    public DefaultTableModel datos(){
         ArrayList<Venta> ar=new ArrayList<Venta>();
         String[] title={"Id","Fecha","Total","Iva"};
         DefaultTableModel tm=new DefaultTableModel(title, 0);
         Object[] row = new Object[4];
         try {
             ar.addAll(ob.mostrar());
             for(Venta v:ar){
                row[0]=v.getId_venta();
                row[1]=v.getFecha();
                row[2]=v.getTotal();
                row[3]=v.getIVA();
                tm.addRow(row);
             }
             
        } catch (Exception e) {
        }
        return tm;
    }
   
     public void agregar (String fecha,String total, String iva)
     {
         vent = new Venta(fecha, Double.valueOf(total),0);
         try {
            if(ob.agregar(this.vent)>0)
                JOptionPane.showMessageDialog(null,"Registro Guardado"
                        + " Correctamente");
            else
                 JOptionPane.showMessageDialog(null,"Registro No Guardado"
                        + " Correctamente");
                
        } catch (Exception e) {
        }
    }
     
   public void modificar (String id_venta,String fecha,String total)
   {
         vent = new Venta(Integer.valueOf(id_venta), fecha,
                 Double.valueOf(total), 0);
         try {
            if(ob.modificar(vent)>0)
                JOptionPane.showMessageDialog(null,"Registro Modificado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Modificado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
   
   public void eliminar(String id_venta){
         vent=new Venta(Integer.valueOf(id_venta));
         try {
            if(ob.eliminar(vent)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    public void eliminaLo(String id_venta){
         vent=new Venta (Integer.valueOf(id_venta));
         try {
            if(ob.eliminaLo(vent)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
}
