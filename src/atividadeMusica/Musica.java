package atividadeMusica;

public class Musica {
    private String titulo;
    private int duracaoSegundos;

    public Musica(String titulo, int duracaoSegundos) {
        if (titulo==null||titulo.trim().isEmpty()) {
            System.out.println("O titulo nao pode estar vazio");
        } else if(duracaoSegundos <= 0) {
            System.out.println("A duracao deve ser maior que zero");
        } else {
            this.titulo=titulo;
            this.duracaoSegundos=duracaoSegundos;
        }
    }

    public String formatarDuracao() {
        int minutos=duracaoSegundos/60;
        int segundos=duracaoSegundos%60;
        return String.format("%02d:%02d", minutos, segundos);
    }

    public void exibirMusica() {
        if (titulo != null) { 
            System.out.println("Título: " + titulo + " | Duração: " + formatarDuracao());
        }
    }
}
