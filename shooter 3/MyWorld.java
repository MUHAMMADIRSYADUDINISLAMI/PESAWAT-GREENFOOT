import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 720, 1);
        spawnplayer();
        this.scoreBroadsk
    } 
    
    private void spawnpemain(){
        random rnd = new random();
        Player p1 = new player();
        p1.setRotation(270);
        this.addObject(p1. rndnextint(),this.getheight()-30);
    }
    
    private void spawnEnemies(){
        random rnd = new random();
        for(int i= 0;i<rnd.nextint(5); i++){
            Enemies en = new Enemies();
            this.addobject(en, rnd.nextint(this.getWidth() - 30),5);
        }
    }
    public void act(){
        list<Enemies> Enemies = this.getObject(musuh.class);
        System.out.printin(enemies.size());
        if(enemies.size()==0){
            spawnmusuh();
        }
    }
}
        
    