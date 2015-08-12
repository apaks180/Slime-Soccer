import java.awt.event.*;

public class MenuListener implements KeyListener, MouseListener
{
    private StartMenu menu;
    
    public MenuListener(StartMenu m)
    {
        menu = m;
    }
    
    
    //key events
    public void keyPressed(KeyEvent e)
    {
        menu.selectNext(e);
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    
    
    //mouse events
    public void mouseClicked(MouseEvent e)
    {
        menu.selectNext(e);
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
}