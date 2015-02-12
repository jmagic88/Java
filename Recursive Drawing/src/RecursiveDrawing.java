/**
 * The purpose of this class is to draw a shape recursively whenever it is called.
 *
 * @author Eric Warden
 * CSC202 Fall 2014
 * Project 3
 *
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class RecursiveDrawing extends JComponent{
	
	//This is here because I was getting a compile warning that was bugging me
	private static final long serialVersionUID = 1L;
	
	public void paint(Graphics g){  
	      
		// Recover Graphics2D
	     Graphics2D g2 = (Graphics2D) g;
	     
	     //Sets initial radius and the position of the first circle
	     int radius = 150;
	     int x, y;
	     x = y = 300;
	
	     //Call the recursive method to draw the pattern
	     drawCircles(g2, x, y, radius);	  
	}
	
	/**
	 * This method creates a fractal pattern using circles.
	 * @param g2 The graphics object from awt.Graphics
	 * @param x -The x coordinate
	 * @param y -The y coordinate
	 * @param radius -The radius of the circle.  Since we must use the drawOval method, the radius can be used 
	 * 					to determine both the width and height by multiplying it by 2.
	 */
	public void drawCircles(Graphics2D g2, int x, int y, int radius){
	
	   g2.setColor(Color.BLUE);
		//Base case
	   if(radius <= 4){
	       return;
	   }
	   else{
		   //Conditional statement to set the color
		   if(radius % 2 == 0){
			   g2.setColor(Color.MAGENTA);
		   }
		   else if(radius % 2 == 1){
			   g2.setColor(Color.CYAN);
		   }
		   
		   // Draw circle
		   g2.drawOval(x - radius, y - radius, radius * 2, radius * 2);
		   
		   //Draws the left pattern
		   drawCircles(g2, x - radius, y, radius / 2);
		    //right pattern
		   drawCircles(g2, x + radius, y, radius / 2);
		   //top pattern
		   drawCircles(g2, x, y - radius, radius / 2);
		   //bottom pattern
		   drawCircles(g2, x, y + radius, radius / 2);
	   }
	}
}