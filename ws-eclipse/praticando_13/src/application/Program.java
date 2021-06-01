package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products!");
		int n = sc.nextInt();
		
		
		for(int i=0; i<n; i++) {
			System.out.println("Product #" + (i + 1) + "data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if(ch == 'c') {			
				list.add(new Product(name, price));
			}
			
			else if(ch == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY):");
				Date date = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name, price, date));
			}
			
			else {
				System.out.print("Customs fee:");
				Double fee = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, fee));
				
			}
		}
		
		System.out.println();
		System.out.println("Products data:");
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();

	}

}
