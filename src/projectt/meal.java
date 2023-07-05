package projectt;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class meal extends DB{

    
    
    private int id;
    private String meal_name;
    private String descreption;
    private float price;
  
    
 
    meal()throws SQLException{
        super();
        
        this.id = id;
        
        this.meal_name = meal_name;
        
        this.descreption = descreption;
        
        this.price = price;
        
    }
    public meal (int id  ,String mealname, String des ,float price ) throws SQLException{
        
        this.id=id;
        
        this.meal_name=mealname;
        
        this.descreption=des;
        
        this.price=price;
        
 }

   public meal(int mealId, String mealName, float Price) throws SQLException{
         this.id=mealId;
         this.meal_name=mealName;
         this.price=Price;
    }

   public meal(String mealName, float Price) throws SQLException{
         this.meal_name=mealName;
         this.price=Price;
    }
      
     public void setMealId(int mealId) {
        this.id = mealId;
    }
     
      public int getMealId() {
        return id;
    }
      
       /**
     * @param mealName the mealName to set
     */
    public void setMealName(String mealName) {
        this.meal_name = mealName;
    }
    
    /**
     * @return the mealName
     */
    public String getMealName() {
        return meal_name;
    }

 
   /**
     * @param descreption
     * @para descreption the Description to set
     */
    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }
    
    
    /**
     * @return the descreption
     */
    public String getDescreption() {
        return descreption;
    }

     /**
     * @param Price the Price to set
     */
    public void setPrice(float Price) {
        this.price = Price;
    }
    
    

    /**
     * @return the Price
     */
    public float getPrice() {
        return price;
    }

   public static void main(String[] args) {
    // TODO Auto-generated method stub

    
}

 public void AddMeal(meal m) throws SQLException {

   DB db= new DB();   // connection
     String sql = "insert into meals values (  '" + m.getMealName() + "' , '" + m.getDescreption() + "' ," + m.getPrice() + " );";
     st.executeUpdate(sql);
     JOptionPane.showMessageDialog(null, "Added Successfully", "Add meal", JOptionPane.INFORMATION_MESSAGE);
   db. CloseConnection();  // close connection
            
   
   }
   
 
 public void SaveMeal(meal m) throws SQLException {
      
           DB db= new DB();   // connection
               String sql = "update meals set meal_name ='" + m.getMealName() + "', descreption= ' " + m.getDescreption() + "' ,price = " + m.getPrice() + "  where id = "+m.getMealId();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Edited Successfully", "Edit meals", JOptionPane.INFORMATION_MESSAGE);
          db. CloseConnection();  // close connection
            
      }
      
 
 
 public void deletemeal(int  id) throws SQLException {
        
        DB db= new DB();   // connection
            String sql = "delete from meals where id = " +id;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deleted Successfully", "Delete meals", JOptionPane.INFORMATION_MESSAGE);
         db. CloseConnection();  // close connection
            
     }
    
     
 

    
}