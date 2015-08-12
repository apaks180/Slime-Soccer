import javax.swing.*;
import java.awt.*;


public class Tester
{
    public static void main()
    {
        JFrame f = new JFrame("Super Slime Soccer");     
                
        StartMenu menu = new StartMenu(f);

        f.setSize(Global.WIDTH,Global.HEIGHT);
        f.add(menu);
        MenuListener listener = new MenuListener(menu);
        f.addKeyListener(listener);
        f.addMouseListener(listener);
        
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        
        
        
        //System.out.println(""+Global.WIDTH / (Global.HEIGHT/30));
    }
}