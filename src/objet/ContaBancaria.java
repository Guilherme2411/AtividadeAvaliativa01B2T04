package objet;

import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String nometitular, double saldoInicial) {
		if (titular==null || titular.trim().isEmpty()) {
			System.out.println("Erro: O nome do titular nao pode estar vazio");
		}else if(saldoInicial<0){
			System.out.println("Saldo negativo");
		} else {
		titular = nometitular;
		saldo=saldoInicial;
		System.out.println("Conta criada com sucesso para "+ titular + "!");
		
		}
	}

	public void depositar(double valor){
		if(valor<=0){
			System.out.println("
		}
	}
