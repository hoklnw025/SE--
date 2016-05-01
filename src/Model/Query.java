/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Database;
import javax.swing.JOptionPane;
/**
 *
 * @author BestDark
 */
public class Query {
    Database d;

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
}
