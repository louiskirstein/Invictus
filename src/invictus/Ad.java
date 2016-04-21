/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invictus;

import environment.Actor;
import environment.Velocity;
import images.ResourceTools;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;

/**
 *
 * @author LK
 */
public final class Ad extends Actor {
    
    public Ad(Point position, Velocity velocity) {
        super(position, velocity);
        this.setImage(((BufferedImage) ResourceTools.loadImageFromResource("invictus/ballon2.png")).getScaledInstance(50, 50, Image.SCALE_SMOOTH));
    }
    
}
