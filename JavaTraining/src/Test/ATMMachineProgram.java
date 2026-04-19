package Test;

import java.util.Scanner;

public class ATMMachineProgram {

	public static void main(String[] args) {
		
		int balance = 10000, withdraw, deposit; // Initial balance is 10000
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = s.nextInt();

            // Using if-else if-else for menu choices
            if (choice == 1) 
               {
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                // Check if sufficient balance is available
                if (balance >= withdraw) {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                } 
                
                else 
                {
                    System.out.println("Insufficient Balance! Please try a smaller amount.");
                }
               
                System.out.println("");
            } 
            
            else if (choice == 2) 
            {
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully deposited");
                System.out.println("");
            } 
            
            else if (choice == 3)
            {
                System.out.println("Balance : " + balance);
                System.out.println("");
            } 
            
            else if (choice == 4) 
            {
                System.out.println("Thank you for using the ATM. Have a great day!");
                System.exit(0); // Exit the program
            } 
            
            else 
            {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
		
	}


