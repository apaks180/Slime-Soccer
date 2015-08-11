import java.awt.*;

public class Slime extends Moveable
{    
    private int direction; //1 = left 2 = right 3 = still
    private boolean isLeft = true;
    private int whichSlime; //final int whichSlime;
    
    public Slime(Screen s, Vector vector, int slimeNum)
    {
        super(s, vector);
        direction = 2;
        whichSlime = Global.SLIME1;
    }
    
    public void draw(Graphics g)
    {
        g.setColor(Color.CYAN);
        g.fillArc((int)p.x, (int)p.y, 90, 70, 0, 180);      
        
        g.setColor(Color.BLACK);
        g.drawArc((int)p.x, (int)p.y, 90, 70, 0, 180);  
        g.drawLine((int)p.x, (int)p.y + 35, (int)p.x + 90, (int)p.y + 35);
        
        if(!isLeft)
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
        if(((p.x+v.x) > Global.LEFT_BOUND) && ((p.x+v.x) < Global.RIGHT_BOUND   )) //Establishes Left and Right bounds
        {
            p = Vector.addVectors(p,v);
            v = Vector.addVectors(v,a);
        }
        else //Stops you from moving past the bounds
        {
            p.y = p.y + v.y;
            v = Vector.addVectors(v,a);
        }
        
        //Jump starts out as constant velocity
        if(p.y<Global.PEAK) //Applies heavy acceleration just before the peak of the Slime's jump
        {
            a.y = Global.GRAVITY_GOING_UP;
        }
       
        if(p.y>Global.FLOOR) //Creates a floor so my slimes don't fall into the pits of hell
        {
            p.y = Global.FLOOR;
            v.y = 0;
        }
          
        if(direction==1 && v.x<0) //Prevents derpy turnaround accelerations 
            a.x = -Global.XACCELERATION;
        else if(direction==2 && v.x>0)
            a.x = Global.XACCELERATION;
        else if(v.x<0 && direction ==3)
            a.x = Global.XDECELERATION;
        else if(v.x>0 && direction ==3)
            a.x = -Global.XDECELERATION;  
    
        
        double vsign = v.x/Math.abs(v.x);//this is either 1 or -1 for use in keeping the direction constant
        if (Math.abs(v.x)>Global.MAX_X_VELOCITY)
            v.x = Global.MAX_X_VELOCITY * vsign;//sets the velocity to the max.
            
        if(Math.abs(v.x) <= Global.XDECELERATION && Math.abs(a.x) == Global.XDECELERATION)
        {
            a.x = 0;
            v.x = 0;
        }
                
        
        
        if (v.y >= 0)//makes sure gravity is less when slime is past peak
            a.y = Global.GRAVITY_GOING_DOWN;
    }
    
    public void setLeft()
    {
        direction = 1;;
        isLeft = true;
    }
    
    public void setRight()
    {
        direction = 2;
        isLeft = false;
    }
    
    public void setStill()
    {
        direction = 3;
    }
    
    public int getDirection()
    {
        return direction;
    }
    
    public int getWhichSlime()
    {
        return whichSlime;
    }
   
    public void changeSlime()
    {
        whichSlime = Global.SLIME2;
    }
}