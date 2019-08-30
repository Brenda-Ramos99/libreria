package sistem.Dao;
import java.sql.*;
/**
 *nombre de la clase: Conexion
 * version:1.0
 * fecha: 27/08/19
 * copyright:ITCA-FEPADE
 * @author Administrador
 */
public class Conexion
{
    private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://127.0.0.1:3306/biblioteca";
    private String user="root";
    private String password="";

    public Conexion()
    {
        
    }
    public Connection con() throws ClassNotFoundException,SQLException
    {
        Class.forName(driver);
        return DriverManager.getConnection(url,user,password);
    }
    
}