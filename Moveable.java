import java.awt.*;

public abstract class Moveable
{
    protected Vector p;         //position
    protected Vector v;         //velocity
    protected Vector a;         //acceleration
    
    protected Screen screen;
    
        
    public Moveable(Screen s, Vector vector)
    {
        screen = s;
        p = vector;
    }
    
    public abstract void draw(Graphics g);
    
        
    
}