// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class MyWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
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
        Hamburger hamburger =  new Hamburger();
        addObject(hamburger, 93, 190);
        Hamburger hamburger2 =  new Hamburger();
        addObject(hamburger2, 279, 66);
        Hamburger hamburger3 =  new Hamburger();
        addObject(hamburger3, 486, 188);
        Baby baby =  new Baby();
        addObject(baby, 286, 323);
        Bomb bomb =  new Bomb();
        addObject(bomb, 392, 54);
        Bomb bomb2 =  new Bomb();
        addObject(bomb2, 149, 49);
        Bomb bomb3 =  new Bomb();
        addObject(bomb3, 207, 171);
        baby.setLocation(158, 357);
        baby.setLocation(153, 356);
        Hamburger hamburger4 =  new Hamburger();
        addObject(hamburger4, 281, 316);
    }
}
