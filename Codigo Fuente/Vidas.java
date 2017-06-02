import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vidas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vidas extends ciclista
{
    int numvidas= super.iniciavidas();
    /**
    * Esta Funcion detiene el juego si el jugador se queda sin vidas
     */
    public void disminuir()
    {
        numvidas--;
        if(numvidas<1)
        {
            Greenfoot.stop();
        }
    }
}
