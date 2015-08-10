import java.awt.*;

public class Slime extends Moveable
{    
    private boolean right;
    private final int whichSlime;
    
    public Slime(Screen s, Vector vector, int slimeNum)
    {
        super(s, vector);
        right = true;
        whichSlime = Global.SLIME1;
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
    
    public void updateVariables()
    {
        p = Vector.addVectors(p,v);
        v = Vector.addVectors(v,a);
        
        double vsign = v.x/Math.abs(v.x);//this is either 1 or -1 for use in keeping the direction constant
        if (Math.abs(v.x)>Global.MAX_X_VELOCITY)
            v.x = Global.MAX_X_VELOCITY * vsign;//sets the velocity to the max.
            
        if (v.y >= 0)//makes sure gravity is less when slime is past peak
            a.y = Global.GRAVITY_GOING_DOWN;
    }
    
    public void setLeft()
    {
        right = false;
    }
    
    public void setRight()
    {
        right = true;
    }
    
    public int getWhichSlime()
    {
        return whichSlime;
    }
}