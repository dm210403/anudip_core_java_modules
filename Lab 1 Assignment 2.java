/* Write Java Program to find maximum number using ternary operator. */



import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Determine the maximum using nested ternary operators
        int max = (num1 > num2) 
                    ? ((num1 > num3) ? num1 : num3) 
                    : ((num2 > num3) ? num2 : num3);

        // Display the result
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}


/* Output: 
	Enter the first number: 25
	Enter the second number: 35
	Enter the third number: 15
	The maximum number is: 35 */