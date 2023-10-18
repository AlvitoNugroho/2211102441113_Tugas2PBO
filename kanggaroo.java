import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kanggaroo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kanggaroo extends Actor
{
    double dy = 1;
    double g = 1.3;
    
    public void act(){
        setLocation (getX(), (int)  (getY() + dy) );
        
        if (Greenfoot.isKeyDown("space") == true) {
           dy = -10;
        }
        dy = dy + g;
    }
}
