/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.Presentacion;

import javax.swing.JOptionPane;
import sistem.Dao.Conexion;
import sistem.Dao.DaoCompra;
import sistem.Entidades.Compra;

/**
 *
 * @author BymerGomez
 */
public class Tester extends Conexion
{
    public static void main(String[] args) {
        Conexion con =new Conexion();
        DaoCompra daoCompra=new DaoCompra();
        
        Compra comp = new Compra("12/10/12",13.65);
        try {
            JOptionPane.showMessageDialog(null,daoCompra.agregar(comp));
            System.out.println("Si");
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
