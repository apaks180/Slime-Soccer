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
    
    private Background back;
    
    public Screen(JFrame f)
    {
        super();
        
        frame = f;
        frame.setSize(Global.WIDTH,Global.HEIGHT);
        back = new Background();
        
        b = new Ball(this,v1,10); 
        s1 = new Slime(this, v3,Slime.SLIME1,true);        
        s2 = new Slime(this, v2,Slime.SLIME2,false);
        
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
        b.updateVariables();
    }
}