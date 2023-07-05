/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emad Amin
 */
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Emad Amin
 */
public class users  extends DB{
    
    private int id;
    private String username;
    private String password;
    
    
    
    users ()throws SQLException{
        
    }
    
     users( int id ,String username,String password)throws SQLException{
        this.id=id;
        this.username=username;
        this.password=password;
    }

    users(String username, String password) throws SQLException{
       this.username=username;
        this.password=password;
    }

     /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
   
    
    
// method *****************************************************************
      public void Add(users m) throws SQLException {

   DB db= new DB();   // connection
     String sql = "insert into users values (  '" + m.getUsername()+ "' , '" + m.getPassword() + "' );";
     st.executeUpdate(sql);
     JOptionPane.showMessageDialog(null, "Added Successfully", "Add Admin", JOptionPane.INFORMATION_MESSAGE);
   db. CloseConnection();  // close connection
            
   
   }
   
     public void Save(int id , String username, String password ) throws SQLException {
      try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=restaurant_system ";
             String user = "ahmed";
             String pass = "12345";
        try (Connection con = DriverManager.getConnection(dbURL, user, pass)) {
            String sql = "update users set Username = ?, Password= ?  where id = "+id; 
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username);
             pst.setString(2, password);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "update sucessefully" , "sucess", JOptionPane.INFORMATION_MESSAGE );
            
      }}
        catch(Exception e){   
            JOptionPane.showMessageDialog(null, e );
      }
     
 
     }
 public void log ()throws SQLException{
          
try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=restaurant_system ";
             String user = "ahmed";
             String pass = "12345";
        try (Connection con = DriverManager.getConnection(dbURL, user, pass)) {
            String sql ="select  Username ,Password, id  from users where Username=? and Password=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, getUsername());
            pst.setString(2, getPassword());
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "username and password matched" );
                
             projectt p=new projectt();
             p.JframAdminOption();
               up_admin.getID = rs.getInt("id");
              
            }
            else{
                JOptionPane.showMessageDialog(null, "username OR password not correct ");
                
            }
             con.close();
        }
        
    } catch(HeadlessException | ClassNotFoundException | SQLException e){
      JOptionPane.showMessageDialog(null, e );
        
    }
    
   }
 
 
 
 
 
  public int  log2 ()throws SQLException{
          
try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=restaurant_system;";
             String user = "ahmed";
             String pass = "12345";
        try (Connection con = DriverManager.getConnection(dbURL, user, pass)) {
            String sql ="  select  Username,Password  from employee where Username=? and Password=?  ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, getUsername());
            pst.setString(2, getPassword());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "username and password matched" );
                projectt p=new projectt();
                p.JframChoosesEmployee();
              
            }
            else{
                JOptionPane.showMessageDialog(null, "username OR password not correct ");
                  
                
            }
             con.close();
        }
        
    } catch(HeadlessException | ClassNotFoundException | SQLException e){
      JOptionPane.showMessageDialog(null, e );
        
    }
        return 0;
    
   }
 
 

 }


