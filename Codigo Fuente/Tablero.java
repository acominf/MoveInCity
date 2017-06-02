import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
//import java.awt.Font;


/**
 * Esta clase diseña todo el tablero que muestra puntos y vidas
 */
public class Tablero extends Actor
{
    /**
     * Act - do whatever the Tablero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage imagen;
    int cont;
    String mensaje;
    
    public Tablero(int c,String msj)
    {
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("Verdana"/*,Font.BOLD*/,24));
        dibuja();
    }
   
    /**
     * Esta funcion borra el tablero y despues vuelve a escribirlo con los valores actuales
     */
   public void dibuja()
   {
    imagen.clear();
    imagen.drawString(mensaje+cont,20,20);
    setImage(imagen);   
   }
   
   /**
   * Esta funcion aumenta la puntuacion
   */
    public void aumentar()
   {
       cont=cont+10;
       dibuja();
    }
    
    /**
   * Esta funcion disminuye las vidas del jugador
   */
   public void disminuir()
   {
       cont--;
       dibuja();
   }
   /**
    * Esta funcion regresa las vidas para saber si el jugador ya ha perdido o aun no
    */
   public int obtenerValor()
   {
       return cont;
   }
}
