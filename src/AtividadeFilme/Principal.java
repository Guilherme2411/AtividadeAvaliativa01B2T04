	package AtividadeFilme;
	import java.util.Scanner;

import AtividadeFilme.Filme;
	
	public class Principal {
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o nome do primeiro filme");
			String titulo = entrada.nextLine();
			
			System.out.println("Digite a avaliacao desse filme");
			double avaliacao =entrada.nextDouble();

			
			System.out.println("Digite o nome do segundo filme");
			String titulo2 = entrada.nextLine();
			
			System.out.println("digite a avaliacao do segundo filme");
			double avaliacao2 =entrada.nextDouble();
			Filme filme1 = new Filme(titulo,avaliacao);
			Filme filme2 = new Filme(titulo2,avaliacao2);
			
		    System.out.println("\n--- Avaliações Registradas ---");
	        System.out.println(filme1);
	        System.out.println(filme2);
	
	        entrada.close();
	    }
	}

