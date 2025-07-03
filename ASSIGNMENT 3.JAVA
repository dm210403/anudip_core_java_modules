/* Write a Java program to calculate area using method overloading for the following shapes:

Circle (radius)

Rectangle (length, breadth)

Triangle (base, height)

Use the method area() with different parameters. */





public class AreaCalculator {

    // Method to calculate area of a circle
    public void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    // Method to calculate area of a rectangle
    public void area(double length, double breadth) {
        double result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }

    // Method to calculate area of a triangle
    public void area(float base, float height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();

        // Call overloaded area methods
        ac.area(5.0);              // Circle with radius 5.0
        ac.area(4.0, 6.0);         // Rectangle with length 4.0 and breadth 6.0
        ac.area(3.0f, 7.0f);       // Triangle with base 3.0 and height 7.0
    }
}



/* OUTPUT:
 Area of Circle: 78.53981633974483
 Area of Rectangle: 24.0
 Area of Triangle: 10.5  */