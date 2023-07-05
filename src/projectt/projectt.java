package projectt;

import java.sql.SQLException;

public class projectt {
    

public static void main(String[] args) {
    // TODO Auto-generated method stub

    
}

public void JframView(){
            veiw  view;
            view = new veiw ();
            view.setLocation(200, 200);
            view.setVisible(true);
}

public void JframAdminOption(){
             admin_options h= new admin_options();
             h.setLocation(200, 200);
             h.setVisible(true);
}


public void JframAddGift(){
              adgift f = new adgift();
              f.setLocation(200, 200);
              f.setVisible(true);
}



public void JframOffer(){
              offers o=new offers();
              o.setLocation(200, 200);
              o.setVisible(true);
}



public void JframViewEmployee(){
              view_employee a= new  view_employee();
              a.setLocation(200, 200);
              a.setVisible(true);
}


public void JframAddMeal(){
        add m=new add();
        m.setLocation(200, 200);
        m.setVisible(true);
}



public void JframReportEmployee(){
    
             report_emp s=new report_emp();
             s.setLocation(300, 400);
             s.setVisible(true);
}



public void JframReportCustomer(){
             report_cust r=new report_cust();
             r.setLocation(300, 300);
             r.setVisible(true);
}



public void JframViewGift(){
            add_gift x=new add_gift();
            x.setLocation(200, 200);
            x.setVisible(true);
}



public void JframUpdateAdmin(){
            up_admin u =new up_admin();
            u.setLocation(200, 200);
            u.setVisible(true);
}



public void JframLoginAdmin(){
            login n =new login();
            n.setLocation(200, 200);
            n.setVisible(true);
}


public void JframAddAdmin(){
            add_admin h= new add_admin();
            h.setLocation(200, 200);
            h.setVisible(true);
}



public void JframLoginEmployee(){
            login2 l = new login2 ();
            l.setLocation(200, 200);
            l.setVisible(true);
}


public void JframCustomerProfile(){
             customer_profile l = new customer_profile ();
             l.setLocation(200, 200);
             l.setVisible(true);
}


public void JframOrderList(){
            orders o=new orders();
            o.setLocation(200, 200);
            o.setVisible(true);
}


public void JframViewCustomer(){
            login_emp o=new login_emp();
            o.setLocation(200, 200);
            o.setVisible(true);
}




public void JframChooses(){
              choose t= new choose();
              t.setLocation(200,200);
              t.setVisible(true);
}


public void JframChoosesEmployee(){
       choose_emp l = new choose_emp();
       l.setLocation(200, 200);
       l.setVisible(true);
}

public void JframCustomerOrder(){
             cust_order t= new cust_order();
             t.setLocation(200,200);
             t.setVisible(true);
}



public void JframMake_Ord_Cust(){
              make_ord_cust t= new make_ord_cust();
              t.setLocation(200,200);
              t.setVisible(true);
}


public void JframCustomerInformation(){
            customer_info i=new customer_info();
            i.setLocation(200, 200);
            i.setVisible(true);
}


public void JframUpdateCustomer(customer c){
            update_cust p= new update_cust(c);
             p.setLocation(200, 200);
             p.setVisible(true);
}


public void JframMyOrder(){
           my_order o= new my_order();
           o.setLocation(200, 200);
           o.setVisible(true);
}



public void JframOrders(){
             orders o = new orders();
             o.setLocation(200, 200);
             o.setVisible(true);
}



public void JframPrice(){
             price o=new price();
             o.setLocation(200, 200);
             o.setVisible(true);
}


public void JframAddOffer(){
         add_offer s= new add_offer();
         s.setLocation(200, 200);
         s.setVisible(true);
}


public void JframMakeOrder( meal m){
        make_order o = new make_order(m);
        o.setLocation(200, 200);
        o.setVisible(true);
}


public void JframUpdateMeal( meal m){
 update p= new update(m);
             p.setLocation(200, 200);
             p.setVisible(true);
}


public void JframAddEmployee(){
 addemployee m= new addemployee();
        m.setLocation(200, 200);
        m.setVisible(true);}



public void JframUpdateEmployee(employee m){
update_employee p= new update_employee(m);
             p.setLocation(200, 200);
             p.setVisible(true);

}



public void JframOrderDetails() throws SQLException{
order_detail o= new order_detail();
        o.setLocation(200, 200);
        o.setVisible(true);}










}
