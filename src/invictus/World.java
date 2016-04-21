/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invictus;

import environment.Environment;
import environment.MovableIntf;
import environment.Velocity;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import path.Path;
import path.PathEventHandler;
import path.PathEventType;
import path.PathMoveManager;
import path.SegmentIntf;
import path.SimpleSegment;

/**
 *
 * @author Nick
 */
class World extends Environment implements PathEventHandler {

    Path path;

    //private final Ad ad;
    private final PathMoveManager pmm;
    private Menu newAd;

    public World() {

        setBackground(ResourceTools.loadImageFromResource("invictus/future-background.jpg"));

        ArrayList<SegmentIntf> segments = new ArrayList<>();
        segments.add(new SimpleSegment(new Point(0, 150), new Point(100, 150)));
        segments.add(new SimpleSegment(new Point(100, 150), new Point(100, 450)));
        segments.add(new SimpleSegment(new Point(100, 450), new Point(300, 450)));
        segments.add(new SimpleSegment(new Point(300, 450), new Point(300, 70)));
        segments.add(new SimpleSegment(new Point(300, 70), new Point(500, 70)));
        segments.add(new SimpleSegment(new Point(500, 70), new Point(500, 200)));
        segments.add(new SimpleSegment(new Point(500, 200), new Point(900, 200)));

        //ad = new Ad(new Point(0, 0), new Velocity(2, 2));
        //getActors().add(ad);

        pmm = new PathMoveManager(segments);
        pmm.setPathEventHandler(this);

        newAd = new Menu(25, 20, 80, 28, Color.GRAY, "Start");

    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
        if (pmm != null) {
            pmm.moveAll();
        }
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        if ((newAd != null) && (newAd.clicked(e.getPoint()))) {
            Ad aAd = new Ad(new Point(0, 0), new Velocity(0, 0));
            getActors().add(aAd);
            pmm.addMover(aAd);
            System.out.println("New Ad");
        }
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (pmm != null) {
            graphics.setColor(Color.MAGENTA);
            pmm.draw(graphics);
        }

        if (newAd != null) {
            newAd.draw(graphics);
        }

    }

    @Override
    public void pathEvent(PathEventType pathEventType, MovableIntf mover) {
        System.out.printf(" Path Event - %s\n", pathEventType.toString());
        
        switch (pathEventType){
            case PATH_END:
                // do damage to my base
                break;
        }
    }
}
