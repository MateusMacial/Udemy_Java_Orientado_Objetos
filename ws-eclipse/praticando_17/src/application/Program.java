package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Item;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Item> list = new ArrayList<>();

		System.out.println("Enter the file path: ");
		String sourceFileStr = sc.nextLine(); //Pegando caminho do arquivo
		
		File sourceFile = new File(sourceFileStr); //Criando arquivo dentro da pasta passada anteriormente
		String sourceFolderStr = sourceFile.getParent(); //Colocando o caminho do arquivo criado em uma variavel
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir(); // Criando um pasta out
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; //Criando um arquivo summary.csv
		

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) { //Lendo o arquivo e criando abjetos Item para cada linha
			String itemCsv = br.readLine();	

			while (itemCsv != null) {
				String[] fields = itemCsv.split(",");
				
				String name = fields[0];
				Double unityPrice = Double.parseDouble(fields[1]);
				Integer quantity = Integer.parseInt(fields[2]);
				
				list.add(new Item(name, unityPrice, quantity));
				
				itemCsv = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				for (Item item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.totalPrice()));
					bw.newLine();
				}

				System.out.println(targetFileStr + " CREATED!");
				
				
			}
			catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
