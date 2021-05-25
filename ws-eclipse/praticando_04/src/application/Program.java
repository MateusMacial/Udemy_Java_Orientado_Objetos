package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();		
		System.out.println("How many dollar will be bought? ");
		double dollarsBought = sc.nextDouble();		
		System.out.println("Amout to be pay in reais = " + CurrencyConverter.dollarConverted(dollarPrice, dollarsBought));
		
		sc.close();

	}

}
