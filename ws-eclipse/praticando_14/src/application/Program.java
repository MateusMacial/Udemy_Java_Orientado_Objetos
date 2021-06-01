package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.People;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<People> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			System.out.print("Tax payer #" + (i + 1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.println("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.println("Number of employees: ");
				Integer employeeQuantity = sc.nextInt();
				
				list.add(new Company(name, anualIncome, employeeQuantity));
			}
		}
		double sum = 0.0;
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for(People p : list) {
			double tax = p.taxPay();
			System.out.println(p.getName() + ", $" + String.format("%.2f", p.taxPay()));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		
		sc.close();

	}

}
