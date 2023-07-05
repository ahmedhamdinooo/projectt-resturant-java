/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;

import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hajora
 */
public class customer extends DB{
    private int id;
    private String name;
    private String adderss;
    private String phone;
    
    customer() throws SQLException{
        
    }

    customer(int i, String name, String address, String phone) throws SQLException{
        this.id=i;
        this.name=name;
        this.adderss=address;
        this.phone=phone;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the adderss
     */
    public String getAdderss() {
        return adderss;
    }

    /**
     * @param adderss the adderss to set
     */
    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    
       public static void main(String[] args) {
    // TODO Auto-generated method stub

    
}
    
    
     public void AddCustomer(customer c) throws SQLException {
         DB db= new DB();   // connection
         String sql = "insert into customer   (name,address,phone) values ('" + c.getName() + "' , '" + c.getAdderss() + "' , '" + c.getPhone()+ "' );";
         st.executeUpdate(sql);
         JOptionPane.showMessageDialog(null, "Added Successfully", "Add customer", JOptionPane.INFORMATION_MESSAGE);
         db. CloseConnection();  // close connection
     }
                                                                     
   
     public void SaveCustomer(customer c) throws SQLException {
      
           DB db= new DB();   // connection
           String sql = "update customer set name ='" + c.getName() + "' , address= '" + c.getAdderss() + "' , phone = '" + c.getPhone() + "' where cust_id = "+c.getId();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Edited Successfully", "Edit customer", JOptionPane.INFORMATION_MESSAGE);
            db. CloseConnection();  // close connection
            
      }
      
     
    
     
     
     public void DeleteCustomer(int cust_Id) throws SQLException {
         
            DB db= new DB();   // connection
            String sql = "delete from customer where cust_id = " +cust_Id;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete customer", JOptionPane.INFORMATION_MESSAGE);
            db. CloseConnection();  // close connection
     }
    
}
