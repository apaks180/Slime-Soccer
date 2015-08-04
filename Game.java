import javax.swing.*;
import java.awt.event.KeyListener;

public class Game
{
    public static void main()
    {
        JFrame f = new JFrame("Super Slime Soccer");     
                
        Screen s = new Screen(f);
       

        f.add(s);
        f.addKeyListener(s);
        
        f.setVisible(true);
        f.setLocationRelativeTo(null);   //Centers it     
        
        
        
        
        
        
    }
}