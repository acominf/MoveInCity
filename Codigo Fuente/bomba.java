import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomba extends asaltante
{
    /**
     * crea una bomba aleatoriamente en el campo para que ataque al jugador
     */
    public void act() 
    {
        int p;
        p=super.creanumero();
        if(p==2)
        {
            super.avientabomba();
        }
        move(-1);
        World m=getWorld();
        calle cal=(calle)getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5){
            getWorld().removeObject(this);
            cal.puntos.aumentar();
            cal.crearoca(1);
        }
        else
        {
            if(getY()>=m.getHeight()-5||getY()<=5){
             getWorld().removeObject(this);
            }
            else
            {
                Actor ciclista=getOneObjectAtOffset(0,0,ciclista.class);
                if(ciclista!=null){
                    getWorld().removeObject(ciclista);
                    GameOver t=new GameOver();
                }
            }  
        }
    }    
}
