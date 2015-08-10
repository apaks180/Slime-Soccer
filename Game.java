import javax.swing.*;
import java.awt.event.KeyListener;

public class Game
{
    public static void main()
    {
        JFrame f = new JFrame("Super Slime Soccer");     
                
        Screen s = new Screen(f);
       

        f.add(s);
        
        f.setVisible(true);
        f.setLocationRelativeTo(null);   //Centers it     
        
        
         while(true)
        {
            s.updateVariables();
            s.repaint();            
            try{Thread.sleep(37);}catch(InterruptedException e){}   //40
        }
    }
}

//You  have a while loop somewhere with basically two methods in it: updateVariables() and repaint.
//Thpen you do thread.sleep(100) or something like that
//In updateVariables you do a for loop between all 3 moving objects and update their vectors. You draw them according to their position vectors next. 