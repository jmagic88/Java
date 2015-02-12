package project6;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

/**
 * Eric Warden
 * CSC202 - Fall 2014
 * Project 6 - Program Parser
 * 
 * The purpose of this program is to practice the design and implementation of trees in Java. This
 * program will read the source code of another program and create a tree of all the reserve words
 * used by Java in a tree. All other words will be added to a dictionary. Both the contents of the
 * tree and the dictionary will be displayed at the end of the program as well as the 
 * frequency of the words found in the dictionary.
 * @author eric
 *
 */
public class Project6 {

	public static void main(String[] args) {
		printHeading("Project 6: Program Parser", "6 December 2014\n");
		
		/* Retrieve the file information from the command line. If no command line arguments
		 * exist, prompt user for information.
		 */
		String filename, parsedProgram;
		filename = parsedProgram = "";
		Scanner scanner, readFile, readProgram, readLine;
		scanner = readFile = readLine = readProgram = null;
		boolean correct = false;
		if(args.length > 0){
			filename = args[0];
			parsedProgram = args[1];
			try{
				readFile = new Scanner(new File(filename));
				readProgram = new Scanner(new File(parsedProgram));
			}catch(FileNotFoundException ex){
				do{
					scanner = new Scanner(System.in);
					System.out.println("Please enter filename: ");
					filename = scanner.next();
					
					System.out.println("Please enter the program to be parsed: ");
					parsedProgram = scanner.next();
					try{
						readFile = new Scanner(new File(filename));
						readProgram = new Scanner(new File(parsedProgram));
						correct = true;
					}catch(FileNotFoundException ex2){
						System.out.println("File not found. Please try again.");
					}
				}while(!correct);
			}
		}
		else{
			do{
				scanner = new Scanner(System.in);
				System.out.println("Please enter filename: ");
				filename = scanner.next();
				
				System.out.println("Please enter the program to be parsed: ");
				parsedProgram = scanner.next();
				try{
					readFile = new Scanner(new File(filename));
					readProgram = new Scanner(new File(parsedProgram));
					correct = true;
				}catch(FileNotFoundException ex){
					System.out.println("File not found. Please try again.");
				}
			}while(!correct);
			scanner.close();
		}
		
		//
	}
	
	private static void printHeading(String assignment, String date){
		System.out.println("Eric Warden\nCSC202-Fall2014\n" + date + assignment + "\n");
	}

}
