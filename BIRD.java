import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BIRD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BIRD extends Actor
{
    public BIRD(){
        GreenfootImage image = getImage();
        image.scale(50, 40);
    }
    
    double dy = 1;
    double g = 1.3;
    
    public void act()
    {
        setLocation (getX(), (int)  (getY() + dy) );
        
        if (Greenfoot.isKeyDown("space") == true) {
           dy = -10;
        }
        dy = dy + g;
        
    }
}
