import java.awt.*;

public class Slime extends Moveable
{    
    private boolean right;
    
    public Slime(Screen s, Vector vector)
    {
        super(s, vector);
        right = true;
        
    }
    public void draw(Graphics g)
    {
        g.setColor(Color.CYAN);
        g.fillArc((int)p.x, (int)p.y, 90, 70, 0, 180);      
        
        g.setColor(Color.BLACK);
        g.drawArc((int)p.x, (int)p.y, 90, 70, 0, 180);  
        g.drawLine((int)p.x, (int)p.y + 35, (int)p.x + 90, (int)p.y + 35);
        
        if(right)
        {
            //Eyes
            g.drawOval((int)p.x+60, (int)p.y+13, 14, 14);
            g.setColor(Color.WHITE);
            g.fillOval((int)p.x+60, (int)p.y+13, 14, 14);
            //Pupils
            g.setColor(Color.BLACK);
            g.fillOval((int)p.x +67, (int)p.y+15, 7, 7);
            //Pupil Speckle
            // g.setColor(Color.WHITE);
            //g.fillOval((int)p.x + 68, (int)p.y + 17, 3, 3);
        }
        else
        {
            //Eyes
            g.drawOval((int)p.x + 14, (int)p.y + 13, 14, 14);
            g.setColor(Color.WHITE);
            g.fillOval((int)p.x + 14, (int)p.y +13, 14, 14);
            //Pupils
            g.setColor(Color.BLACK);
            g.fillOval((int)p.x + 14, (int)p.y + 15, 7, 7);
            //Pupil Speckle
            //g.setColor(Color.WHITE);
            //g.fillOval((int)p.x +15, (int)p.y + 17, 3, 3);
        }
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
    public void setLeft()
    {
        right = false;
    }
    public void setRight()
    {
        right = true;
    }
}