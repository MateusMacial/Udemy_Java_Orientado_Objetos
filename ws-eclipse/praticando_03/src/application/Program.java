package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the student name!");
		student.name = sc.nextLine();
		System.out.println("Enter the grades 1, 2, 3 trimesters respectively!");
		student.gradeFirstTrimester = sc.nextDouble();
		student.gradeSecondTrimester = sc.nextDouble();
		student.gradeThirdTrimester = sc.nextDouble();
		
		System.out.println("Final grade: " + student.finalGrade());
		System.out.println(student.result());
		
		sc.close();

	}

}
