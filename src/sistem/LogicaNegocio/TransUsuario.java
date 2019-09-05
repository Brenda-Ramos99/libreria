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
import sistem.Entidades.Usuario;



/**
 *
 * @author Eduardo Recinos
 * 
 */
public class TransUsuario

{
    Usuario usu;
    DaoUsuario ob =new DaoUsuario();
    public DefaultTableModel datos(){
         ArrayList<Usuario> ar=new ArrayList<Usuario>();
         String[] title={"Id","USuario","Contra","Edad","Diección","Tarjeta","CVC","Id ROL"};
         DefaultTableModel tm=new DefaultTableModel(title, 0);
         Object[] row = new Object[8];
         try {
             ar.addAll(ob.mostrar());
             for(Usuario v:ar){
                row[0]=v.getId_usuario();
                row[1]=v.getUsuario();
                row[2]=v.getPass();
                row[3]=v.getEdad();
                row[4]=v.getDireccion();
                row[5]=v.getTarjeta();
                row[6]=v.getCvc();
                row[7]=v.getId_rol();
                
                tm.addRow(row);
             }
             
        } catch (Exception e) {
        }
        return tm;
    }
   
     public void agregar (String usuario,String pass, String edad,
             String direccion,String tarjeta,String cvc,String id_rol)
     {
         usu = new Usuario(usuario, pass, Integer.valueOf(edad), direccion,
                 tarjeta, cvc, 0, Integer.valueOf(id_rol));
         try {
            if(ob.agregar(this.usu)>0)
                JOptionPane.showMessageDialog(null,"Registro Guardado"
                        + " Correctamente");
            else
                 JOptionPane.showMessageDialog(null,"Registro No Guardado"
                        + " Correctamente");
                
        } catch (Exception e) {
        }
    }
     
   public void modificar (String id_usuario,String usuario,String pass, String edad,
             String direccion,String tarjeta,String cvc,String id_rol)
   {
         usu = new Usuario(Integer.valueOf(id_usuario), usuario, pass,
                 Integer.valueOf(edad), direccion, tarjeta,cvc,0,Integer.valueOf(id_rol));
         try {
            if(ob.modificar(usu)>0)
                JOptionPane.showMessageDialog(null,"Registro Modificado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Modificado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
   
   public void eliminar(String id_usuario){
         usu=new Usuario (Integer.valueOf(id_usuario));
         try {
            if(ob.eliminar(usu)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
    
    public void eliminaLo(String id_usuario){
         usu=new Usuario (Integer.valueOf(id_usuario));
         try {
            if(ob.eliminaLo(usu)>0)
                JOptionPane.showMessageDialog(null,"Registro Eliminado"
                        + " Correctamente");
            else
                JOptionPane.showMessageDialog(null,"Registro No Eliminado"
                        + " Correctamente");
        } catch (Exception e) {
        }
    }
}
