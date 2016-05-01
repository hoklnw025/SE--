/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Database;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author BestDark Fuck Nat nana
 */
public class Query {
    Database d;
    
    //for add Customer page
    public void InsertCustomer(boolean sex, String s, String p, String fn, String ls, String add){
        try {
            int gender = sex?0:1;
            String CusSex = "";
                  
            if(gender == 1) {
                CusSex = "female";
            } else {
                CusSex = "male";
            }     
        	checkSocialNo(s);
        	checkPhoneNumber(p);
        	String query = "insert into customer (socialNo,name,surName,sex,phoneNumber,address) " 
                                + "values('" + s +"','" + fn + "','" + ls + "','" + CusSex + "','" + p + "','" + add +"')";
            d.connect();
            d.execute(query);
            d.disconnect();
        } catch(Exception ex) { 
        }
    }
    
    public void checkSocialNo(String s) {
    	if(s.length() != 13) {
    		JOptionPane.showMessageDialog(null,"Social NO must be 13 characters.");
    	}
    }
    
    public void checkPhoneNumber(String s) {
    	if(s.length()!= 10) {
    		JOptionPane.showMessageDialog(null,"Phone Number must be 10 character.");
    	}
    }
    // end of add customer page
    
    public void ShowListTable(String t, String s){
           try {
               String query = "select * from Product where " + t + " = " + s;
           } catch(Exception ex) { }
        }
    
    
    public ArrayList<Product> getUsersList(){
        ArrayList<Product> usersList = new ArrayList<Product>();
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/mirror","root","");
        }catch(Exception e){
     	   e.printStackTrace();
        }     
        String query = "SELECT * FROM  product";
        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            Product user;
            while(rs.next())
            {
                user = new Product(rs.getInt("productID"),rs.getString("productType"),rs.getString("productName")
             		   				,rs.getString("productColor"), rs.getInt("productPrice"), rs.getInt("productAmount"));
         	   //user = new Product(rs.getInt("id"),rs.getString("fname"),rs.getString("lname"),rs.getInt("age"));
         	   usersList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usersList;
    }
    
    public void addStock(String i, String p, String u, String n, String c, String m) {
        if(i.length() > 13) {
            JOptionPane.showMessageDialog(null,"Invalid Product ID");
        } else {
            String query = "insert into product (productID,productPrice,productUnit,productName,productColor"
                    + ",productType) " + "values('" + i + "','" + p + "','" + u + "','" + n + "','" + c + "','" + m + "')";
            d.connect();
            d.execute(query);
            d.disconnect();
    	}
    }
}
