/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invictus;

import environment.Actor;
import environment.Velocity;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author Nick
 */
public class Enemy extends Actor {

    public Enemy(BufferedImage image, Point position, Velocity velocity) {
        super(image, position, velocity);
    }
    
    /**
     *
     * @param graphics
     */
    @Override
    public void paint(Graphics graphics){
        super.paint(graphics);
        graphics.setColor(Color.red);
        graphics.drawRect(getPosition().x, getPosition().y, 50, 50);
    }

}
