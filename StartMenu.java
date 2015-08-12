import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.image.*;  
import javax.imageio.*;

public class StartMenu extends JComponent
{
    private JFrame frame;
    
    private Selection[] selections;
    
    private int currentlySelected;
    
    public StartMenu(JFrame f)
    {
        frame = f;
        
        int x = Global.WIDTH;
        int y = Global.HEIGHT;
        double u = y / 30.0;
        
        selections = new Selection[5];
        selections[0] = new Selection(8,3,10,23,u,"Highscores")
        {
            public void enter()
            {
            }
        };
        
        selections[1] = new Selection(22,11,25,3,u,"vs CPU")
        {
            public void enter()
            {
            }
        };
        
        selections[2] = new Selection(22,15,25,3,u,"2 Player")
        {
            public void enter()
            {
            }
        };
        
        selections[3] = new Selection(22,19,25,3,u,"Online")
        {
            public void enter()
            {
            }
        };
        
        selections[4] = new Selection(22,23,25,3,u,"Settings")
        {
            public void enter()
            {
            }
        };
        
        select(1);
    }
    
    private static void print(int i)
    {
        System.out.println(""+i);
    }
    
    public void selectNext(MouseEvent e)
    {
        for (int i = 0; i < selections.length; i++)
        {
            if (selections[i].contains(e))
            {
                print(i);
                print(currentlySelected);
                if (currentlySelected==i)
                    selections[i].enter();
                else
                    select(i);
            }
        }
        repaint();
    }
    
    //figures out what will next be selected when a key is pressed
    public void selectNext(KeyEvent e)
    {
        int key = e.getKeyCode();
        int nextSelected = currentlySelected; //the index of the selection that will be selected after this
        int s = currentlySelected;
        if (key==KeyEvent.VK_DOWN)
        {
            nextSelected = s+1;
        }
        else if (key==KeyEvent.VK_UP)
        {
            nextSelected = s-1;
        }
        else if (key==KeyEvent.VK_RIGHT)
        {
            if (s==0)//the big highscores sign on the left.
                nextSelected = 1;
            else
                nextSelected = 0;
        }
        else if (key==KeyEvent.VK_LEFT)
        {
            if (s==0)//the big highscores sign on the left.
                nextSelected = 1;
            else
                nextSelected = 0;
        }
        
        if (nextSelected>=selections.length)
            nextSelected = 0;
        else if (nextSelected<0)
            nextSelected = selections.length-1;
        
        select(nextSelected);
    }
    
    public int selected()
    {
        return currentlySelected;
    }
    
    public void select(int index)
    {
        selections[currentlySelected].deselect();
        selections[index].select();
        currentlySelected = index;
        frame.repaint();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        int x = Global.WIDTH;
        int y = Global.HEIGHT;
        
        double u = y / 30.0;

        drawPicture(g,(int)(u*20),(int)(2*u),(int)(u*30),(int)(u*4),"Title");
        
        for (Selection s: selections)
        {
            s.draw(g);
        }
    }
    
    //name is the name of the file, duh
    private static void drawPicture(Graphics g, int x, int y, int w, int h, String name)
    {
        g.drawRect(x,y,w,h);
        
        /*try 
        {                
           Image img = ImageIO.read(new File("Pictures/"+name));
           g.drawImage(img,x,y,w,h,null);
        } 
        catch (IOException ex) {System.out.println("Background wasn't found");System.exit(0);}*/
    }
}



//an option that can be clicked or selected through the keyboard
abstract class Selection
{
    int x;
    int y;
    int w;
    int h;
    
    String name;
    
    boolean selected;
    
    public Selection(double x1, double y1, double width, double height, double u, String str)
    {
        x = (int)(x1*u);
        y = (int)(y1*u);
        w = (int)(width*u);
        h = (int)(height*u);
        name = str;
        selected = false;
    }
    
    //sees if this selection contains the mouse event
    public boolean contains(MouseEvent e)
    {
        int mx = e.getX();
        int my = e.getY();
        
        return (mx>=x && mx<=x+w) && (my>=y && my<=y+h);
    }
    
    public void select()
    {
        selected = true;
    }
    
    public void deselect()
    {
        selected = false;
    }
    
    public void draw(Graphics g)
    {
        
        g.setColor(selected ? Color.RED : Color.BLACK);
        g.drawRect(x,y,w,h);
        /*try 
        {                
           Image img = ImageIO.read(new File("Pictures/"+name));
           g.drawImage(img,x,y,w,h,null);
        } 
        catch (IOException ex) {System.out.println("Background wasn't found");System.exit(0);}*/
    }
    
    public abstract void enter();
}