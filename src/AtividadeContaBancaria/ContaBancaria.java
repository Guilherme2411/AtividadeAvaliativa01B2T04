package AtividadeContaBancaria;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String nometitular, double saldoInicial) {
		if (nometitular==null || nometitular.trim().isEmpty()) {
			System.out.println("Erro: O nome do titular nao pode estar vazio");
		}else if(saldoInicial<0){
			System.out.println("Saldo negativo");
		} else {
		titular = nometitular;
		saldo=saldoInicial;
		System.out.println("Conta criada com sucesso para "+ titular + "!");
		
		}
	}

	public void depositar(double valor) {
		if(valor<=0){
			System.out.println("Erro: o valor de deposito deve ser positivo");
			return;
		}
		saldo=saldo + valor;
		System.out.println("valor depositado: R$"+ valor);
	}
	
	public void sacar(double valor) {
		if(valor <=0) {
			System.out.println("valor de saque deve ser positivo");
			return;
		}
		if(valor>saldo) {
			System.out.println("saldo insuficiente");
			return;
		}
		saldo=saldo-valor;
		System.out.println("Valor sacado: R$" + valor);
		System.out.println("Valor em conta: R$"+ saldo);
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular (String novoTitular) {
		if (novoTitular== null|| novoTitular.trim().isEmpty()) {
			System.out.println("O nome do titular nao pode estar vazio");
			return;
		
		}
		titular=novoTitular;
	}
	public double getSaldo(){
		
		return saldo;
	}
}