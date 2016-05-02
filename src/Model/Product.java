/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 *
 * @author BestDark
 */
public class Product {
    private String id;
    private String type;
    private String name;
    private String color;
    private String price;
    private String unit;
    private String amount;
	
    public Product(String id, String type , String name, String color , String price, String unit, String amount) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.color = color;
        this.price = price;
        this.unit = unit;
        this.amount = amount;
    }
    
    public String getID() {
        return this.id;
    }
    
    public String getType() {
        return this.type;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getColor() {
        return this.color;
    }
    public String getPrice() {
        return this.price;
    }
    public String getAmount() {
        return this.amount;
    }
    public String getUnit() {
        return this.unit;
    }
}
