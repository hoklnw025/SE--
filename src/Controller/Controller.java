package Controller;

import Model.EditProduct;
import View.*;
import javax.swing.*;

public class Controller {
    Frame frame;
    
    public void run() {
        frame = new Frame(new Home(this));
    }
    
    public void goBack(JPanel back) {
        frame.changeCurrent(back);
    }
    
    public void goToHome() {
        frame.changeCurrent(new Home(this));
    }
    
    public void goToInvoice() {
        frame.changeCurrent(new Invoice(this));
    }
    
    public void goToAddProduct() {
        frame.changeCurrent(new AddStock(this));
    }
    
    public void goToAddCustomer() {
        frame.changeCurrent(new AddCustomer(this));
    }
    
    public void goToStock() {
        frame.changeCurrent(new Stock(this));
    }
    
    public void goToUpdate(String i) {
        EditProduct edit = new EditProduct(i);
        UpdateStock panel = new UpdateStock(this, edit);
        frame.changeCurrent(panel);
    }
    
    public void goToSerachCustomer() {
        frame.changeCurrent(new SearchCustomer(this));
    }
    
    public void goTOSelect(){
        frame.changeCurrent(new SelectStock(this));
    }
    
    public void Quit() {
        frame.dispose();
    }
    
}
