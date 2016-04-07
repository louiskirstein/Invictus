/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invictus;

import environment.Environment;
import environment.MovableIntf;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import path.Path;
import path.PathEventHandler;
import path.PathEventType;
import path.PathSegment;

/**
 *
 * @author Nick
 */
class World extends Environment implements PathEventHandler {
    
    Path path;

    public World() {
        ArrayList<PathSegment> segments = new ArrayList<>();
        segments.add(new PathSegment(0, 150, 100, 150));
        segments.add(new PathSegment(100, 150, 100, 450));
        segments.add(new PathSegment(100, 450, 300, 450));
        segments.add(new PathSegment(300, 450, 300, 70));
        segments.add(new PathSegment(300, 70, 500, 70));
        segments.add(new PathSegment(500, 70, 500, 200));
        segments.add(new PathSegment(500, 200, 700, 200));
        segments.add(new PathSegment(700, 200, 700, 70));
        segments.add(new PathSegment(700, 70, 830, 70));
        segments.add(new PathSegment(830, 70, 830, 400));
        segments.add(new PathSegment(830, 400, 550, 400));
        segments.add(new PathSegment(550, 400, 550, 600));


        



        path = new Path(segments);
        
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        for (PathSegment segment: path.getPath()) {
            segment.draw(graphics);
        }
    }

//<editor-fold defaultstate="collapsed" desc="PathEventHandler">
    @Override
    public void pathEvent(PathEventType pathEventType, MovableIntf mover) {
        
    }
//</editor-fold>
    
}
