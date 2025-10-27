package AtividadeFuncionario;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nomeFuncionario, double salarioFuncionario) {
		if(nomeFuncionario == null|| nomeFuncionario.trim().isEmpty()) {
			System.out.println("Nome do funcionario vazio");
			} else if (salarioFuncionario <= 0){
				System.out.println("salario zerado ou negativo");
			} else {
				nome = nomeFuncionario;
				salario = salarioFuncionario;
				System.out.println("Nome do funcionario e salario cadastrado com sucesso\n");
				System.out.println("Esse funcionario:" + nome + "Possui esse salario: "+ salario);
			}
	}
	public void aumento(double percentual) {
		if (percentual <=0 ) {
			System.out.println("a porcentagem nao pode estar negativo");
			return;
		} else if (percentual > 100) {
			System.out.println("Voce so pode aumentar o salario em ate 100%");
			return;
		} else {
			double aumento = 1 + (percentual/100);
			salario = salario * aumento;
		}
	}
	public double getSalario(){
		return salario;
	}
	public String getNome() {
		return nome;
	}
}
