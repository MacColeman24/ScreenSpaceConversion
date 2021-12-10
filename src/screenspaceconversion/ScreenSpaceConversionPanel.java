/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package screenspaceconversion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

/**
 *
 * @author mac
 */
public class ScreenSpaceConversionPanel extends JPanel implements ActionListener {
    
    private Sunburst a;
    private Sunburst b;
    private Sunburst c;
    
    public ScreenSpaceConversionPanel() {
        
        this.a = new Sunburst(256.0, 256, 256, 256.0);
        this.b = new Sunburst(256.0, 256, 256, 256.0);
        this.c = new Sunburst(512, 256, 256, 256.0);
        this.setBackground(Color.BLACK);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setColor(new Color(255, 255, 255));
        this.a.draw(g2d);
        g2d.setColor(new Color(0, 255, 0));
        this.b.draw(g2d);
        g2d.setColor(new Color(0, 0, 255));
        this.c.draw(g2d);
        
        
        g2d.drawString("Hurray c:", 5, 15);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.b.setCenterX((this.b.getCenterX() + 1) % 512);
        this.repaint();
    }
    
}