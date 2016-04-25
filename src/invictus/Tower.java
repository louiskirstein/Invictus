/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invictus;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Nick
 */
public class Tower {
    private final int width;
    private final int height;
    
    public Tower(int x, int y, int height, int width, int range, int damage, Image image){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.damage = damage;
        this.image = image;
        this.range = range;
    }
    
    public void draw(Graphics graphics){
        graphics.drawImage(image, x, y, width, height, null);
        graphics.drawOval(x + (width / 2) - range, y + (height / 2) - range, range * 2, range * 2);
        
    }
    
    private int x,y;
    private Image image;
    private int range;
    private int damage;

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return the range
     */
    public int getRange() {
        return range;
    }

    /**
     * @param range the range to set
     */
    public void setRange(int range) {
        this.range = range;
    }
    
    
}
