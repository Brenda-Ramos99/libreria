package sistem.LogicaNegocio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistem.Dao.DaoCategoria;
import sistem.Entidades.Categoria;

/**
 * Nombre de la Clase: TransCategoria
 * Versión: 1.0
 * Fecha: 23/08/2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class TransCategoria
{
    Categoria cat;
    DaoCategoria obDaoCat = new DaoCategoria();
    
    public DefaultTableModel datos()
    {
        String[] cabecera={"ID","Categoría"};
        DefaultTableModel tm = new DefaultTableModel(cabecera,0);
        ArrayList<Categoria> ar = new ArrayList<Categoria>();
        Object[] re= new Object[2];
        
        try
        {
            for (Categoria v:ar)
            {
                ar.addAll(obDaoCat.mostrar());
                re[0]=v.getId_categoria();
                re[1]=v.getNombre_cat();
                tm.addRow(re);
            }
        } catch (Exception e)
        {
            
        }
        return tm;
    }
    
    public void agregar(String nombre_cat)
    {
        cat= new Categoria(nombre_cat);
        try
        {
            if (obDaoCat.agregar(cat)>0)
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
    
    public void modificar(String id_categoria,String nombre_cat)
    {
        cat= new Categoria(Integer.valueOf(id_categoria), nombre_cat);
        try
        {
            if (obDaoCat.modificar(cat)>0)
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
    
    public void eliminar(String id_categoria)
    {
        cat= new Categoria(Integer.valueOf(id_categoria));
        try
        {
            if (obDaoCat.eliminar(cat)>0)
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
