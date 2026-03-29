package Test;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;

        System.out.println("Enter first number:");
        num1 = scan.nextDouble();

        System.out.println("Choose an operator: +, -, *, or /");
        operator = scan.next().charAt(0);

        System.out.println("Enter second number:");
        num2 = scan.nextDouble();

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
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                    return; // Exit the program or handle error
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return; // Exit if invalid operator
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        scan.close();

	}

}
