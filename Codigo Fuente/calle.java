import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase contiene al mundo en general, contiene los metodos para inicializar los actores y mostar puntuacion y vidas
 */
public class calle extends World
{
    public Vidas life;
    Tablero vidas;
    Tablero puntos;
    /**
     * Constructor for objects of class calle.
     */
    public calle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 450, 1); 
        setPaintOrder(GameOver.class,Tablero.class,carro.class,roca.class,asaltante.class,ciclista.class);
        prepare();
        vidas=new Tablero(3,"Vidas:");
        puntos=new Tablero(0,"puntaje:");
        addObject(puntos,120,500);
        addObject(vidas,300,500);
    }

    /**
     * prepara el mundo, manda inicializar al jugador, lo coloca en el mundo y manda llamar los metodos para inicializar a los demas actores
     */
    public void prepare()
    {
        ciclista ciclista = new ciclista();
        addObject(ciclista,76,226);
        creacarro(4);
        crearoca(5);
        creaasaltante(2);
    }
    
    /**
     * Este metodo inicializa el actor carro
     */
    public void creacarro(int num)
    {
      int i=0;
      for (i=0;i<num;i++)
      {
          carro r=new carro();
          int x=830;
          int y=Greenfoot.getRandomNumber(450);
          addObject(r,x,y);
      }
    }
    
    /**
     * Este metodo inicializa el actor roca
     */
    public void crearoca(int num)
    {
      int i=0;
      for (i=0;i<num;i++)
      {
          roca r=new roca();
          int x=830;
          int y=Greenfoot.getRandomNumber(450);
          addObject(r,x,y);
      }
    }
    
    /**
     * Este metodo inicializa el actor asaltante
     */
    public void creaasaltante(int num)
    {
      int i=0;
      for (i=0;i<num;i++)
      {
          asaltante r=new asaltante();
          int x=830;
          int y=Greenfoot.getRandomNumber(450);
          addObject(r,x,y);
      }
    }
}
