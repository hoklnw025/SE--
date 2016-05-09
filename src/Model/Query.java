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

    public Query() {
        super();
    }
    
    //for add Customer page
    public void InsertCustomer(String id, String fn, String ln, String sex, String tel, String add){
        try {
 
            String query = "INSERT INTO `customer`(`card_id`, `first_name`, `last_name`, `gender`, `tel`, `address`) "
                    + "VALUES ('"+id+"','"+fn+"','"+ln+"','"+sex+"','"+tel+"','"+add+"')";
            db.executeQuery(query);
        } catch(Exception ex) { }
    }
    
    // end of add customer page
    
    public void SelectProduct(String t, String s){
        try {
            String query = "select * from Product where " + t + " = " + s;
            db.executeQuery(query);
        } catch(Exception ex) { }
    }  
    
    public void addStock(String i, String t, String n, String c, String cos, String u, String amo) {
        try {
            String query = "INSERT INTO `stock`(`product_id`, "
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
    
    public Product StockDB(int i){
            Product product = null;
            String query = "SELECT * FROM `stock` ";
            ArrayList<HashMap> list = db.queryRows(query);
            for(HashMap l : list) 
            {
                if(l.get("product_id").equals(i+"")){
                    product = new Product(""+l.get("product_id"), 
                            ""+l.get("product_type"), 
                            ""+l.get("product_name"), 
                            ""+l.get("product_color"), 
                            ""+l.get("product_cost"), 
                            ""+l.get("product_unit"), 
                            ""+l.get("product_amount"));
                    break;
                }
            }
            return product;
    }
    public int CountStock(){
            int i = 0;
            String query = "SELECT * FROM `stock` ";
            ArrayList<HashMap> list = db.queryRows(query);
            i = list.stream().map((_item) -> 1).reduce(i, Integer::sum);
            return i;
    }
}
