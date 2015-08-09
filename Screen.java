import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.KeyListener;
import java.awt.event.*;

public class Screen extends JComponent implements KeyListener
{
    private JFrame frame;
    
    private ArrayList entities;
    
    private Vector v1 = new Vector((int)(Global.WIDTH/2 - 17),485);
    private Vector v2 = new Vector(250,505);
    private Vector v3 = new Vector(650,505);
        
    private Ball b = new Ball(this,v1); 
    private Slime s = new Slime(this, v3);
    private Slime s2 = new Slime(this, v2);
    private Background back = new Background();
    
    private double xcounter = 0;
    private double xcounter2 = 0;
    private double ycounter = 0;
    private double ycounter2 = 0;
    public Screen(JFrame f)
    {
        super();
                
        frame = f;
        f.setSize(Global.WIDTH,Global.HEIGHT);
        
        
        s.setLeft();               
    }
    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode()== KeyEvent.VK_LEFT)
        {
            s.setVelocity(new Vector(0,0));
            xcounter = 0;
        }            
        if(e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode()== KeyEvent.VK_D)
        {
            s2.setVelocity(new Vector(0,0)); 
            xcounter2 = 0;
        }
        
    
    }
    public void keyPressed(KeyEvent e)
    {
        //if(s.getPosition().x < (Global.WIDTH - 50) && s.getPosition().x > 50)
        //{
            if(e.getKeyCode() == KeyEvent.VK_RIGHT) // && s.getPosition().x < Global.WIDTH - 140)
            {
                if(xcounter == 0)
                    xcounter = Global.minV;
                    else if(xcounter < Global.maxV)
                    xcounter++;
                    //s.setVelocity(new Vector(10,0));
                    s.setRight();
             }
            else if(e.getKeyCode() == KeyEvent.VK_LEFT) // && s.getPosition().x > 30)
             {
                if(xcounter == 0)
                    xcounter = -Global.minV;
                else if(xcounter > -Global.maxV)
                    xcounter--;
                    //s.setVelocity(new Vector(-10,0));
                    s.setLeft();
            }           
        
        //}
        
        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            if(ycounter == 0)
                ycounter = 15;
                 
            //s.setVelocity(new Vector(xcounter, ycounter));
        }
            
        //         if(s.getPosition().x > Global.WIDTH - 140 && e.getKeyCode() == KeyEvent.VK_RIGHT)
        //         {
        //             xcounter = 0;
        //         }
        //         if(s.getPosition().x < 30 && e.getKeyCode() == KeyEvent.VK_LEFT)
        //         {
        //             xcounter = 0;
        //         }
        
        if(e.getKeyCode() == KeyEvent.VK_D)
        {
            if(xcounter2 == 0)
                xcounter2 = Global.minV;
            else if(xcounter2 < Global.maxV)
                xcounter2++;
            //s2.setVelocity(new Vector(10,0));
            s2.setRight();
        }
        else if(e.getKeyCode() == KeyEvent.VK_A)
        {
            if(xcounter2 == 0)
                xcounter2 = -Global.minV;
            else if(xcounter2 > -Global.maxV)
                xcounter2--;
            //s2.setVelocity(new Vector(-10,0));
            s2.setLeft();
        }
        
         if(e.getKeyCode() == KeyEvent.VK_W)
        {
            if(ycounter2 == 0)
                ycounter2 = 15;
                 
            //s.setVelocity(new Vector(xcounter, ycounter));
        }
    }
    public void keyTyped(KeyEvent e)
    {
        
    }
    public void paintComponent(Graphics g)
    {
        back.draw(g);
        b.draw(g);
        s.draw(g);
        s2.draw(g); 
        
         
    }
    public void jumpPhysics()
    {
       if((ycounter % 15) == 0 && ycounter<110 &&ycounter != 0)
       {
           ycounter = ycounter + 15;
       }
       else if(ycounter == 120)
           ycounter -= 1;
       else if(ycounter == 119)
           ycounter -= 1;
       else if(ycounter == 118)
           ycounter -= 1;    
       else if(ycounter == 117)
           ycounter -= 1;    
       else if(ycounter == 116)        
           ycounter -= 3;
       else if(ycounter == 113)
            ycounter -= 3;
       else if(ycounter == 110)
           ycounter -= 3;  
       else if(ycounter == 107)
           ycounter -= 4;
       else if(ycounter == 103)
           ycounter -= 5;
       else if(ycounter == 98)
           ycounter -= 7;
       else if(ycounter == 91)
           ycounter -= 8;
       else if(ycounter == 83)
           ycounter -= 6;
       else if(ycounter == 77)
           ycounter -= 8;
       else if(ycounter == 69)
           ycounter -= 8;    
       else if(ycounter == 61)
           ycounter -= 8;
       else if(ycounter == 53)
           ycounter -= 10;
       else if(ycounter == 43)
           ycounter -= 12;
       else if(ycounter == 31)
           ycounter -= 15;
       else if(ycounter == 16)
           ycounter -= 16;
       
       if((ycounter2 % 15) == 0 && ycounter2<110 &&ycounter2 != 0)
        {
            ycounter2 = ycounter2 + 15;
        }
       else if(ycounter2 == 120)
            ycounter2 -= 1;
        else if(ycounter2 == 119)
            ycounter2 -= 1;
        else if(ycounter2 == 118)
            ycounter2 -= 1;    
        else if(ycounter2 == 117)
            ycounter2 -= 1;    
        else if(ycounter2 == 116)        
            ycounter2 -= 3;
        else if(ycounter2 == 113)
            ycounter2 -= 3;
        else if(ycounter2 == 110)
            ycounter2 -= 3;  
        else if(ycounter2 == 107)
            ycounter2 -= 4;
        else if(ycounter2 == 103)
            ycounter2 -= 5;
        else if(ycounter2 == 98)
            ycounter2 -= 7;
        else if(ycounter2 == 91)
            ycounter2 -= 8;
        else if(ycounter2 == 83)
            ycounter2 -= 6;
        else if(ycounter2 == 77)
            ycounter2 -= 8;
        else if(ycounter2 == 69)
            ycounter2 -= 8;    
        else if(ycounter2 == 61)
            ycounter2 -= 8;
        else if(ycounter2 == 53)
            ycounter2 -= 10;
        else if(ycounter2 == 43)
            ycounter2 -= 12;
        else if(ycounter2 == 31)
            ycounter2 -= 15;
        else if(ycounter2 == 16)
            ycounter2 -= 16;    
    }
    public void updateVariables()
    {
        jumpPhysics();
            
        //if((s.getPosition().x > 30 && xcounter>0) || (s.getPosition().x < (Global.WIDTH - 140) && xcounter<0))
        if((s.getPosition().x + xcounter > 30) && (s.getPosition().x + xcounter < (Global.WIDTH - 140))) 
        {
            s.setPosition(new Vector(s.getPosition().x + xcounter, 505 - ycounter));
        }
        else if(ycounter != 0)
            s.setPosition(new Vector(s.getPosition().x, 505 - ycounter));
        if((s2.getPosition().x + xcounter2 > 30) && (s2.getPosition().x + xcounter2 < (Global.WIDTH - 140))) 
        {
            s2.setPosition(new Vector(s2.getPosition().x + xcounter2, 505 - ycounter2));
        }
        else if(ycounter2 != 0)
            s2.setPosition(new Vector(s2.getPosition().x, 505 - ycounter2));                 //s2.getVelocity().x, 505));
        
        
    }
}