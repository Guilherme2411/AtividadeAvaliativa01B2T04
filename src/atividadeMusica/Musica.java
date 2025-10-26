package atividadeMusica;

public class Musica {
	private String titulo;
	private int duracaoSegundos;
	
	public Musica (String nome, double segundos) {
		if (nome == null|| nome.trim().isEmpty()) {
			System.out.println("o titulo nao pode estar vazio");
		} else if (segundos<= 0) {
			System.out.println("A duracao deve ser maior que 0.");
		} else {
			titulo = nome;
			duracaoSegundos = segundos;
			System.out.println("Registrado!");
		}
	}
	public void formatarDuracao(double min, double seg, double segundos) {
		for (int i; segundos = 60; i++) {
			
		}
	}

}
