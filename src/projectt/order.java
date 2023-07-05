 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;

import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;


/**
 *
 * @author Emad Amin
 */
public class order extends DB{
    private long id;
    private int meal_id;
    private int quantity;
     private float total;
    private int ID;
    private int employeeid;
    private int customer_id;
   
    
    order()throws SQLException{
        super();
         
    }
    
    
    order( int employeeid,int customer_id) throws SQLException {
       this.ID=ID;
       this.employeeid = employeeid;
       this.customer_id = customer_id;  
    }
    
    
    order(long id,int meal_id ,int quantity) throws SQLException {
        this.id=id;
        this.meal_id = meal_id;
        this.quantity = quantity;
       
    }
    order(long id,int quantity, float total) throws SQLException{
        this.id=id;
        this.quantity=quantity;
        this.total=total;
    }

    
       /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     * @return the employeeid
     */
    public int getEmployeeid() {
        return employeeid;
    }

    /**
     * @param employeeid the employeeid to set
     */
    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    /**
     * @return the customer_id
     */
    public int getCustomer_id() {
        return customer_id;
    }

    /**
     * @param customer_id the customer_id to set
     */
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }
    
    
        /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    
    
     /**
     * @return the meal_id
     */
    public int getMeal_id() {
        return meal_id;
    }

    /**
     * @param meal_id the meal_id to set
     */
    public void setMeal_id(int meal_id) {
        this.meal_id = meal_id;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    


       public static void main(String[] args) {
    // TODO Auto-generated method stub
    

    
}
    
    //method *******************************************************************
    
    
    public void MakeOrder(order m) throws SQLException {

       DB db= new DB();   // connection
     String sql = "insert into orders ( employee_id, customer_id) values (" + m.getEmployeeid() + " , "+m.getCustomer_id()+" );";
     st.executeUpdate(sql);
//     JOptionPane.showMessageDialog(null, "Added Successfully", "Add order ", JOptionPane.INFORMATION_MESSAGE);
       db. CloseConnection();  // close connection
            
   
   }
     
    public void CancelOrder(int  id) throws SQLException {
        
        DB db= new DB();   // connection
      String sql = "delete from orders where id = " +id;
      st.executeUpdate(sql);
      JOptionPane.showMessageDialog(null, "Cancel order Successfully", "Delete orders", JOptionPane.INFORMATION_MESSAGE);
         db. CloseConnection();  // close connection
            
     }


    public void Addorder(order m) throws SQLException {

        DB db= new DB();   // connection
     String sql = "insert into order_detail (order_id,meal_id,quntity) values ( " + m.getId()+ " , " + m.getMeal_id() + " ," + m.getQuantity() + " );";
     st.executeUpdate(sql);
   // JOptionPane.showMessageDialog(null, "Added Successfully", "Add  your order ", JOptionPane.INFORMATION_MESSAGE);
        db. CloseConnection();  // close connection
            
   
   }
    
    public void  TotalPrice (order m) throws SQLException{
          
             DB db= new DB();   // connection
        double Total= total*quantity;
        String sql = " update orders set total_bill  = " + Total + "  where id = "+m.getId();
       st.executeUpdate(sql);
     JOptionPane.showMessageDialog(null, "Added Successfully", "Add  total ", JOptionPane.INFORMATION_MESSAGE);
            db. CloseConnection();  // close connection
          
        
   }

    public int  or (int id) throws SQLException{
    int o=id;
    return o;
    
    }
   
   

     public void Time() throws SQLException{
        
       
         
         DB db= new DB();   // connection
         
        Calendar calendar = Calendar.getInstance();
        
        java.sql.Timestamp ourJavaTimestampObject = new java.sql.Timestamp(calendar.getTime().getTime());
        
        String sqlTimestampInsertStatement = "INSERT INTO orders (order_time) VALUES (?)";
        
        try (PreparedStatement preparedStatement = conn.prepareStatement(sqlTimestampInsertStatement)) {
          preparedStatement.setTimestamp(1, ourJavaTimestampObject);
          preparedStatement.executeUpdate();
                    }
        
     
        db. CloseConnection();  // close connection
     }

  

}

