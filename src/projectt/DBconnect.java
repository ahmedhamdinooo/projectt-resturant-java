/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;

import java.sql.*;

public class DBconnect {




public static void main(String[] args) {
    // TODO Auto-generated method stub

    String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=restaurant_system;";
    String user = "ahmed";
    String pass = "12345";
    try {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");


    Connection myConn = DriverManager.getConnection(dbURL, user, pass);
    try {
    Statement myStmt = myConn.createStatement();

    try {
    ResultSet myRs = myStmt.executeQuery("Select * from users");



        while (myRs.next())
        {
            System.out.println(myRs.getString("ahmed"));
            System.out.println(myRs.getString("1234"));
        }
    }
    catch (Exception e)
    {
        System.out.println("Error with query");
      
    }
    }

    catch (Exception e)
    {
        System.out.println("Error connecting to database");
    }
    }

    catch (Exception e)
    {
        System.out.println(e);
    }
}
}