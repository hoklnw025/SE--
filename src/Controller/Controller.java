package Controller;

import Model.*;
import View.*;
import java.util.ArrayList;
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
    
    public void goToUpdate() {
        frame.changeCurrent(new UpdateStock(this));
    }
    
    public void Quit() {
        frame.dispose();
    }
    
}
