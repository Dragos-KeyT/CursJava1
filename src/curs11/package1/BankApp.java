package curs11.package1;

import java.util.Scanner;

/*
 * Simulam o aplicatie bancara care sa permita depunere, retragere si verificare sold
 * informam userul ce operatiuni sunt disponibile 
 * intrebam userul ce operatiune vrea sa foloseasca 
 * procesam operatiunea
 * intrebam daca vrea sa continue sau nu
 * 1 interfata pentru account
 * 1 clasa pentru CurrentAccount
 * 1 clasa de executie (BankApp)
 * clase de exceptii 
 *  
 */


public class BankApp {
	
	public static void main(String[] args) throws InvalidAmountException, InsufficentFundsException {
		
		CurrentAccount obj =  new CurrentAccount();
		
		
		//bucla
		bankApp(obj);
		
	}

	public static void bankApp(CurrentAccount account) throws InvalidAmountException, InsufficentFundsException {
		Scanner scan  =  new Scanner(System.in);
		System.out.println("Hi, Available operations are :");
		System.out.println("1 Deposit");
		System.out.println("2 Withdraw");
		System.out.println("3 Check balance");
		String option = scan.next();
		
		switch(option) {
		 case "1" :
			 System.out.println("Please enter deposit amount :");
			 account.deposit(getAmount());
			 account.checkBalance();
			 break;
		 case "2" :
			 System.out.println("Please enter withdraw amount :");
			 account.withdraw(getAmount());
			 account.checkBalance();
			 break;
		 case "3" :
			 account.checkBalance();
			 break;
		default:
			System.out.println("Invalid option!");
		}
		
		System.out.println("Do you want to continue? yes or no");
		String userResponse =  scan.next();
		if(userResponse.equalsIgnoreCase("yes")) {
			bankApp(account);
		}
		//intrebi daca vrea sa continue
		//te va tine in bucla sau nu

	}
	
	public static double getAmount() {
		Scanner scan  =  new Scanner(System.in);
		return scan.nextDouble();
	}
	
}
