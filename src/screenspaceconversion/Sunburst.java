/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package screenspaceconversion;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 *
 * @author mac
 */
public class Sunburst {
    private double centerX;
    private double centerY;
    private int spokes;
    private double length;
    
    public Sunburst(double centerX, double centerY, int spokes, double length) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.spokes = spokes;
        this.length = length;
    }
    
    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }
    
    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }
    
    public double getCenterX() {
        return this.centerX;
    }
    
    public double getCenterY() {
        return this.centerY;
    }
    
    public void draw(Graphics2D g2d) {
        for (int i = 0; i < spokes; i++) {
            double angle = (2 * Math.PI / spokes) * i;
            Line2D l = new Line2D.Double(
                    this.centerX,
                    this.centerY,
                    this.centerX + Math.cos(angle) * length,
                    this.centerY + Math.sin(angle) * length
                );
            
            g2d.draw(l);
        }
    }
}
