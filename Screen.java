import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.KeyListener;
import java.awt.event.*;

public class Screen extends JComponent
{
    private JFrame frame;
    
    private static Vector v1 = new Vector((int)(Global.WIDTH/2 - 17),485);//position of ball
    private static Vector v2 = new Vector(250,505);//position of slime1
    private static Vector v3 = new Vector(650,505);//position of slime2
        
    private Ball b; 
    private Slime s1;
    private Slime s2;
    
    private static Background back = new Background();
    
    public Screen(JFrame f)
    {
        super();
        
        frame = f;
        frame.setSize(Global.WIDTH,Global.HEIGHT);
        
        
        b = new Ball(this,v1); 
        s1 = new Slime(this, v3,Global.SLIME1);        
        s2 = new Slime(this, v2,Global.SLIME2);
        s1.setLeft(); 
        s2.changeSlime();
        
        frame.addKeyListener(new Listener(s1));        
        frame.addKeyListener(new Listener(s2));   
    }
     public void paintComponent(Graphics g)
    {
        back.draw(g);
        b.draw(g);
        s1.draw(g);
        s2.draw(g); 
        
         
    }
    public void run()
    {
        
        
        while(true)
        {
            updateVariables();
            repaint();            
            try{Thread.sleep(37);}catch(InterruptedException e){}   //40
        }
    }
    public void updateVariables()
    {
        s1.updateVariables();
        s2.updateVariables();
        
        /*if((s1.getPosition().x + xcounter > 30) && (s1.getPosition().x + xcounter < (Global.WIDTH - 140))) 
        {
            s1.setPosition(new Vector(s1.getPosition().x + xcounter, 505 - ycounter));
        }
        else if(ycounter != 0)
            s1.setPosition(new Vector(s1.getPosition().x, 505 - ycounter));*/
        
        /*if((s2.getPosition().x + xcounter2 > 30) && (s2.getPosition().x + xcounter2 < (Global.WIDTH - 140))) 
        {
            s2.setPosition(new Vector(s2.getPosition().x + xcounter2, 505 - ycounter2));
        }
        else if(ycounter2 != 0)
            s2.setPosition(new Vector(s2.getPosition().x, 505 - ycounter2)); */                //s2.getVelocity().x, 505));
    }
}