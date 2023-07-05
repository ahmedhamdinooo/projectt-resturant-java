package projectt;


import java.sql.*;
import javax.swing.JOptionPane;

public class DB  {
    
    
    
    Connection conn;
    Statement st;
    
    
 
    
    public DB() throws SQLException {
        
        try {
        
             String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=restaurant_system;";
             String user = "ahmed";
             String pass = "12345";
            conn = DriverManager.getConnection(dbURL, user, pass);
           st = conn.createStatement();
        }
        
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void CloseConnection() throws SQLException
    {
        st.close();
        conn.close(); 
    }
}
