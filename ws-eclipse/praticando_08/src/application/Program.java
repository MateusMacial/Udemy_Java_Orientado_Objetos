package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int [][] mat = new int[m][n];
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int choseNumber = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] == choseNumber) {
					System.out.println("Position " + i + "," + j + ":");				
					System.out.println("Left: " + mat[i][j - 1]);
					System.out.println("Up: " + mat[i - 1][j]);
					System.out.println("Hight: " + mat[i][i + 1]);
					System.out.println("Down: " + mat[j + 1][j]);
					
				}
			}
		}
		
		sc.close();
		
	}

}
