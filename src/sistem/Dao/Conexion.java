package sistem.Dao;
import java.sql.*;
/**
 *
 * @author Administrador
 */
public class Conexion
{
    private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://127.0.0.1:3306/libreria";
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