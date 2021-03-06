package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		/*
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Mateus", 0.0, 1000.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Mario", 0.0, 500.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 800.00);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);

		//BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		*/
		/*
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Mateus", 1000.00, 0.01);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
		
		*/
		/*
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		*/
		/*
		Account acc1 = new Account(1001,"Alex", 1000.00);
		Account acc2 = new SavingsAccount(1002, "Mario", 1000.00, 1.00);
		Account acc3 = new BusinessAccount(1003, "Maria", 1000.00, 500.00);
		*/
		//Classes abstratas
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
		list.add(new SavingsAccount(1003, "Mariana", 300.00, 0.20));
		list.add(new BusinessAccount(1004, "Jose", 3000.00, 2000.00));
		
		double sum = 0.00;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.println("Total Balance:" + sum);
		
		for(Account acc : list) {
			acc.deposit(10.00);
		}
		
		for(Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f %n", acc.getNumber(),  acc.getBalance());
		}
	}
	

}
