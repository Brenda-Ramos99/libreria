package sistem.LogicaNegocio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistem.Dao.DaoCompra;
import sistem.Entidades.Compra;

/**
 *
 * @author BymerGomez
 */
public class TransCompra
{
    Compra com;
    DaoCompra obDaoCom = new DaoCompra();
    
    public DefaultTableModel datos()
    {
        String[] cabecera={"ID","Fecha","Total"};
        DefaultTableModel tm = new DefaultTableModel(cabecera,0);
        ArrayList<Compra> ar = new ArrayList<Compra>();
        Object[] re= new Object[3];
        
        try
        {
            for (Compra v:ar)
            {
                ar.addAll(obDaoCom.mostrar());
                re[0]=v.getId_compra();
                re[1]=v.getFecha();
                re[2]=v.calcTotal();
                tm.addRow(re);
            }
        } catch (Exception e)
        {
            
        }
        return tm;
    }
    
    public void agregar(String fecha, String total)
    {
        com= new Compra(fecha,Double.valueOf(total));
        try
        {
            if (obDaoCom.agregar(com)>0)
            {
                JOptionPane.showMessageDialog(null, "Registro insertado "
                        + "correctamente");
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se pudo inserar el "
                    + "registro","Erro",0);
        }
    }
    
    public void modificar(String id_compra,String fecha, String total)
    {
        com= new Compra(Integer.valueOf(id_compra), fecha,
                Double.valueOf(total));
        try
        {
            if (obDaoCom.modificar(com)>0)
            {
                JOptionPane.showMessageDialog(null, "Registro modificado "
                        + "correctamente");
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se pudo modificar el "
                    + "registro","Erro",0);
        }
    }
    
    public void eliminar(String id_compra)
    {
        com= new Compra(Integer.valueOf(id_compra));
        try
        {
            if (obDaoCom.eliminar(com)>0)
            {
                JOptionPane.showMessageDialog(null, "Registro eliminado "
                        + "correctamente");
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el "
                    + "registro","Erro",0);
        }
    }
}