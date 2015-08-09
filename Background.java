import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.awt.image.BufferedImage;  
import javax.imageio.ImageIO;
public class Background
{
    private int[] ax = new int[4];
    private int[] ay = new int[4];
    private int[] ax2 = new int[4];
    private int[] ay2 = new int[4];
    
    private BufferedImage image;
    public void draw(Graphics g)
    {
//         Color lightbrown = new Color(160,82,45);
//         
//         
//         
//         
//         //Left wall
//         
//         g.setColor(lightbrown);                         
//               
//         int x[] = {0,0,80,80};
//         int y[] = {0,Global.HEIGHT-38,Global.HEIGHT-120,20};
//         g.fillPolygon(x,y,x.length);                
//        
//         //Right wall
//         
//         int xPoly[] = {Global.WIDTH, Global.WIDTH-20,Global.WIDTH-20,Global.WIDTH};
//         int yPoly[] = {0,Global.HEIGHT-80,Global.HEIGHT-80,0};
//            
//         
//         g.fillPolygon(xPoly,yPoly,xPoly.length);
        
        if(image==null)
        try {                
           image = ImageIO.read(new File("Background 1.png"));           
        } catch (IOException ex) {
            // handle exception...
        }
        
        
        
        g.drawImage(image,0,0,null);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}