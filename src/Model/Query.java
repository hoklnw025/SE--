/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Database;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author BestDark Fuck Nat nana
 */
public class Query {
    Database db = new Database();
    
    //for add Customer page
    public void InsertCustomer(String id, String fn, String ln, String sex, String tel, String add){
        try {
 
            String query = "INSERT INTO `customer`(`card_id`, `first_name`, `last_name`, `gender`, `tel`, `address`) "
                    + "VALUES ('"+id+"','"+fn+"','"+ln+"','"+sex+"','"+tel+"','"+add+"')";
            db.connect();
            db.execute(query);
            db.disconnect();
        } catch(Exception ex) { }
    }
    
    // end of add customer page
    
    public void SelectProduct(String t, String s){
        try {
            String query = "select * from Product where " + t + " = " + s;
            db.connect();
            db.execute(query);
            db.disconnect();
        } catch(Exception ex) { }
    }  
    
    public void addStock(String i, String t, String n, String c, String co, String u, String amo) {
        try {
            String query = "INSERT INTO `stock`(`product_id`, `product_type`, `product_name`, `product_color`, `product_cost`, `product_unit`, `product_amount`) "
                    + "VALUES ('"+i+"','"+t+"','"+n+"','"+c+"','"+co+"','"+u+"','"+amo+"')";
            db.connect();
            db.execute(query);
            db.disconnect();
        }catch(Exception e){ }        
    }
    
    public void updateStockNew(String old, String i, String t, String n, String c, String co, String u, String amo) {
         try {
             String query = "UPDATE 'stock' SET " + "'product_id' = '" + i + "' ,'product_type' = '" + t + "' ,'product_name = '" + n
                     + "' ,`product_color` = '" + c + "' ,`product_cost` = '" + co + "' ,`product_unit` = '" + u +"' ,`product_amount` = '" + amo + "'"
                     + " WHERE " + old; 
            db.connect();
            db.execute(query);
            db.disconnect();
         } catch(Exception e) {  }
    }
    
    public String stockOld(String i, String t, String n, String c, String co, String u, String amo){
        String old = "'product_id' = '" + i + "' ,'product_type' = '" + t + "' ,'product_name = '" + n
                     +"' ,`product_color` = '" + c + "' ,`product_cost` = '" + co + "' ,`product_unit` = '" + u +"' ,`product_amount` = '" + amo + "'";
        return old;
    }
    
    public Product StockDB(int i){
            Product product = null;
            String query = "SELECT * FROM `stock` ";
            db.connect();
            ArrayList<HashMap> list = db.rows(query);
            for(HashMap l : list) 
            {
                if(l.get("product_id").equals(i+"")){
                    product = new Product(""+l.get("product_id"), ""+l.get("product_type"), ""+l.get("product_name"), ""+l.get("product_color"), ""+l.get("product_cost"), ""+l.get("product_unit"), ""+l.get("product_amount"));
                    break;
                }
            }
            db.disconnect();
            return product;
    }
    public int CountStock(){
            int i = 0;
            String query = "SELECT * FROM `stock` ";
            db.connect();
            ArrayList<HashMap> list = db.rows(query);
            for(HashMap l : list) 
            {
                i++;
            }
            db.disconnect();
            return i;
    }
}
