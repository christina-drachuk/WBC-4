import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Floater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Floater extends Actor
{
    private int rotation;
    private int speed;
    
    public Floater(int rotation, int speed)
    {
        this.rotation = rotation;
        this.speed = speed;
    }
    /**
     * Act - do whatever the Floater wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() - speed, getY());
        turn(rotation);
        
        if (getX() == 0) 
        {
            offscreenBehavior();
        }
    }
    
    public void offscreenBehavior()
    {
        getWorld().removeObject(this);
    }
}
