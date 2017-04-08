package modul7;
/**
 *
 * @author
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksi
{
    private static Connection con;
    public static Connection getConnection()
    {  
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/modul7visual","root","");
              JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Koneksi gagal: "+e.getMessage());
        }   
      return con;  
    }
}