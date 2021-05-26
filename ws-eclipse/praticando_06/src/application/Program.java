package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hotel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Hotel[] vect = new Hotel[10];
		
		System.out.println("How many rooms will be rented?");
		int rented = sc.nextInt();
		
		for(int i=0; i<rented; i++) {
			
			System.out.println("Rent #" + (i + 1));
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Hotel(name, email, room);
		}
		
		System.out.println("Busy rooms: ");
		
		for(int i=0; i<vect.length; i++) {
			
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
