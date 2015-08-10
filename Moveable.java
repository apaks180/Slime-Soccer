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
        v = new Vector(0,0);
        a = new Vector(0,0);
    }
    
    public Vector getPosition()
    {
        return p;
    }
    public void setPosition(Vector vec)
    {
        p = vec;
    }
    public Vector getVelocity()
    {
        return v;
    }
    public void setVelocity(Vector vec)
    {
        v = vec;
    }
    public Vector getAcceleration()
    {
        return a;
    }   
    public void setAcceleration(Vector vec)
    {
        a = vec;
    }
    
    public abstract void draw(Graphics g);
    
        
    
}