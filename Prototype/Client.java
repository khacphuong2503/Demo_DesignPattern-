package DP.Prototype;

// Client class to demonstrate the use of Prototype Pattern
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Create a rectangle object as a prototype
        Rectangle prototype = new Rectangle(100, 50);

        // Create three new rectangle objects by cloning the prototype
        Rectangle rectangle1 = prototype.clone();
        Rectangle rectangle2 = prototype.clone();
        Rectangle rectangle3 = prototype.clone();

        // Modify the width and height of the cloned objects
        rectangle1.setWidth(200);
        rectangle2.setHeight(75);
        rectangle3.setWidth(150);
        rectangle3.setHeight(75);

        // Draw the rectangles
        rectangle1.draw(); // Drawing rectangle with width 200 and height 50
        rectangle2.draw(); // Drawing rectangle with width 100 and height 75
        rectangle3.draw(); // Drawing rectangle with width 150 and height 75
        prototype.draw();
    }
}