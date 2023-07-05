/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectt;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Date;
/**
 *
 * @author Emad Amin
 */
public class addoffer extends DB{
    
    private int id;
    
       private int meal_id;
        private String offer;
        
       
       addoffer()throws SQLException{
            super();
           
            
       }

    addoffer(int id ,int meal_id, String description) throws SQLException {
        super();
         
        this.id=id;
        this.meal_id = meal_id;
        this.offer=description;
        
    }

    addoffer(int meal_id, String descreption) throws SQLException{
        this.meal_id = meal_id;
        this.offer=descreption;
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
     * @return the offer
     */
    public String getOffer() {
        return offer;
    }

    /**
     * @param offer the offer to set
     */
    public void setOffer(String offer) {
        this.offer = offer;
    }
       public static void main(String[] args) throws SQLException {
 
    
}
    
    //METHOD********************************************************************
    
    public void addOffer(addoffer add) throws SQLException{
        DB db= new DB();   // connection
     String sql = "insert into offer ( meal_id ,offer) values ( "+add.getMeal_id()+" , '" + add.getOffer() + "' );";
     st.executeUpdate(sql);
     JOptionPane.showMessageDialog(null, "Added Successfully", "Add offer", JOptionPane.INFORMATION_MESSAGE);
        db. CloseConnection();  // close connection
            
    }
    
    
       
       
}
