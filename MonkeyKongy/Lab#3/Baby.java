// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Baby extends Actor
{

    /**
     * Act - do whatever the Baby wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left")) {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(4);
        }
        if (Greenfoot.isKeyDown("down")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("up")) {
            move(4);
        }
        if (isTouching(Bomb.class)) {
            Greenfoot.stop();
        }
        if (getWorld().getObjects(Banana.class).isEmpty()) {
            Greenfoot.stop();
        }
    }
}
