package com.example.cs115_coursework_1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends ClosedShape{
    private int side;

    /**
     * Creates a square.
     *
     * @param insertionTime
     * @param x             The x position.
     * @param y             the y position.
     * @param vx            The velocity of the shape along the x-axis
     * @param vy            The velocity of the shape along the y-axis
     * @param side          The side of the shape
     * @param colour        The line or fill colour.
     * @param isFilled      True if the shape is filled, false if not.
     */
    protected Square(int insertionTime, int x, int y, int vx, int vy, int side, Color colour, boolean isFilled) {
        super(insertionTime, x, y, vx, vy, colour, isFilled);
        this.side = side;
    }

    /**
     * Method to convert a square to a string.
     */
    public String toString () {
        String result = "This is a square\n";
        result += super.toString ();
        result += "Its side is " + this.side + "\n";
        return result;
    }

    /**
     * @param side sets the side.
     */
    public void setSide (int side) {
        this.side = side;
    }

    /**
     * @param g
     * draws the shapes onto the canvas.
     */
    public void draw(GraphicsContext g) {
        g.setFill (colour);
        g.setStroke( colour );
        if (isFilled) {
            g.fillRect( x, y, side, side );
        }
        else {
            g.fillRect( x, y, side, side );
        }
    }

    /**
     * @return the width which is just the side.
     */
    public int getWidth() {
        return side;
    }

    /**
     * @return the height which is just the side.
     */
    public int getHeight() {
        return side;
    }

}
