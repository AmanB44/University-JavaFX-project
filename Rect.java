package com.example.cs115_coursework_1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Rectangle is a shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of
 * the rectangle's bounding rectangle.
 */
public class Rect extends ClosedShape{
    private int width, height;

    /**
     * Creates a rectangle.
     *
     * @param insertionTime
     * @param x             The x position.
     * @param y             the y position.
     * @param vx            The velocity of the shape along the x-axis
     * @param vy            The velocity of the shape along the y-axis
     * @param width         The width of the shape
     * @param height        The height of the shape
     * @param colour        The line or fill colour.
     * @param isFilled      True if the shape is filled, false if not.
     */
    protected Rect(int insertionTime, int x, int y, int vx, int vy, int width, int height, Color colour, boolean isFilled) {
        super(insertionTime, x, y, vx, vy, colour, isFilled);
        this.width = width;
        this.height = height;
    }

    /**
     * Method to convert a rectangle to a string.
     */
    public String toString () {
        String result = "This is a rectangle\n";
        result += super.toString ();
        result += "Its width is " + this.width + " and its height is " + this.height + "\n";
        return result;
    }

    /**
     * @param width Resets the width.
     */
    public void setWidth (int width) {
        this.width = width;
    }

    /**
     * @param height Resets the height.
     */
    public void setHeight (int height) {
        this.height = height;
    }

    /**
     * @param g
     * draws the shapes onto the canvas.
     */
    public void draw(GraphicsContext g) {
        g.setFill (colour);
        g.setStroke( colour );
        if (isFilled) {
            g.fillRect( x, y, width, height );
        }
        else {
            g.strokeRect( x, y, width, height );
        }
    }

    /**
     * Returns the width.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns the width.
     */
    public int getHeight() {
        return height;
    }
}
