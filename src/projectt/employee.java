/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Emad Amin
 */
public class employee  extends DB{
    
    
    private int emp_id;
    private String emp_username;
    private String emp_password;
    private String emp_name;
   
    private String emp_address;
    private String emp_Phone;
    private float Salary;

    
    employee () throws SQLException{
        
    }
   

    employee(int id, String username, String pass, String name, String address, String emp_Phone, float Salary) throws SQLException{
        this.emp_id=id;
        this.emp_username=username;
        this.emp_password=pass;
        this.emp_name=name;
        this.emp_address=address;
        this.emp_Phone=emp_Phone;
        this.Salary=Salary;
    }

  
    /**
     * @return the emp_id
     */
    public int getEmp_id() {
        return emp_id;
    }

    /**
     * @param emp_id the emp_id to set
     */
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    /**
     * @return the emp_username
     */
    public String getEmp_username() {
        return emp_username;
    }

    /**
     * @param emp_username the emp_username to set
     */
    public void setEmp_username(String  emp_username) {
        this.emp_username = emp_username;
    }
    /**
     * @return the emp_password
     */
    public String getEmp_password() {
        return emp_password;
    }

    /**
     * @param emp_password the emp_password to set
     */
    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }

    /**
     * @return the emp_name
     */
    public String getEmp_name() {
        return emp_name;
    }

    /**
     * @param emp_name the emp_name to set
     */
    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

   

    /**
     * @return the emp_address
     */
    public String getEmp_address() {
        return emp_address;
    }

    /**
     * @param emp_address the emp_address to set
     */
    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    /**
     * @return the emp_phone
     */
    public String getEmp_Phone() {
        return emp_Phone;
    }

    /**
     * @param Phone the emp_phone to set
     */
    public String setEmp_phone(String Phone) {
        return this.emp_Phone = Phone;

    }

    /**
     * @return the Salary
     */
    public float getSalary() {
        return Salary;
    }

    /**
     * @param Salary the emp_salary to set
     */
    public void setSalary(float Salary) {
        this.Salary = Salary;
    }
    
    //******************methods *********************************
    
     public void Addemployee(employee m) throws SQLException {

     DB db= new DB();   // connection
     
    String sql = "insert into employee  values ('"+m.getEmp_username()+"','"+m.getEmp_password()+"','" + m.getEmp_name() + "','" + m.getEmp_address() + "' ,'" + m.getEmp_Phone() + "' , "+m.getSalary()+" );";
      st.executeUpdate(sql);
      JOptionPane.showMessageDialog(null, "Added Successfully", "Add employee", JOptionPane.INFORMATION_MESSAGE ); 
      db. CloseConnection();  // close connection

      
   }
     
     
      public void Saveemployee(employee m) throws SQLException {
         
           DB db= new DB();   // connection
           String sql = "update employee set Username = '"+m.getEmp_username()+"' , Password = '"+m.getEmp_password()+"',Name ='" + m.getEmp_name() + "', Address= ' " + m.getEmp_address() + "' ,Phone = " + m.getEmp_Phone() + " ,Salary="+m.getSalary()+"  where id = "+m.getEmp_id();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Edited Successfully", "Edit employee", JOptionPane.INFORMATION_MESSAGE);
            db. CloseConnection();  // close connection
          
      }
    
      
       public void deleteemployee(int  employee_id) throws SQLException {
         
        DB db= new DB();   // connection
            String sql = "delete from employee where id = " + employee_id;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete employee", JOptionPane.INFORMATION_MESSAGE);
            db. CloseConnection();  // close connection
     }
    
   
//     public static  void log2 (String emp_username, String emp_password ){
//       
//       try{
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//         String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=restaurant_system;";
//             String user = "ahmed";
//             String pass = "12345";
//        try (Connection con = DriverManager.getConnection(dbURL, user, pass)) {
//            String sql ="select Username,Password from users where Username=? and Password=?";
//            PreparedStatement pst = con.prepareStatement(sql);
//            pst.setString(1,emp_username );
//            pst.setString(2, emp_password);
//            ResultSet rs=pst.executeQuery();
//            if(rs.next()){
//                JOptionPane.showMessageDialog(null, "username and password matched" );
//                
//         admin_options l = new admin_options();
//                l.setLocation(200, 200);
//                l.setVisible(true);
//               
//              
//            }
//            else{
//                JOptionPane.showMessageDialog(null, "username OR password not correct ");
//                
//            }
//             con.close();
//        }
//        
//    } catch(HeadlessException | ClassNotFoundException | SQLException e){
//      JOptionPane.showMessageDialog(null, e );
//        
//    }
//       
//   } 
   
    
    

}
