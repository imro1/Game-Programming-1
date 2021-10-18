// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class monkey extends Actor
{
    private GreenfootImage run1r =  new GreenfootImage("monk1.png");
    private GreenfootImage run2r =  new GreenfootImage("monk2.png");
    private GreenfootImage run3r =  new GreenfootImage("monk3.png");
    private GreenfootImage run4r =  new GreenfootImage("monk4.png");
    private double frame = 1;

    /**
     * 
     */
    public void act()
    {
        animatedRight();
        walk();
        resize();
        bananaTouch();
        bombTouch();
        score();
    }

    /**
     * 
     */
    public void walk()
    {
        if (Greenfoot.isKeyDown("up")) {
            move(8);
        }
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-5);
        }
    }

    /**
     * 
     */
    public void animatedRight()
    {
        if (frame == 0) {
            setImage(run1r);
        }
        else if (frame == 2) {
            setImage(run2r);
        }
        else if (frame == 3) {
            setImage(run3r);
        }
        else if (frame == 4) {
            setImage(run4r);
            frame = -10;
        }
        frame = frame + 1;
    }

    /**
     * 
     */
    public void resize()
    {
        GreenfootImage image = getImage();
        image.scale(50, 70);
        setImage(image);
    }

    /**
     * 
     */
    public void bananaTouch()
    {
        if (isTouching(Banana.class)) {
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * 
     */
    public void bombTouch()
    {
        if (isTouching(Bomb.class)) {
            World myWorld = getWorld();
            GameOver gameover =  new GameOver();
            myWorld.addObject(gameover, myWorld.getWidth() / 2, myWorld.getHeight() / 2);
            Greenfoot.playSound("BOOM.mp3");
            Greenfoot.stop();
        }
    }

    /**
     * 
     */
    public void score()
    {
        Actor Banana = getOneIntersectingObject(Banana.class);
        if (Banana != null) {
            World myWorld = getWorld();
            myWorld.removeObject(Banana);
            MyWorld myworld = (MyWorld)myWorld;
            Counter counter = myworld.getCounter();
            counter.addScore();
        }
        Actor Apple = getOneIntersectingObject(Apple.class);
        if (Apple != null) {
            World myWorld = getWorld();
            myWorld.removeObject(Apple);
            MyWorld myworld = (MyWorld)myWorld;
            Counter counter = myworld.getCounter();
            counter.addScore();
        }
    }
}
