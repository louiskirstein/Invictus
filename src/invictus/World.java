/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invictus;

import environment.Environment;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import path.Path;
import path.PathSegment;

/**
 *
 * @author Nick
 */
class World extends Environment {
    
    Path path;

    public World() {
        ArrayList<PathSegment> segments = new ArrayList<>();
        segments.add(new PathSegment(0, 100, 50, 100));
        segments.add(new PathSegment(50, 100, 50, 200));
//        segments.add(new PathSegment(new Point(0, 100), new Point(50, 100)));
//        segments.add(new PathSegment(new Point(50, 100), new Point(50, 200)));
        
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
    
}
