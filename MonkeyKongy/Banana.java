// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Banana extends Actor
{

    /**
     * Act - do whatever the Banana wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(monkey.class)) {
            getWorld().removeObject(this);
        }
        turn(5);
    }
}
