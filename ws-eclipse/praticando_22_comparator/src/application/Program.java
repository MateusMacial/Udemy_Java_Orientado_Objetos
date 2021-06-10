package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		/*
		Expressao lambda ou arrowFunction
		Primeiro passa os argumentos que ela vai receber, depois a ->(SETA) e depois o que a funcao executa
		Como tem apenas uma linha de comando pode tirar o return e o abre e abre/fecha chaves({})
		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			
		//Funcao anonima
				new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
			
		};
		*/
		
		//list.sort(new MyComparator());
		//Colocando a expresao lambda dentro do sort
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}
	}
}