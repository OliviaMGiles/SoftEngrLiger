/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;

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
        
        CardLayout CustomerCards = (CardLayout)checkout.CustomerPanel.getLayout();
        
        // SCANNER SETUP - Sets size and mandates top right corner
        scan.setSize(400,400);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
        int x = (int) rect.getMaxX() - scan.getWidth();
        int y = 0;
        scan.setLocation(x, y);
        
        // MENU ACTION LISTENERS
        // <editor-fold>
        menu.CheckoutButton.addActionListener((ActionEvent goToCheckout) -> {
            checkout.setVisible(true);
        });
        
        menu.RestockButton.addActionListener((ActionEvent goToRestock) -> {
            restock.setVisible(true);
        });
        
        menu.ManageButton.addActionListener((ActionEvent goToManage) -> {
            manage.setVisible(true);
        });
        // </editor-fold>
        
        // CHECKOUT ACTION LISTENERS
        // <editor-fold>
        checkout.ScanItemsButton.addActionListener((ActionEvent openItems) -> {
            scan.setVisible(true);
        });
        
        checkout.CompleteCheckoutButton.addActionListener((ActionEvent goToPayment) -> {
            CustomerCards.show(checkout.CustomerPanel, "PaymentCard");
        });
        
        checkout.CancelButton.addActionListener((ActionEvent returnToMenu) -> {
            checkout.setVisible(false);
            menu.setVisible(true);
        });
        // </editor-fold>
        
        // CHECKOUT.PAYMENTCARD ACTION LISTENERS
        // <editor-fold>
        checkout.CashButton.addActionListener((ActionEvent goToCash) -> {
            CustomerCards.show(checkout.CustomerPanel, "CashPanel");
        });
        
        checkout.CardButton.addActionListener((ActionEvent goToCard) -> {
            CustomerCards.show(checkout.CustomerPanel, "CardPanel");
        });
        
        checkout.CancelPaymentButton.addActionListener((ActionEvent goToPayment) -> {
            CustomerCards.show(checkout.CustomerPanel, "CheckoutCard");
        });
        // </editor-fold>
        
        // CHECKOUT.CASHPANEL ACTION LISTENERS
        // <editor-fold>
        checkout.CardButton2.addActionListener((ActionEvent goToCard) -> {
            CustomerCards.show(checkout.CustomerPanel, "CashPanel");
        });
        
        checkout.CancelCash.addActionListener((ActionEvent goToCard) -> {
            CustomerCards.show(checkout.CustomerPanel, "CardPanel");
        });
        // </editor-fold>
        
        // CHECKOUT.CASHPANEL MONEY BUTTON ACTION LISTENERS
        // <editor-fold>
        
        // </editor-fold>
        
        // CHECKOUT.CARDPANEL ACTION LISTENERS
        // <editor-fold>
        checkout.SwipeButton.addActionListener((ActionEvent swipeCard) -> {
            CustomerCards.show(checkout.CustomerPanel, "CashPanel");
        });
        
        checkout.CashButton2.addActionListener((ActionEvent goToCash) -> {
            CustomerCards.show(checkout.CustomerPanel, "CashPanel");
        });
        
        checkout.CancelCardButton.addActionListener((ActionEvent returnToCheckout) -> {
            CustomerCards.show(checkout.CustomerPanel, "CheckoutCard");
        });
        // </editor-fold>
        
        // RESTOCK ACTION LISTENERS
        // <editor-fold>
        
        // </editor-fold>
     
        // MANAGE ACTION LISTENERS
        // <editor-fold>
        
        // </editor-fold>
    }
}
