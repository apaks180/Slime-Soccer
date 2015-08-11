import java.awt.*;

public class Ball extends Moveable
{    
    public Ball(Screen s, Vector vector)
    {
        super(s, vector);
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.drawOval((int)p.x, (int)p.y, 20,20);
    }
}