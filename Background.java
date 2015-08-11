import java.awt.*;
import java.io.*;
import java.awt.image.BufferedImage;  
import javax.imageio.ImageIO;
public class Background
{
    private Image image;
    
    public Background()
    {
        try 
        {                
           image = ImageIO.read(new File("Background 1.png"));           
        } 
        catch (IOException ex) {System.out.println("Background wasn't found");}
    }
    
    public void draw(Graphics g)
    {
        g.drawImage(image,0,0,null);
    }
}