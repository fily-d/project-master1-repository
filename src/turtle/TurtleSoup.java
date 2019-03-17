/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package turtle;

import java.util.List;
import java.util.ArrayList;

public class TurtleSoup {
	
	private static double currentHeading;
	private static double CIRCLE_DEGRES = 360;
    
    /**
     * Draw a square.
     * 
     * @param turtle the turtle context
     * @param sideLength length of each side
     */
    public static void drawSquare(Turtle turtle, int sideLength) {
        //throw new RuntimeException("implement me!");
    	for (int i = 0; i < 4; i++) {
    		turtle.forward(sideLength);
        	turtle.turn(90);
        	if(i % 2 == 0)
        		turtle.color(PenColor.RED);
        	else
        		turtle.color(PenColor.GREEN);
		}
    }

    /**
     * Determine inside angles of a regular polygon.
     * 
     * There is a simple formula for calculating the inside angles of a polygon;
     * you should derive it and use it here.
     * 
     * @param sides number of sides, where sides must be > 2
     * @return angle in degrees, where 0 <= angle < 360
     */
    public static double calculateRegularPolygonAngle(int sides) {
        //throw new RuntimeException("implement me!");
    	double angle = CIRCLE_DEGRES / sides;
    	return angle;
    }

    /**
     * Determine number of sides given the size of interior angles of a regular polygon.
     * 
     * There is a simple formula for this; you should derive it and use it here.
     * Make sure you *properly round* the answer before you return it (see java.lang.Math).
     * HINT: it is easier if you think about the exterior angles.
     * 
     * @param angle size of interior angles in degrees, where 0 < angle < 1100
     * @return the integer number of sides
     */
    public static int calculatePolygonSidesFromAngle(double angle) {
        //throw new RuntimeException("implement me!");
    	int sides = (int) (360 / angle);
    	return sides;
    }

    /**
     * Given the number of sides, draw a regular polygon.
     * 
     * (0,0) is the lower-left corner of the polygon; use only right-hand turns to draw.
     * 
     * @param turtle the turtle context
     * @param sides number of sides of the polygon to draw
     * @param sideLength length of each side
     */
    public static void drawRegularPolygon(Turtle turtle, int sides, int sideLength) {
        //throw new RuntimeException("implement me!");
    	double angle = calculateRegularPolygonAngle(sides);
    	
    	System.out.println("Sides : " + sides);
    	System.out.println("Angle : " + angle);
    	
    	for (int i = 0; i < sides; i++) {
    		turtle.forward(sideLength);
        	turtle.turn(angle);
        	if(i % 2 == 0)
        		turtle.color(PenColor.ORANGE);
        	else
        		turtle.color(PenColor.CYAN);
		}

    }

    /**
     * Given the current direction, current location, and a target location, calculate the heading
     * towards the target point.
     * 
     * The return value is the angle input to turn() that would point the turtle in the direction of
     * the target point (targetX,targetY), given that the turtle is already at the point
     * (currentX,currentY) and is facing at angle currentHeading. The angle must be expressed in
     * degrees, where 0 <= angle < 360. 
     *
     * HINT: look at http://en.wikipedia.org/wiki/Atan2 and Java's math libraries
     * 
     * @param currentHeading current direction as clockwise from north
     * @param currentX current location x-coordinate
     * @param currentY current location y-coordinate
     * @param targetX target point x-coordinate
     * @param targetY target point y-coordinate
     * @return adjustment to heading (right turn amount) to get to target point,
     *         must be 0 <= angle < 360
     */
    public static double calculateHeadingToPoint(double currentHeading1, int currentX, int currentY,
                                                 int targetX, int targetY) {
        //throw new RuntimeException("implement me!");
    	currentHeading = currentHeading1;
    	LineSegment lineSeg = new LineSegment(currentX, currentY, targetX, targetY, PenColor.GREEN);
        lineSeg.start();
        lineSeg.end();
        return lineSeg.length();
    }

    /**
     * Given a sequence of points, calculate the heading adjustments needed to get from each point
     * to the next.
     * 
     * Assumes that the turtle starts at the first point given, facing up (i.e. 0 degrees).
     * For each subsequent point, assumes that the turtle is still facing in the direction it was
     * facing when it moved to the previous point.
     * You should use calculateHeadingToPoint() to implement this function.
     * 
     * @param xCoords list of x-coordinates (must be same length as yCoords)
     * @param yCoords list of y-coordinates (must be same length as xCoords)
     * @return list of heading adjustments between points, of size 0 if (# of points) == 0,
     *         otherwise of size (# of points) - 1
     */
    public static List<Integer> calculateHeadings(List<Integer> xCoords, List<Integer> yCoords) {
        //throw new RuntimeException("implement me!");

    	/**
    	 * Création d'une instance de List et combinaison des collections 
    	 * d'abscisses et ordonnés dans results
    	 */
    	List<Integer> results = new ArrayList<>();
    	results.addAll(xCoords);
    	results.addAll(yCoords);
    	
    	return results;
    }

    /**
     * Draw your personal, custom art.
     * 
     * Many interesting images can be drawn using the simple implementation of a turtle.  For this
     * function, draw something interesting; the complexity can be as little or as much as you want.
     * 
     * @param turtle the turtle context
     */
    public static void drawPersonalArt(Turtle turtle) {
        //throw new RuntimeException("implement me!");
    	for (int i = 0; i < 11; i++) {
    		turtle.forward(100);
        	turtle.turn(65.35);
        	if(i % 2 == 0)
        		turtle.color(PenColor.CYAN);
        	else
        		turtle.color(PenColor.MAGENTA);
		}
    }

    /**
     * Main method.
     * 
     * This is the method that runs when you run "java TurtleSoup".
     * 
     * @param args unused
     */
    public static void main(String args[]) {
        DrawableTurtle turtle = new DrawableTurtle();

        drawSquare(turtle, 60);
        drawRegularPolygon(turtle, 6, 60);
        drawPersonalArt(turtle);
        
        calculateHeadingToPoint(0.0, 0, 0, 0, 1);
        
        /**
         * @author fily
         */
        List<Integer> xpoints = new ArrayList<>();
        List<Integer> ypoints = new ArrayList<>();
        xpoints.add(0);
        xpoints.add(1);
        xpoints.add(1);
        ypoints.add(0);
        ypoints.add(1);
        ypoints.add(2);

        List<Integer> results = calculateHeadings(xpoints, ypoints);
        System.out.println("Taille list point(x, y) : " + results.size());


        // draw the window
        turtle.draw();
    }

}
