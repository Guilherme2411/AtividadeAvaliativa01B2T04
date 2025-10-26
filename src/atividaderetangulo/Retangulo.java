package atividaderetangulo;

public class Retangulo {
	private double largura,altura;
	
	public Retangulo (double larguraRetangulo, double alturaRetangulo) {
		if (larguraRetangulo<=0) {
			System.out.println("A largura deve ser meior que zero.");
		} else {
			largura = larguraRetangulo;
			System.out.println("Registrado!");
			
		} if (alturaRetangulo<=0){
			System.out.println("A altura do retangulo deve ser maior que zero");
		} else {
			altura=alturaRetangulo;
			System.out.println("Registrado!");
		}
	}
	public double getArea() {
		return altura*largura;
	}
	public double getPerimetro() {
		return 2*(largura + altura);
	}
}