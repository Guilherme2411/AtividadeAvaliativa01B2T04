package AtividadeIMC;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome da pessoa: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o peso (em kg): ");
        double peso = entrada.nextDouble();
        System.out.print("Digite a altura (em metros): ");
        double altura = entrada.nextDouble();
        Pessoa p1 = new Pessoa(nome, peso, altura);
        System.out.println("\n--- Resultado ---");
        p1.mostrarPessoa();

        entrada.close();
    }
}
