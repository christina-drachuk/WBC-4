import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Red blood cells float in the blood stream, carrying oxygen. They don't interact
 * with the white blood cells - they just float past.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class RedCell extends Floater
{
    /**
     * Contructor: Initialise the floating speed to a random value.
     */
    public RedCell()
    {
        super(1, Greenfoot.getRandomNumber(2) + 1);
        setRotation(Greenfoot.getRandomNumber(360));
    }   
}
