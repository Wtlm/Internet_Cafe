/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.internet_cafe;

import java.awt.*;
import javax.swing.border.Border;

/**
 *
 * @author HP
 */
public class RoundedBorder implements Border{
    private final int radius;

    public RoundedBorder(int radius) {
        this.radius = radius;
    }
    
    @Override
    public Insets getBorderInsets(Component c){
//        return new Insets(radius + 1, radius + 1, radius + 2, radius);
        return new Insets(0, 0, 0, 0);
    }
    
    @Override
    public boolean isBorderOpaque(){
        return true;
    }
    
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(c.getBackground());
        g2.fillRoundRect(0, 0, width - 1, height - 1, radius, radius);
    }
    
}
