
package PROYECTO;
import java.sql.*;
import javax.swing.JOptionPane;
public class Conectar {

    String bd="Chescomania";
    String login="root";
    String password="19846609";
    String url="jdbc:mysql://127.0.0.1/"+bd;
    Connection con=null;
    
    public Connection conectarr(){
    try 
    {
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection(url,login,password);
    if(con!=null)
       JOptionPane.showMessageDialog(null,"Conexion exitosa");
        
    }
    catch (Exception e)
    {
        JOptionPane.showMessageDialog(null,"Error");
         
    }
    return con;
    }
    
    
}
