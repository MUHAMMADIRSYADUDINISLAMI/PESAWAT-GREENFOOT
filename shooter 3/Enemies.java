import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends character
{
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public Enemies(){
        GreenfootImage img = this.getImage();
        img.scale(60, 60);
        this.setImage(img);
        this.setRotation(90);
    }

public void act()
{
    this.move(6);
    world wrld = this.getWorld();
    
    List<Player> pls = this.getNeighbours(300, true, Player.class);
    if(pls.size()>0){
        this.turnTowards(pls.get(0).getx(),pls.get(0).getY());
    }
    
    if(this.getY() == wrld.getHeight()-1){
        wrld.removeObject(this);
    }
}
}