package Test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // 0, 1, and negative numbers are not prime
        if (n <= 1) {
            return false;
        }
        
        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }

        // Even numbers greater than 2 are not prime
        if (n % 2 == 0) {
            return false;
        }

        // Check for divisors from 3 up to the square root of n
        // Skipping even numbers by using i += 2
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }

        return true; // No divisors found, it is prime
    }


	}


