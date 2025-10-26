package atividaderetangulo;
import atividaderetangulo.Retangulo;
import java.util.Scanner;

public class principal {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a largura do retangulo");
		double largura = scanner.nextDouble();
		System.out.println("Digite a altura do retangulo");
		double altura=scanner.nextDouble();
		Retangulo parametros = new Retangulo (largura,altura);
		
		System.out.println("\nEssa e a area do retangulo" + parametros.getArea());
		System.out.println("\nEssa e o perimetro do retangulo" + parametros.getPerimetro());
		}
	}

