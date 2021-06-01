package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExeption;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance:");
		Double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();

		Account acc1 = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			acc1.withdraw(amount);
			System.out.println("New balance: " + acc1.getBalance());
		} 
		catch (DomainExeption e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
