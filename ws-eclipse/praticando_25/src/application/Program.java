package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the full path");
		String path = sc.nextLine();
		
		List<Employee> list = new ArrayList<>();
		
		try(BufferedReader bf = new BufferedReader(new FileReader(path))){
			
			String line = bf.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1],Double.parseDouble(fields[2])));
				
				line = bf.readLine();
			}
		
			System.out.println("Enter salary: ");
			Double S = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(e -> e.getSalary() > S)
					.map(e -> e.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", S) + ": ");
			emails.forEach(System.out::println);
			
			Double sum = list.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
			
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();
	}

}
