package AtividadeEstoque;

public class ProdutoEstoque {
    private String nome;
    private int quantidade;

    public ProdutoEstoque(String nome, int quantidade) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("O nome do produto não pode estar vazio.");
        } else if (quantidade < 0) {
            System.out.println("A quantidade não pode ser negativa.");
        } else {
            this.nome=nome;
            this.quantidade= quantidade;
            System.out.println("Produto registrado");
        }
    }

    public void adicionarEstoque(int qtd) {
        if (qtd>0) {
            quantidade+=qtd;
            System.out.println(qtd + " unidades adicionadas.");
        } else {
            System.out.println("Quantidade invalida para adicionar.");
        }
    }

    public void removerEstoque(int qtd) {
        if (qtd>0) {
            if (quantidade-qtd>=0) {
                quantidade-=qtd;
                System.out.println(qtd + " unidades removidas.");
            }else {
                System.out.println("Não é possível remover, quantidade insuficiente.");
            }
        }else {
            System.out.println("Quantidade inválida para remover.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }
}