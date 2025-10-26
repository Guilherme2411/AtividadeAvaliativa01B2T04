package Filme;

public class Filme{
	private String titulo, titulo2;
	private double avaliacao, avaliacao2;
	public Filme(String titulo, double avaliacao) {
        this.titulo = titulo;
        this.avaliacao = avaliacao;
    }

    public Filme(String titulo, double avaliacao, String titulo2, double avaliacao2) {
        this.titulo = titulo;
        this.avaliacao = avaliacao;
        this.titulo2 = titulo2;
        this.avaliacao2 = avaliacao2;
    }
	
	public void filme1 (String nomeTitulo, double quantidadeAvaliacao) {
		if (nomeTitulo==null || nomeTitulo.trim().isEmpty()) {
			System.out.println("O nome do titulo esta vazio");
		} else {
		titulo=nomeTitulo;
		avaliacao=quantidadeAvaliacao;
		System.out.println("Registrado, siga as avaliacoes");
		}
	}
		public void avaliacoes(double avaliacao, double quantidadeAvaliacao) {
			if(avaliacao< 0) {
				System.out.println("a avaliacao nao pode ser menor que zero.");
				return;
			} else if(avaliacao>5) {
				System.out.println("a avaliacao nao pode ser maior que cinco");
				return;
			} else {
				avaliacao=quantidadeAvaliacao;
				System.out.println("Essa e a avaliacao desse filme" + avaliacao);
			}
	}
	public void filme2(String nomeTitulo, double quantidadeAvaliacao2) {
		if (nomeTitulo==null||nomeTitulo.trim().isEmpty()) {
			System.out.println("o nome do segundo titulo esta vazio");
		}else {
			titulo2 = nomeTitulo;
			avaliacao2=quantidadeAvaliacao2;
			System.out.println("Certo! Registrado, siga a avaliacao desse filme");
		}
	}
	public void avaliacao2(double avaliacao2, double quantidadeAvaliacao2) {
		if (avaliacao<0) {
			System.out.println("A avaliacao nao pode ser menor que zero.");
			return;
		} else if(avaliacao2> 5){
			System.out.println("A avaliacao nao pode ser maior que cinco");
			return;
		} else {
			avaliacao2=quantidadeAvaliacao2;
			System.out.println("Essa e a avaliacao desse filme" + avaliacao2);
		}
	}
	 public String toString() {
	        return "Filme: " + titulo + " - Avaliação: " + avaliacao;
	    }
	}
