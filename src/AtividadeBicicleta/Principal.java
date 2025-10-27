package AtividadeBicicleta;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Digite quantas horas a bicicleta foi alugada: ");
        int horas=entrada.nextInt();
        System.out.print("Digite o valor cobrado por hora: ");
        double valorHora=entrada.nextDouble();
        BicicletaAlugada aluguel=new BicicletaAlugada(horas,valorHora);

        System.out.println("\n--- Resumo do Aluguel ---");
        aluguel.exibirAluguel();

        entrada.close();
    }
}
