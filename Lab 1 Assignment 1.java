/* Write a Java program to calculate factorial of given number. eg.3!=3*2*1=6 */


import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        long factorial = 1;

        // Factorial logic
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display result
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}


/* Output:
	Enter a number to find its factorial: 10!
	Factorial of 10! = 10*9*8*7*-6*5*4*3*2*1 = 3628800 */