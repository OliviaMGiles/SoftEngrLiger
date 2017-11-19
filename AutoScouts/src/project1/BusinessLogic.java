/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jamsterman25
 */
public class BusinessLogic {
    
    
    public static void main(String[] args){
        MenuGUI menu = new MenuGUI();
        menu.setVisible(true);
        
        CustomerGUI checkout = new CustomerGUI();
        RestockerGUI restock = new RestockerGUI();
        ManagerGUI manage = new ManagerGUI();
        ScannerInterface scan = new ScannerInterface();
            
        
        menu.CheckoutButton.addActionListener((ActionEvent goToCheckout) -> {
            checkout.setVisible(true);
        });
        
        menu.RestockButton.addActionListener((ActionEvent goToRestock) -> {
            restock.setVisible(true);
        });
        
        menu.ManageButton.addActionListener((ActionEvent goToManage) -> {
            manage.setVisible(true);
        });
        
        
        checkout.ScanItemsButton.addActionListener((ActionEvent OpenItems) -> {
            scan.setVisible(true);
        });
        
        checkout.CompleteCheckoutButton.addActionListener((ActionEvent goToPayment) -> {
            CardLayout CustomerCards = (CardLayout)checkout.CustomerPanel.getLayout();
            CustomerCards.show(checkout.CustomerPanel, "PaymentCard");
        });
        
        checkout.CancelButton.addActionListener((ActionEvent OpenItems) -> {
            checkout.setVisible(false);
            menu.setVisible(true);
        });
  
        checkout.CancelPaymentButton.addActionListener((ActionEvent goToPayment) -> {
            CardLayout CustomerCards = (CardLayout)checkout.CustomerPanel.getLayout();
            CustomerCards.show(checkout.CustomerPanel, "CheckoutCard");
        });
     
    }
}
