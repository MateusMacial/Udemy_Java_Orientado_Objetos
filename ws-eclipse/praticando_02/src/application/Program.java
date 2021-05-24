package application;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee func = new employee();
		
		System.out.println("Enter de employee name!");
		func.name = sc.nextLine();
		System.out.println("Enter the employee gross salary!");
		func.grossSalary = sc.nextDouble();
		System.out.println("Enter the tax!");
		func.tax = sc.nextDouble();
		
		System.out.println("Employee: " +  func);
		
		System.out.println("Which percentage to increase salary?");
		double percentage = sc.nextDouble();
		func.increase(percentage);
		
		System.out.println("Updated data: " + func);
		
		sc.close();

	}

}
