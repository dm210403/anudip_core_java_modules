/* 1.Write a Java program to demonstrate method overloading by creating a class Calculator with multiple add() methods that accept different parameter types. */


public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }

    // Method to add a double and an integer
    public double add(double a, int b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Adding integers
        System.out.println("add(int, int): " + calc.add(10, 20));
        System.out.println("add(int, int, int): " + calc.add(5, 15, 25));

        // Adding doubles
        System.out.println("add(double, double): " + calc.add(5.5, 4.5));

        // Adding int and double
        System.out.println("add(int, double): " + calc.add(10, 3.5));

        // Adding double and int
        System.out.println("add(double, int): " + calc.add(2.5, 7));

        // Concatenating strings
        System.out.println("add(String, String): " + calc.add("Hello, ", "World!"));
    }
}


/* Output :
	add(int, int): 30
add(int, int, int): 45
add(double, double): 10.0
add(int, double): 13.5
add(double, int): 9.5
add(String, String): Hello, World! */
