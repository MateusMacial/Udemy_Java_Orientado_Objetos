import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String y;
		int x;		
		double z;
		char a;
		
		y = sc.next();
		x = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(0);
		
		System.out.println("Dados digitados: ");
		System.out.println(y);
		System.out.println(x);
		System.out.println(z);
		System.out.println(a);
		sc.close();

	}

}
