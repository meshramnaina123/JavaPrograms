package Test;

import java.util.Scanner;

public class ATMProgram {

	public static void main(String[] args) {
		
		int balance = 50000;
	      String lasttransaction =  "No transactions made";
	      int pin = 1234; 
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter your PIN: ");
	      int enteredpin = sc.nextInt();
	      if (enteredpin != pin) {
	         System.out.println("Access denied. Incorrect Pin");
	         return;
	      }
	      System.out.println("Welcome!");
	      while (true) {
	         System.out.println("1. Withdraw Cash");
	         System.out.println("2. Deposit Cash");
	         System.out.println("3. Check Balance");
	         System.out.println("4. View Last Transaction");
	         System.out.println("5. Exit");
	         System.out.print("Enter your choice: ");
	         int choice = sc.nextInt();
	         switch (choice) {
	            case 1:
	               // withdrawal
	               System.out.print("Enter the amount to withdraw: ");
	               int withdraw = sc.nextInt();
	               if (withdraw > 0 && withdraw <= balance) {
	                  balance -= withdraw;
	                  lasttransaction = "You withdrew: Rs." + withdraw;
	                  System.out.println("Withdrawal successful! Please take your cash.\n");
	               } else if (withdraw > balance) {
	                  System.out.println("Insufficient funds! Please try a smaller amount.\n");
	               } else {
	                  System.out.println("Invalid amount. Please try again.\n");
	               }
	               break;
	            case 2:
	               // deposit
	               System.out.print("Enter the amount to deposit: ");
	               int deposit = sc.nextInt();
	               if (deposit > 0) {
	                  balance += deposit;
	                  lasttransaction = "You deposited: Rs." + deposit;
	                  System.out.println("Deposited successfully! Thank you.\n");
	               } else {
	                  System.out.println("Invalid amount.Please try again.\n");
	               }
	               break;
	            case 3:
	               // Displaying balance
	               System.out.println("Your current balance is: Rs." + balance+"\n");
	               break;
	            case 4:
	               // Displaying last transaction
	               System.out.println("Last transaction: " + lasttransaction+"\n");
	               break;
	            case 5:
	               // Exit the program
	               System.out.println("Thank you for using the ATM. Have a great day!\n");
	               System.exit(0);
	               break;
	            default:
	               System.out.println("Invalid choice. Please select a valid option.\n");
	         }
	      }
	   }
	
		
}
