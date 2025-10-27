package AtividadeTemperatura;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double tempC =entrada.nextDouble();
        Temperatura temperatura=new Temperatura(tempC);
        System.out.println("\nTemperatura em Celsius: " + temperatura.getCelsius() + "°C");
        System.out.println("Temperatura em Fahrenheit: " + temperatura.paraFahrenheit() + "°F");
        System.out.println("Temperatura em Kelvin: " + temperatura.paraKelvin() + " K");

        entrada.close();
    }
}
