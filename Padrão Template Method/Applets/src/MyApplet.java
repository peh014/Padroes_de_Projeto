
import java.applet.Applet;
import java.awt.Graphics;


public class MyApplet extends Applet{
   String message;
   
   public void init(){
       message = "Hello World, I'm alive!";
       repaint();
   }   
   public void start(){
       message = "Now i'm starting up..";
       repaint();
   }   
   public void stop(){
       message = "Oh, now i'm being stopped..";
       repaint();
   }   
   public void destroy(){}
   
   public void paint(Graphics g){
       g.drawString(message,5,15);
   }
}
