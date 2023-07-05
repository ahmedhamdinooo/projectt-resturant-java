/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;

import java.sql.*;
import java.util.Calendar;

public class JavaTimestamp
{
    
    
    
  public static void main(String[] args) throws ClassNotFoundException, SQLException 
  {
   JavaTimestamp p = new JavaTimestamp();
       p.time();
  }
  
  
  public void time() throws ClassNotFoundException, SQLException{
       // (1) connect to the database (mysql)
     Connection conn;
    Statement st;
    String myDriver = "org.gjt.mm.mysql.Driver";
    Class.forName(myDriver);
      String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=restaurant_system;";
             String user = "ahmed";
             String pass = "12345";
            conn = DriverManager.getConnection(dbURL, user, pass);
           st = conn.createStatement();

    // (2) create a java timestamp object that represents the current time (i.e., a "current timestamp")
    Calendar calendar = Calendar.getInstance();
    java.sql.Timestamp ourJavaTimestampObject = new java.sql.Timestamp(calendar.getTime().getTime());
    
    // (3) create a java timestamp insert statement
    String sqlTimestampInsertStatement = "INSERT INTO orders (order_time) VALUES (?)";
      try (PreparedStatement preparedStatement = conn.prepareStatement(sqlTimestampInsertStatement)) {
          preparedStatement.setTimestamp(1, ourJavaTimestampObject);
          
          // (4) execute the sql timestamp insert statement, then shut everything down
          preparedStatement.executeUpdate();
      }
    System.exit(0);
  }
}

