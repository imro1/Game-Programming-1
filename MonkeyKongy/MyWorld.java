// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class MyWorld extends World
{
    protected Counter counter =  new Counter();

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        for (int i = 0;i <= 20;i++) {
            int x = Greenfoot.getRandomNumber(getWidth() - 1);
            int y = Greenfoot.getRandomNumber(getHeight() - 1);
            addObject( new Banana(), x, y);
        }
        for (int i = 0;i <= 20;i++) {
            int x = Greenfoot.getRandomNumber(getWidth() - 1);
            int y = Greenfoot.getRandomNumber(getHeight()) - 1;
            addObject( new Apple(), x, y);
        }
        prepare();
    }

    /**
     * 
     */
    public Counter getCounter()
    {
        return counter;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 100, 40);
        Banana banana =  new Banana();
        addObject(banana, 77, 56);
        Banana banana2 =  new Banana();
        addObject(banana2, 498, 56);
        Banana banana3 =  new Banana();
        addObject(banana3, 498, 311);
        Banana banana4 =  new Banana();
        addObject(banana4, 78, 316);
        Banana banana5 =  new Banana();
        addObject(banana5, 275, 187);
        Bomb bomb =  new Bomb();
        addObject(bomb, 392, 54);
        monkey monkey =  new monkey();
        addObject(monkey, 223, 331);
        Counter counter =  new Counter();
        removeObject(banana2);
        removeObject(banana3);
        removeObject(banana5);
        removeObject(banana4);
        removeObject(banana);
        counter.setLocation(50, 35);
        counter.setLocation(37, 9);
    }
}
