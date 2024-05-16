import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class simpleActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class simpleActor extends Actor
{
    /**
     * Act - do whatever the simpleActor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        if(isAtEdge()){
            turn(45);
        }
        // British Alex was here
        // I drink tea, and I rap, I put the tea in trapper.
        // Tory donor, tony backer rest in peace to margaret thatcher
    }
}
