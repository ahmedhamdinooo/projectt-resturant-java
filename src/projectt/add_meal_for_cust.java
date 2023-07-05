/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Emad Amin
 */
public class add_meal_for_cust extends DB{
    private int id;
    private String meal_name;
    private String descreption;
    private float price;
    
    
    add_meal_for_cust()throws SQLException{
        
    }

    add_meal_for_cust(int Id, String Name, String Des) throws SQLException{
        
         this.id = Id;
        this.meal_name = Name;
        this.descreption = Des;
       
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
     * @return the meal_name
     */
    public String getMeal_name() {
        return meal_name;
    }

    /**
     * @param meal_name the meal_name to set
     */
    public void setMeal_name(String meal_name) {
        this.meal_name = meal_name;
    }

    /**
     * @return the descreption
     */
    public String getDescreption() {
        return descreption;
    }

    /**
     * @param descreption the descreption to set
     */
    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    
      public static void main(String[] args) {
      
   
}
      
      
      
  public void up_quantity(int Q,int id) throws SQLException {
        
        DB db= new DB();   // connection
            String sql = "update cust_order set quantity = " + Q + "  where Mealid = "+id;
            st.executeUpdate(sql);
           
        db. CloseConnection();  // close connection
            
     }
 
 public void up_price(float price,int id) throws SQLException {
        
        DB db= new DB();   // connection
            String sql = "update cust_order set price = " +price + "  where Mealid = "+id;
            st.executeUpdate(sql);
           
        db. CloseConnection();  // close connection
            
     }
  

 public void AddMeal( add_meal_for_cust m ) throws SQLException {

    DB db= new DB();   // connection
       String sql = "insert into cust_order(Mealid,meal,des)  values ( "+m.getId()+" , '" + m.getMeal_name() + "' , '" + m.getDescreption() + "' );";
       st.executeUpdate(sql);
     JOptionPane.showMessageDialog(null, "Added Successfully", "Add your order", JOptionPane.INFORMATION_MESSAGE);
    db. CloseConnection();  // close connection

   }
 
 public void deletemeal(int  id) throws SQLException {
        
        DB db= new DB();   // connection
            String sql = "delete from cust_order where id = " +id;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete your order ", JOptionPane.INFORMATION_MESSAGE);
        db. CloseConnection();  // close connection
            
     }
 
  public void Gift (int id_gift, int id) throws SQLException {
      
    DB db= new DB();   // connection
            String sql = "update cust_order set gift =" +id_gift+ "  where Mealid = " +id;
            st.executeUpdate(sql);
           
     db. CloseConnection();  // close connection
  
  }

 public void AddGift (int qun,int id) throws SQLException {
     if(qun<5){
        
     }
     else{
         switch(qun){
    case 5:
       add_meal_for_cust c= new add_meal_for_cust();
       c.Gift(1,id);
        break;
    case 10:
         
          add_meal_for_cust f= new add_meal_for_cust();
          f.Gift(2,id);
        break;
    case 15:
         
          add_meal_for_cust k= new add_meal_for_cust();
          k.Gift(3,id);
        break;
    case 20:
         
          add_meal_for_cust l= new add_meal_for_cust();
          l.Gift(4,id);
        break;    
    
                     }
        }
      
 }
 

  public void Offer (int id_offer, int id,float price) throws SQLException {
   
     DB db= new DB();   // connection
             float newprice=price-((float) (price*0.1));
            String sql = "update cust_order set offer =" +id_offer+ " ,price="+newprice+"  where Mealid = " +id;
            st.executeUpdate(sql);
           
     db. CloseConnection();  // close connection
  
  }
  

 public void AddOffer (int id,float old_price) throws SQLException {
    
    
  switch(id){
    case 18:
       add_meal_for_cust c= new add_meal_for_cust();
       c.Offer(28,18,old_price);
        break;
    case 19:
          add_meal_for_cust k= new add_meal_for_cust();
          k.Offer(29,19,old_price);
        break;
   

     }
 }
    
}
