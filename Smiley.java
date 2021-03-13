import java.applet.*;
import java.awt.*; 
 
public class SmileyExample extends Applet{ 
    public void paint(Graphics g) 
    { 
 
        g.drawOval(80, 70, 150, 150);  // Oval for face outline 
		
        // Ovals for eyes 
        g.setColor(Color.BLACK); 
        g.fillOval(120, 120, 15, 15); 
        g.fillOval(170, 120, 15, 15); 
  
        g.drawArc(130, 180, 50, 20, 180, 180);  // Arc for the smile 

    } 
}