import greenfoot.*;  

/**
 * Bacteria fload along in the bloodstream. They are bad. Best to destroy
 * them if you can.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Bacteria extends Floater
{
    /**
     * Constructor: Initialise the speed to a somewhat random value.
     */
    public Bacteria()
    {
        super(1, Greenfoot.getRandomNumber(4) + 2);
    }
    
    /**
     * Specific offscreenBehavior for Bacteria - lose points.
     */
    @Override
    public void offscreenBehavior()
    {
        Bloodstream w = (Bloodstream) getWorld();
        w.addScore(-15);
        w.removeObject(this);
    }
}
