package atividadeMusica;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Digite o título da primeira musica: ");
        String titulo1=entrada.nextLine();
        System.out.print("Digite a duracaoo em segundos: ");
        int duracao1=entrada.nextInt();
        entrada.nextLine();
        Musica m1 =new Musica(titulo1, duracao1);
        System.out.print("\nDigite o título da segunda musica: ");
        String titulo2= entrada.nextLine();
        System.out.print("Digite a duracao em segundos: ");
        int duracao2=entrada.nextInt();
        Musica m2=new Musica(titulo2, duracao2);

        System.out.println("\n--- Musicas cadastradas ---");
        m1.exibirMusica();
        m2.exibirMusica();

        entrada.close();
    }
}
