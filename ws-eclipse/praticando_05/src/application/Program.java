package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter the account number!");
		int accountNumber = sc.nextInt();
		System.out.println("Enter the account holder!");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			
			account = new Account(accountNumber, name, initialDeposit);
			
		}
		else {
			account = new Account(accountNumber, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("Update account data: ");
		System.out.println(account);

		sc.close();

	}

}
