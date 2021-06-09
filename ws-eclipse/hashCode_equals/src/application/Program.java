package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {

		Client c1 = new Client("Maria", "maria.com");
		Client c2 = new Client("Maria", "maria.com");
		
		String s1 = "test";
		String s2 = "test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());		
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
		
		/*
		System.out.println("Equals");
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b));
		
		System.out.println();
		
		System.out.println("HashCode");
		String c = "Maria";
		String d = "Alex";
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		*/
		
		

	}

}
