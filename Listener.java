import java.awt.event.*;

public class Listener implements KeyListener
{
    private final int left;
    private final int right;
    private final int up;
    private final int down;
    
    private final Slime slime;
    
    public Listener(Slime s)
    {
        slime = s;
        int slimeType = slime.getWhichSlime();
        if (slimeType == Global.SLIME1)
        {
            left = KeyEvent.VK_LEFT;
            right = KeyEvent.VK_RIGHT;
            up = KeyEvent.VK_UP;
            down = KeyEvent.VK_DOWN;
        }
        else // (slimeType==Global.SLIME2)
        {
            left = KeyEvent.VK_A;
            right = KeyEvent.VK_D;
            up = KeyEvent.VK_W;
            down = KeyEvent.VK_S;
        }
    }
    
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        Vector a = slime.getAcceleration();
        Vector v = slime.getVelocity();
        if (key==left)
        {
            a.x = -Global.XACCELERATION;
        }
        else if (key==right)
        {
            a.x = Global.XACCELERATION;
        }
        else if (key==up)
        {
            v.y = -Global.JUMP_SPEED;
            a.y = Global.GRAVITY_GOING_UP;
        }
        else if (key==down)
        {
            //Don't think anything should happen here ever
        }
    }
    
    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        Vector a = slime.getAcceleration();
        if (key==left)
        {
            a.x = Global.XDECELERATION;
        }
        else if (key==right)
        {
            a.x = -Global.XDECELERATION;
        }
        else if (key==up)
        {
            //nothing needs to be here I think
        }
        else if (key==down)
        {
            //Don't think anything should happen here ever
        }
    }
    
    public void keyTyped(KeyEvent e){}
}