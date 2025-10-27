package AtividadeContaLuz;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("digite o consumo em kWh: ");
        double consumo= entrada.nextDouble();
        System.out.print("digite o valor do kWh (em real): ");
        double valorKwh=entrada.nextDouble();
        ContaLuz conta=new ContaLuz(consumo, valorKwh);
        System.out.println("\n--- Conta de Luz ---");
        conta.Conta();

        entrada.close();
    }
}
