/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.awt.FlowLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author Jamsterman25
 */
public class ScannerInterface extends JFrame{
    
   JButton[] ItemButtons = new JButton[20];
        
    public ScannerInterface(){
        super("Scan Items");
        setLayout(new FlowLayout());
        //setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        for(int i=0; i<ItemButtons.length; i++){
            ItemButtons[i] = new JButton("Bigger Item Names");
            add(ItemButtons[i]);
        }
    }
    
    public static void main(String[] args){
        ScannerInterface test = new ScannerInterface();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setSize(300,400);
        
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
        int x = (int) rect.getMaxX() - test.getWidth();
        int y = 0;
        test.setLocation(x, y);
        test.setVisible(true);
    }
    
}
