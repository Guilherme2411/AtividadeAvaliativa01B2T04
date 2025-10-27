package AtividadeFuncionario;
import AtividadeFuncionario.Funcionario;

import java.util.Scanner;

import AtividadeContaBancaria.ContaBancaria;
public class Principal {
	public static void main(String [] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite o nome do funcionario");
		String funcionario = scanner.nextLine();
		System.out.println("Digite o salario do funcionario");
		double salario = scanner.nextDouble();
		Funcionario chefe = new Funcionario (funcionario, salario);
		
		System.out.println("Digite a porcentagem de aumento:");
		double aumento = scanner.nextDouble();
		chefe.aumento(aumento);
		
		System.out.println("\n Funcionario"+ chefe.getNome());
		System.out.println("Salario Original: " + salario);
		System.out.println("Salario apos o aumento: " + chefe.getSalario());
		scanner.close();
	}

}


