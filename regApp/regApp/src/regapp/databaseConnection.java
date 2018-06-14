package regapp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class databaseConnection {
    Connection conn = null;
        
        public static Connection connectDB(){
        
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","zam_reg", "goth");
     
                return conn;
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
                return null;
            }
        }
}
