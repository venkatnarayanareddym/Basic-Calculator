import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;

        System.out.println("Java Simple Calculator");
        System.out.println("----------------------");

        // 1. Get the first number
        System.out.print("Enter first number: ");
        if (scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
        } else {
            System.out.println("Invalid input for the first number. Exiting.");
            scanner.close();
            return;
        }

        // 2. Get the operator
        System.out.print("Enter operator (+, -, *, /): ");
        String operatorInput = scanner.next();
        if (operatorInput.length() != 1) {
            System.out.println("Invalid operator. Exiting.");
            scanner.close();
            return;
        }
        operator = operatorInput.charAt(0);

        // 3. Get the second number
        System.out.print("Enter second number: ");
        if (scanner.hasNextDouble()) {
            num2 = scanner.nextDouble();
        } else {
            System.out.println("Invalid input for the second number. Exiting.");
            scanner.close();
            return;
        }
        
        // 4. Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    scanner.close();
                    return; // Exit if division by zero occurs
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                scanner.close();
                return; // Exit for invalid operator
        }

        // 5. Display the result
        System.out.println("\nResult: " + num1 + " " + operator + " " + num2 + " = " + result);

        scanner.close();
    }
}