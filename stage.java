import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage extends World
{
    private BIRD bird;
    private int cloudSpawnTimer = 100;
    private int actCycle = 0;
    
    public stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        BIRD flappy = new BIRD();
        
        addObject(flappy, 100, getHeight()/2);
    }
    
    public void act(){
        actCycle++;
        
        if (actCycle % cloudSpawnTimer == 0) {
            spawnCloud();
    }

    
    }   

    private void spawnCloud() {
        cloud cloud = new cloud();
        int y = Greenfoot.getRandomNumber(getHeight() / 3);
        addObject(cloud, getWidth(), y);
        
    }

}
