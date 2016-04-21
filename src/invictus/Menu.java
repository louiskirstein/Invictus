/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invictus;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author LK
 */
 class Menu {
    
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final Color color;
    private final String label;
    
    public Menu(int x, int y, int width, int height, Color color, String label){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.label = label;
    }
    
    public void draw(Graphics graphics){
        graphics.setColor(color);
        graphics.fill3DRect(x, y, width, height, true);
        
        graphics.setColor(Color.BLACK);
        graphics.drawString(label, x + 5, y + 18);
    }
    
    public boolean clicked(int x, int y){
        return new Rectangle(x, y, width, height).contains(x, y);
    }
    
    public boolean clicked(Point location){
        return clicked(location.x, location.y);
    }
    
}

    



