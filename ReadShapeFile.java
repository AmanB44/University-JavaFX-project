package com.example.cs115_coursework_1;
/**
 * This class reads a shape file.
 *
 * @author you
 *
 */

import javafx.scene.paint.Color;
import java.io.*;
import java.util.Scanner;


public class ReadShapeFile {

	/**
	 * Reads the data file used by the program and returns the constructed queue
	 * 
	 * @param in
	 *            the scanner of the file
	 * @return the queue represented by the data file
	 */
	private static Queue<ClosedShape> readLineByLine(Scanner in) {
		Queue<ClosedShape> shapeQueue = new Queue<ClosedShape>();

		while (in.hasNextLine() && (in.hasNext("circle") || in.hasNext("oval") ||
				in.hasNext("rect") || in.hasNext("square")  || in.hasNext("triangle"))) {
			if (in.hasNext("circle")){
				in.next();
				int insertionTime = in.nextInt();
				int x = in.nextInt();
				int y = in.nextInt();
				int vx = in.nextInt();
				int vy = in.nextInt();
				Boolean isFilled = in.nextBoolean();
				int diameter = in.nextInt();
				double r = in.nextDouble()/255;
				double g = in.nextDouble()/255;
				double b = in.nextDouble()/255;
				Circle circle = new Circle(insertionTime, x, y, vx, vy, diameter, Color.color(r,g,b), isFilled);
				shapeQueue.enqueue(circle);
			}

			else if (in.hasNext("oval")){
				in.next();
				int insertionTime = in.nextInt();
				int x = in.nextInt();
				int y = in.nextInt();
				int vx = in.nextInt();
				int vy = in.nextInt();
				Boolean isFilled = in.nextBoolean();
				int width = in.nextInt();
				int height = in.nextInt();
				double r = in.nextDouble()/255;
				double g = in.nextDouble()/255;
				double b = in.nextDouble()/255;
				Oval oval = new Oval(insertionTime, x, y, vx, vy, width, height, Color.color(r,g,b), isFilled);
				shapeQueue.enqueue(oval);
			}

			else if (in.hasNext("rect")){
				in.next();
				int insertionTime = in.nextInt();
				int x = in.nextInt();
				int y = in.nextInt();
				int vx = in.nextInt();
				int vy = in.nextInt();
				Boolean isFilled = in.nextBoolean();
				int width = in.nextInt();
				int height = in.nextInt();
				double r = in.nextDouble()/255;
				double g = in.nextDouble()/255;
				double b = in.nextDouble()/255;
				Rect rectangle = new Rect(insertionTime, x, y, vx, vy, width, height, Color.color(r,g,b), isFilled);
				shapeQueue.enqueue(rectangle);

			}

			else if (in.hasNext("square")){
				in.next();
				int insertionTime = in.nextInt();
				int x = in.nextInt();
				int y = in.nextInt();
				int vx = in.nextInt();
				int vy = in.nextInt();
				Boolean isFilled = in.nextBoolean();
				int side = in.nextInt();
				double r = in.nextDouble()/255;
				double g = in.nextDouble()/255;
				double b = in.nextDouble()/255;
				Square square = new Square(insertionTime, x, y, vx, vy, side, Color.color(r,g,b), isFilled);
				shapeQueue.enqueue(square);
			}

			else if (in.hasNext("triangle")){
				in.next();
				int insertionTime = in.nextInt();
				int x = in.nextInt();
				int y = in.nextInt();
				int vx = in.nextInt();
				int vy = in.nextInt();
				Boolean isFilled = in.nextBoolean();
				int width = in.nextInt();
				int height = in.nextInt();
				double r = in.nextDouble()/255;
				double g = in.nextDouble()/255;
				double b = in.nextDouble()/255;
				Triangle triangle = new Triangle(insertionTime, x, y, vx, vy, width, height, Color.color(r,g,b), isFilled);
				shapeQueue.enqueue(triangle);
			}
		}
		in.close();
		return shapeQueue;
	}

	/**
	 * Method to read the file and return a queue of shapes from this file. The
	 * program should handle the file not found exception here and shut down the
	 * program gracefully.
	 * 
	 * @param filename
	 *            the name of the file
	 * @return the queue of shapes from the file
	 */
	public static Queue<ClosedShape> readDataFile(String filename) {
	    Scanner in = null;
		File inputFile = new File(filename);

		try {
			in = new Scanner(inputFile);

		} catch (FileNotFoundException e) {
			System.out.println("Could not find " + e.getMessage());
			System.exit (0);
		}

	    return ReadShapeFile.readLineByLine(in);
	}
}
