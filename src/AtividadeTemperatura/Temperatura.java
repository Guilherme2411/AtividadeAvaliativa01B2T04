package AtividadeTemperatura;

public class Temperatura {
    private double celsius;

    public Temperatura(double celsius) {
        if (celsius<-273.15) {
            System.out.println("A temperatura não pode ser menor que -273.15°C (zero absoluto).");
        } else {
            this.celsius=celsius;
            System.out.println("Temperatura registrada");
        }
    }

    public double paraFahrenheit() {
        return (celsius*9/5)+32;
    }

    public double paraKelvin() {
        return celsius+273.15;
    }

    public double getCelsius() {
        return celsius;
    }
}
