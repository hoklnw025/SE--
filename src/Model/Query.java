/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author BestDark Fuck Nat nana
 */
public class Query extends Database{

 
    //for add Customer page
    public void InsertCustomer(String id, String fn, String ln, String sex, String tel, String add){
        try {
 
            String query = "INSERT INTO `customer`(`card_id`, `first_name`, `last_name`, `gender`, `tel`, `address`) "
                    + "VALUES ('"+id+"','"+fn+"','"+ln+"','"+sex+"','"+tel+"','"+add+"')";
            db.executeQuery(query);
        } catch(Exception ex) { }
    }
    // end of add customer page
    
    public ArrayList<String> Products(){   
        ArrayList<String> myArrList = new ArrayList<String>();
        String query = "SELECT * FROM `stock` ";
        ArrayList<HashMap> list = db.queryRows(query);
            for(HashMap l : list) 
            {
                myArrList.add(""+l.get("product_id"));
                myArrList.add(""+l.get("product_type"));
                myArrList.add(""+l.get("product_name"));
                myArrList.add(""+l.get("product_color")); 
                myArrList.add(""+l.get("product_cost"));
                myArrList.add(""+l.get("product_unit"));
                myArrList.add(""+l.get("product_amount"));
            }
        return myArrList;
    }
    
    public ArrayList<String> searchProduct(String t, String s){   
        ArrayList<String> myArrList = new ArrayList<String>();
        String query = "SELECT * FROM `stock` WHERE `"+t+"` LIKE '%"+s+"%'";
        ArrayList<HashMap> list = db.queryRows(query);
            for(HashMap l : list) 
            {
                myArrList.add(""+l.get("product_id"));
                myArrList.add(""+l.get("product_type"));
                myArrList.add(""+l.get("product_name"));
                myArrList.add(""+l.get("product_color")); 
                myArrList.add(""+l.get("product_cost"));
                myArrList.add(""+l.get("product_unit"));
                myArrList.add(""+l.get("product_amount"));
            }
        return myArrList;
    }  
    
    public ArrayList<String> Customers(){   
        ArrayList<String> myArrList = new ArrayList<String>();
        String query = "SELECT * FROM `customer` ";
        ArrayList<HashMap> list = db.queryRows(query);
            for(HashMap l : list) 
            {
                myArrList.add(""+l.get("card_id"));
                myArrList.add(""+l.get("first_name"));
                myArrList.add(""+l.get("last_name"));
                myArrList.add(""+l.get("gender")); 
                myArrList.add(""+l.get("tel"));
                myArrList.add(""+l.get("address"));
            }
        return myArrList;
    }
    
    public ArrayList<String> searchCustom(String t, String s){   
        ArrayList<String> myArrList = new ArrayList<String>();
        String query = "SELECT * FROM `customer` WHERE `"+t+"` LIKE '%"+s+"%'";
        ArrayList<HashMap> list = db.queryRows(query);
            for(HashMap l : list) 
            {
                myArrList.add(""+l.get("card_id"));
                myArrList.add(""+l.get("first_name"));
                myArrList.add(""+l.get("last_name"));
                myArrList.add(""+l.get("gender")); 
                myArrList.add(""+l.get("tel"));
                myArrList.add(""+l.get("address"));
            }
        return myArrList;
    }
    
    public ArrayList<String> searchForAddress(String fs, String ls){   
        ArrayList<String> myArrList = new ArrayList<String>();
        String query = "SELECT * FROM `customer` WHERE `first_name` LIKE '%"+fs+"%' "
                + "AND"
                + "`last_name` LIKE '%"+ls+"%'";
        ArrayList<HashMap> list = db.queryRows(query);
            for(HashMap l : list) 
            {
                myArrList.add(""+l.get("address"));
                break;
            }
        return myArrList;
    }
    
    public void addStock(String i, String t, String n, String c, String cos, String u, String amo) {
        try {
            String query = "INSERT INTO `stock`"
                    + "(`product_id`, "
                    + "`product_type`, "
                    + "`product_name`, "
                    + "`product_color`, "
                    + "`product_cost`, "
                    + "`product_unit`, "
                    + "`product_amount`) "
                    + "VALUES ('"+i+"','"+t+"','"+n+"','"+c+"','"+cos+"','"+u+"','"+amo+"')";
            db.executeQuery(query);
        }catch(Exception e){ }        
    }
    
    public void updateStockNew(String i, String t, String n, String c, String cos, String u, String amo) {
         try {
             String query = "UPDATE `stock` SET "
                     + "`product_type`='"+t+"',"
                     + "`product_name`='"+n+"',"
                     + "`product_color`='"+c+"',"
                     + "`product_cost`='"+cos+"',"
                     + "`product_unit`='"+u+"',"
                     + "`product_amount`='"+amo+"' "
                     + "WHERE `product_id`= '"+i+"'"; 
            db.executeQuery(query);
         } catch(Exception e) {  }
    }
    
    public String lastestInvoid(){   
        ArrayList<String> myArrList = new ArrayList<String>();
        String query = "SELECT * FROM `invoice`";
        ArrayList<HashMap> list = db.queryRows(query);
            for(HashMap l : list) 
            {
                myArrList.add(""+l.get("invoice_id"));
            }
        //System.out.println(myArrList.size());
        return myArrList.get(myArrList.size()-1);
    }
    
    public void addInvoid(String f, String l, String a, String d, String t) {
        try {
            String query = "INSERT INTO `invoice`(`cus_firstName`, `cus_lastName`, `cus_address`, `date`, `total_cost`) "
                    + "VALUES "
                    + "("
                    + "'"+f+"',"
                    + "'"+l+"',"
                    + "'"+a+"',"
                    + "'"+d+"',"
                    + "'"+t+"'"
                    + ")";
            db.executeQuery(query);
        }catch(Exception e){ }        
    }
    
    public void addInvoidDetail(String id, String n, String c, String u, String amo, String perAmo, String cost) {
        try {
            //System.out.println(id);
            String query = "INSERT INTO `invoice_detail`(`invoice_id`, `product_name`, `product_color`, `product_unit`, `product_amount`, `cost_perAmount`, `total_cost`) "
                    + "VALUES "
                    + "("
                    + "'"+id+"',"
                    + "'"+n+"',"
                    + "'"+c+"',"
                    + "'"+u+"',"
                    + "'"+amo+"',"
                    + "'"+perAmo+"',"
                    + "'"+cost+"'"
                    + ")";
            db.executeQuery(query);
        }catch(Exception e){ }        
    }
    
}
