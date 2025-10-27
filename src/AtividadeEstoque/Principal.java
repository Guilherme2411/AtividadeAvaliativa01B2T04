package AtividadeEstoque;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome=entrada.nextLine();
        System.out.print("Digite a quantidade inicial: ");
        int quantidade=entrada.nextInt();
        ProdutoEstoque produto = new ProdutoEstoque(nome, quantidade);
        System.out.print("Digite a quantidade a adicionar: ");
        int adicionar=entrada.nextInt();
        produto.adicionarEstoque(adicionar);
        System.out.print("Digite a quantidade a remover: ");
        int remover =entrada.nextInt();
        produto.removerEstoque(remover);

        System.out.println("\nProduto: " + produto.getNome());
        System.out.println("Quantidade final em estoque: " + produto.getQuantidade());

        entrada.close();
    }
}

