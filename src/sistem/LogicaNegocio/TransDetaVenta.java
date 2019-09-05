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
import sistem.Entidades.Detalle_venta;



/**
 *
 * @author Eduardo Recinos
 * 
 */
public class TransDetaVenta

{
    Detalle_venta detaVent;
    DaoDeta_Venta ob =new DaoDeta_Venta();
    public DefaultTableModel datos(){
         ArrayList<Detalle_venta> ar=new ArrayList<Detalle_venta>();
         String[] title={"Id","Cantidad","Precio","Subtotal","Id libro","Id Venta"};
         DefaultTableModel tm=new DefaultTableModel(title, 0);
         Object[] row = new Object[4];
         try {
             ar.addAll(ob.mostrar());
             for(Detalle_venta v:ar){
                row[0]=v.getId_detalle_venta();
                row[1]=v.getCantidad();
                row[2]=v.getPrecio();
                row[3]=v.getSubtotal();
                row[4]=v.getId_libro();
                row[5]=v.getId_venta();
                tm.addRow(row);
             }
             
        } catch (Exception e) {
        }
        return tm;
    }
   
     public void agregar (String cantidad,String precio,
                 String subtotal,String id_libro,String id_venta,String estado)
     {
         detaVent = new Detalle_venta(Integer.valueOf(cantidad),
                 Double.valueOf(precio),Double.valueOf(subtotal),
                 Integer.valueOf(id_libro), Integer.valueOf(id_venta),
                 Integer.valueOf(estado));
         try {
            if(ob.agregar(this.detaVent)>0)
                JOptionPane.showMessageDialog(null,"Registro Guardado"
                        + " Correctamente");
            else
                 JOptionPane.showMessageDialog(null,"Registro No Guardado"
                        + " Correctamente");
                
        } catch (Exception e) {
        }
    }
     
   public void modificar (String id_detalle_venta,String cantidad,String precio,
                 String subtotal,String id_libro,String id_venta,String estado)
   {
         detaVent = new Detalle_venta(Integer.valueOf(id_detalle_venta),
                 Integer.valueOf(cantidad), Double.valueOf(precio),
                 Double.valueOf(subtotal), Integer.valueOf(id_libro),
                 Integer.valueOf(id_venta), Integer.valueOf(estado));
         try {
            if(ob.modificar(detaVent)>0)
                JOptionPane.showMessageDialog(null,"Registro Modificado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Modificado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
   
   public void eliminar(String id_detalle_venta){
         detaVent = new Detalle_venta(Integer.valueOf(id_detalle_venta));
         try {
            if(ob.eliminar(detaVent)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    public void eliminaLo(String id_detalle_venta){
         detaVent=new Detalle_venta(Integer.valueOf(id_detalle_venta));
         try {
            if(ob.eliminaLo(detaVent)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
}
