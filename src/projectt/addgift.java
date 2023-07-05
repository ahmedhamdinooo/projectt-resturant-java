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
 * @author Emad Amin
 */
public class addgift extends DB {
     private int id;
      private String description ;
      
      
      addgift ()throws SQLException{
          
      }
       addgift (int id, String description) throws SQLException{ 
           this.id=id;
           this.description= description;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
       
       
    //METHOD********************************************************************
    
    public void addGift(addgift d) throws SQLException{
        DB db= new DB();   // connection
     String sql = "insert into gift values ( " +d.getId()+ " , '" + d.getDescription() + "' );";
     st.executeUpdate(sql);
     JOptionPane.showMessageDialog(null, "Added Successfully", "Add gift", JOptionPane.INFORMATION_MESSAGE);
        db. CloseConnection();  // close connection
            
    }
}
