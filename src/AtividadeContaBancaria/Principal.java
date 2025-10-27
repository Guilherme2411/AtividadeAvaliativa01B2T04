package AtividadeContaBancaria;
import java.util.Scanner;

import AtividadeContaBancaria.ContaBancaria;

public class Principal {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do titular: ");
		String nome = entrada.nextLine();
		System.out.println("Digite o saldo inicial: ");
		double saldoInicial=entrada.nextDouble();
		ContaBancaria conta = new ContaBancaria(nome, saldoInicial);
		
		System.out.print("\nDigite o valor para depósito: "); 
		double deposito = entrada.nextDouble(); 
		conta.depositar(deposito);
		
		System.out.print("Digite o valor para saque: "); 
		double saque = entrada.nextDouble(); 
		conta.sacar(saque);
		
		System.out.println("\nTitular: " + conta.getTitular()); 
		System.out.println("Saldo final: R$" + conta.getSaldo());
		
		entrada.close();
		}
}
	
