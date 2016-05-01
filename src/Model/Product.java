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
    private int id;
    private String type;
    private String name;
    private String color;
    private int price;
    private int unit;
    private int amount;
	
    public Product(int id, String type , String name, String color , int price, int amount) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.color = color;
        this.price = price;
        this.amount = amount;
    }
    
    public int getID() {
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
    public int getPrice() {
        return this.price;
    }
    public int getAmount() {
        return this.amount;
    }

}
