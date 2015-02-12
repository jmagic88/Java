/**
 * This is the main method for Project 3.  It calls the class RecursiveShape to draw a picture in a frame that is created within the main method.
 * @author Eric
 * CSC202 Fall 2014
 * Project 3
 * 
 */

import java.awt.Color;

import javax.swing.JFrame;

public class DrawIt {

	public static void main(String[] args) {
	
		//Print Heading
		printHeading("Project 3", "2 October 2014");
		
		//Creates the frame
		JFrame frame = new JFrame();
		
		//Sets the behavior for the frame
		frame.setSize(625, 650);
		frame.setTitle("Recursive Shape");
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);

		
		RecursiveDrawing drawing = new RecursiveDrawing();
		frame.add(drawing);
		frame.setVisible(true);
	}
	
	//Prints heading	
	private static void printHeading(String assignment, String date){
		System.out.println("Eric Warden\nCSC202-Fall2014\n" + date + "\n" + assignment + "\n");
	}
}