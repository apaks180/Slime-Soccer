import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.KeyListener;
import java.awt.event.*;

public class Screen extends JComponent implements KeyListener
{
    private JFrame frame;
    
    private ArrayList entities;
    
    public Screen(JFrame f)
    {
        super();
                
        frame = f;
        f.setSize(Global.WIDTH,Global.HEIGHT);
    }
    public void keyReleased(KeyEvent e)
    {
        
    }
    public void keyPressed(KeyEvent e)
    {
        
    }
    public void keyTyped(KeyEvent e)
    {
        
    }
    public void paintComponent(Graphics g)
    {
        Vector v1 = new Vector((int)(Global.WIDTH/2 - 17),485);
        Vector v2 = new Vector(250,467);
        Vector v3 = new Vector(650,467);
        
        Ball b = new Ball(this,v1); 
        Slime s = new Slime(this, v2);
        Slime s2 = new Slime(this, v3);
        s2.setLeft();
        Background back = new Background();
        
        back.draw(g);
        b.draw(g);
        s.draw(g);
        s2.draw(g);
    }
    
    public void repaint()
    {
        
    }
}