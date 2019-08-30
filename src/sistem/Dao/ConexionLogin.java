
package sistem.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * nombre de la clase: ConexionLogin
 * version:1.0
 * fecha: 25/08/19
 * copyright:ITCA-FEPADE
 * @author william Villatoro
 */
public class ConexionLogin {
     private String url="jdbc:mysql://127.0.0.1:3306/biblioteca";
    private String user="root";
    private String password="";
    private Connection con=null;
    
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    return con;
    }
}
