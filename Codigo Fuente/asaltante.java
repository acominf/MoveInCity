import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asaltante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asaltante extends Obstaculos
{
    /**
     * Este metodo incializa al asaltante por herencia de la clase obstaculo
     */
    public void act() 
    {
        super.actasaltante(-7);
    }
    
    /**
     * Este metodo inicializa un numero aleatorio para crear la bomba
     */
    public int creanumero()
    {
        int p;
        p=Greenfoot.getRandomNumber(100);
        return p;
    }
    
    /**
     * Este metodo es heradado por la clase bomba para que el asaltante suelte al azar una bomba contra el jugador
     */
    public void avientabomba()
    {
        
    }
}
