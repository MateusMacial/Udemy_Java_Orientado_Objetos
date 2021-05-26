package application;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] {"maria", "joao"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("-------------");
		//A sintaxe é a seguinte:
		//Tipo dos elementos do vetor depois
		//um apelido para o mesmo : o nome da colecao;
		for(String obj : vect) {
			System.out.println(obj);
		}

	}

}
