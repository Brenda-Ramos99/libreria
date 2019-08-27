package sistem.LogicaNegocio;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sistem.Dao.DaoAutor;
import sistem.Entidades.Autor;

/**
 *
 * @author BymerGomez
 */
public class TransAutor
{
    Autor a;
    DaoAutor obDAut = new DaoAutor();
    
    public DefaultTableModel datos()
    {
        String[] cabecera={"ID","Nombre","Seudonimo","Género","Nacionalidad"};
        DefaultTableModel tm = new DefaultTableModel(cabecera,0);
        ArrayList<Autor> ar = new ArrayList<Autor>();
        Object[] re = new Object[5];
        try
        {
            ar.addAll(obDAut.mostrar());
            for (Autor v:ar)
            {
                re[0]=v.getId_autor();
                re[1]=v.getNombre();
                re[2]=v.getSeudonimo();
                re[3]=v.getGenero();
                re[4]=v.getNacionalidad();
                tm.addRow(re);
            }
        }
        catch (Exception e)
        {
            
        }
        return tm;
    }
    
    public void agregar(String nombre, String seudonimo, String genero, String nacionalidad)
    {
        a = new Autor(nombre, seudonimo, genero, nacionalidad);
        try {
            if (obDAut.agregar(a)>0) {
                JOptionPane.showMessageDialog(null, "Registro insertado "
                        + "correctamente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo insertar el "
                        + "registro no insertado");
            }
        } catch (Exception e)
        {
            
        }
    }
    
    public void modificar(String id_autor, String nombre, String seudonimo,
            String genero, String nacionalidad)
    {
        a = new Autor(Integer.valueOf(id_autor), nombre, seudonimo,genero, nacionalidad);
        try {
            if (obDAut.modificar(a)>0) {
                JOptionPane.showMessageDialog(null, "Registro modificado "
                        + "correctamente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo modificar el "
                        + "registro");
            }
        } catch (Exception e)
        {
            
        }
    }
    
    public void eliminar(String id_autor)
    {
        a = new Autor(Integer.valueOf(id_autor));
        try {
            if (obDAut.eliminar(a)>0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado "
                        + "correctamente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el "
                        + "registro");
            }
        } catch (Exception e)
        {
            
        }
    }
}
