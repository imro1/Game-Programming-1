// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Counter extends Actor
{
    protected int score = 15;
    private boolean first = true;

    /**
     * Act - do whatever the Counter wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage( new GreenfootImage("Remaining: " + score, 30, Color.GREEN, Color.WHITE));
        if (score == 0) {
            World myWorld = getWorld();
            YouWon youwon =  new YouWon();
            Apple apple =  new Apple();
            Banana banana =  new Banana();
            getWorld().removeObject(apple);
            getWorld().removeObject(banana);
            myWorld.addObject(youwon, myWorld.getWidth() / 2, myWorld.getHeight() / 2);
            Greenfoot.playSound("win.wav");
            Greenfoot.stop();
        }
        if ((score == 7) && (first == true)) {
            first = false;
            World myWorld = getWorld();
            myWorld.addObject( new Bomb(), getY(), getX());
        }
    }

    /**
     * 
     */
    public void addScore()
    {
        score = score - 1;
    }
}
