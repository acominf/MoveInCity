import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstaculos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstaculos extends Actor
{
    /**
     * Este metodo inicializa el actor carro asigna su velocidad y manda a realizar las acciones correspondientes a un obstaculo
     */
    public void actcarro(int velocidad) 
    {
        move(velocidad);
        World m=getWorld();
        calle cal=(calle)getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5){
            getWorld().removeObject(this);
            cal.puntos.aumentar();
            cal.creacarro(1);
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
                    //getWorld().removeObject(this);
                    getWorld().addObject(new ciclista(),76,226);
                    cal.vidas.disminuir();
                    if(cal.vidas.obtenerValor()==0){
                        GameOver t=new GameOver();
                        getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
                    }
                }
            }  
        }
    } 
    
    /**
     * Este metodo inicializa el actor asaltante asigna su velocidad y manda a realizar las acciones correspondientes a un obstaculo
     */
    public void actasaltante(int velocidad) 
    {
        move(velocidad);
        World m=getWorld();
        calle cal=(calle)getWorld();
        if(getX()>=m.getWidth()-5||getX()<=5){
            getWorld().removeObject(this);
            cal.puntos.aumentar();
            cal.creaasaltante(1);
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
                    //getWorld().removeObject(this);
                    getWorld().addObject(new ciclista(),76,226);
                    cal.vidas.disminuir();
                    if(cal.vidas.obtenerValor()==0){
                        GameOver t=new GameOver();
                        getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
                    }
                }
            }  
        }
    } 
    
    /**
     * Este metodo inicializa el actor roca asigna su velocidad y manda a realizar las acciones correspondientes a un obstaculo
     */
    public void actroca(int velocidad) 
    {
        move(velocidad);
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
                    //getWorld().removeObject(this);
                    getWorld().addObject(new ciclista(),76,226);
                    cal.vidas.disminuir();
                    if(cal.vidas.obtenerValor()==0){
                        GameOver t=new GameOver();
                        getWorld().addObject(t,((getWorld().getWidth()/2)+30),((getWorld().getHeight()/2)+150));
                    }
                }
            }  
        }
    }  
}
