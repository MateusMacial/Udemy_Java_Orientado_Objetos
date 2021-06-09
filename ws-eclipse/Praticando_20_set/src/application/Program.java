package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.println("How many students for course A?");
		int quantityA = sc.nextInt();
		for(int i=0; i<quantityA; i++) {
			int studentA = sc.nextInt();
			set.add(studentA);
		}
		
		System.out.println("How many students for course B?");
		int quantityB = sc.nextInt();
		for(int i=0; i<quantityB; i++) {
			int studentB = sc.nextInt();
			set.add(studentB);
		}
		
		System.out.println("How many students for course C?");
		int quantityC = sc.nextInt();
		for(int i=0; i<quantityC; i++) {
			int studentC = sc.nextInt();
			set.add(studentC);
		}
		
		System.out.println(set.size());
		
		sc.close();
	}

}
