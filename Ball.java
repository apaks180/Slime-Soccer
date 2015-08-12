import java.awt.*;

public class Ball extends Moveable
{    
    private double r;
    
    public Ball(Screen s, Vector vector, double radius)
    {
        super(s, vector);
        r = radius;
    }
    
    public void draw(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.drawOval((int)p.x, (int)p.y, (int)r*2,(int)r*2);
    }
    
    public void updateVariables()
    {
        
    }
}