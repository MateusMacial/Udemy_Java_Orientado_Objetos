package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;
		
		//Predicate<Product> prod = p -> p.getPrice() >= 100;
		
		//referencia para metodo, nome da classe onde o metodo esta :: e depois o metodo
		//list.removeIf(Product::staticProductPredicate);
		//Agora com metodo nao estatico
		//list.removeIf(Product::nonStaticProductPredicate);
		//Passando variavel, expressao lambda declarada
		//list.removeIf(prod);
		//expressao lambida como argumento
		list.removeIf(p -> p.getPrice() >= min);
		
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
