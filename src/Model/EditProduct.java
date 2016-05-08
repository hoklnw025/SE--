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
 * @author Tuk
 */
public class EditProduct extends Database{
    private String id;
    private String type;
    private String name;
    private String color;
    private String price;
    private String unit;
    private String amount;
    
    public EditProduct(String i){
            String query = "SELECT * FROM `stock` ";
            ArrayList<HashMap> list = db.queryRows(query);
            for(HashMap l : list) 
            {
                if(l.get("product_id").equals(i+"")){
                    id = ""+l.get("product_id"); 
                    type = ""+l.get("product_type"); 
                    name = ""+l.get("product_name"); 
                    color = ""+l.get("product_color"); 
                    price = ""+l.get("product_cost"); 
                    unit = ""+l.get("product_unit");
                    amount = ""+l.get("product_amount");
                    break;
                }
            }
    }
    
    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getPrice() {
        return price;
    }

    public String getUnit() {
        return unit;
    }

    public String getAmount() {
        return amount;
    }

}
