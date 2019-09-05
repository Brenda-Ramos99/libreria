package sistem.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sistem.Entidades.Usuario;


/**
 * nombre de la clase: DaoLoginn
 * version:1.0
 * fecha: 25/08/19
 * copyright:ITCA-FEPADE
 * @author william Villatoro
 */
public class DaoLogin extends ConexionLogin{
    
    public boolean agregar(Usuario usr) throws SQLException{
        PreparedStatement ps=null; 
        Connection con= getConexion();
        
        String sql="Insert into usuario(usuario,pass,edad,direccion,estado,"
                + "id_rol)"
                +" values(?,?,?,?,?,?)";
        try{
            
            ps=con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getPass());
            ps.setInt(3, usr.getEdad());
            ps.setString(4, usr.getDireccion());
            ps.setInt(5,usr.getEstado());
            ps.setInt(6, usr.getId_rol());
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
    
    /*String sql="select id_usuario, usuario, pass, estado, id_rol from usuario where usuario=?";
         String sql="select u.id_usuario, u.usuario, u.pass, u.estado, u.id_rol, t.nombre_rol"+
            "from usuario u INNER JOIN rol t ON u.id_rol=t.id where usuario=?";*/
    String sql="SELECT id_usuario, usuario, pass, estado, id_rol FROM usuario WHERE usuario = ? LIMIT 1";
    try{
    ps=con.prepareStatement(sql);
    ps.setString(1, usr.getUsuario());
    rs=ps.executeQuery();
    if(rs.next()){
    if(usr.getPass().equals(rs.getString(3)))
    {
        usr.setId_usuario(rs.getInt(1));
        usr.setUsuario(rs.getString(2));
        usr.setId_rol(rs.getInt(5));
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