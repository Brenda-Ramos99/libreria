/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistem.Entidades.Usuario;


/**
 *
 * @author william Villatoro
 */
public class DaoLogin extends ConexionLogin{
    
    public boolean agregar(Usuario usr) throws SQLException{
    PreparedStatement ps=null; 
    Connection con= getConexion();
    
    String sql="Insert into usuario(usuario,pass,edad,direccion,estado,id_rol)"
            +" values(?,?,?,?,?,?)";
    try{
        ps=con.prepareStatement(sql);
        ps.setString(1, usr.getUsuario());
        ps.setString(2, usr.getPass());
        ps.setInt(3, usr.getEdad());
        ps.setString(4, usr.getDireccion());
        ps.setInt(5,usr.getEstado());
        ps.setString(6, usr.getId_rol());
        ps.executeUpdate();
    return true;
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    return false;
    }
}
    
     public int ExisteUsuario(String usuario){
    PreparedStatement ps=null; 
    ResultSet rs=null;
    Connection con= getConexion();
    
    String sql="select count(*) from usuario where usuario=?";
            
    try{
    ps=con.prepareStatement(sql);
    ps.setString(1, usuario);
    rs=ps.executeQuery();
    if(rs.next()){
    return rs.getInt(1);
    }
    return 1;
    
    }catch(SQLException ex){
        //Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null,ex);
    return 1;
    }
     }
     
     public boolean loging(Usuario usr){
    PreparedStatement ps=null; 
    ResultSet rs=null;
    Connection con= getConexion();
    
    String sql="select id_usuario, usuario, pass, estado, id_rol from usuario where usuario=?";
            
    try{
    ps=con.prepareStatement(sql);
    ps.setString(1, usr.getUsuario());
    rs=ps.executeQuery();
    if(rs.next()){
    if(usr.getPass().equals(rs.getString(3)))
    {
        usr.setId_usuario(rs.getInt(1));
        usr.setUsuario(rs.getString(2));
        usr.setId_rol(rs.getString(5));
        usr.setEstado(rs.getInt(4));
        return true;
    }else{
    
    return false;
    
    }
    
    }
    return false;
    
    }catch(SQLException ex){
        //Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null,ex);
    return false;
    }
}
}