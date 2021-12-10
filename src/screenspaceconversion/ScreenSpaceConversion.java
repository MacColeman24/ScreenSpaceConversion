/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package screenspaceconversion;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author mac
 */
public class ScreenSpaceConversion extends JFrame {

    private static final int WINDOW_WIDTH = 512;
    private static final int WINDOW_HEIGHT = 512;
    private static final String WINDOW_TITLE = "Window";
    private static final ImageIcon img = new ImageIcon("/home/mac/Downloads/Big_Floppa_and_Justin_2_(cropped).jpg");
    private ScreenSpaceConversionPanel sscp;
    
    
    public ScreenSpaceConversion() {
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setTitle(WINDOW_TITLE);
        this.setIconImage(img.getImage());
        
        this.sscp = new ScreenSpaceConversionPanel();
        
        Container pane = this.getContentPane();
        pane.add(this.sscp);
        
        Timer timer = new Timer(20, this.sscp);
        timer.start();
        
        this.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ScreenSpaceConversion ssc = new ScreenSpaceConversion();
        
    }
    
}
