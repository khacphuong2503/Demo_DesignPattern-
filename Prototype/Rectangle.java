package DP.Prototype;

// Rectangle class implements the Cloneable interface to support cloning of objects
public class Rectangle implements Cloneable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Method to draw the rectangle
    public void draw() {
        System.out.println("Drawing rectangle with width " + width + " and height " + height);
    }

    // Override the clone() method to support cloning of objects
    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
