package AtividadeContaLuz;

public class ContaLuz {
    private double consumoKwh;
    private double valorKwh;

    public ContaLuz(double consumoKwh,double valorKwh) {
        if (consumoKwh<=0){
            System.out.println("O consumo deve ser maior que zero");
        }else if (valorKwh<=0) {
            System.out.println("O valor por kwh deve ser maior que zero");
        }else {
            this.consumoKwh=consumoKwh;
            this.valorKwh=valorKwh;
        }
    }

    public double calculoTotal() {
        return consumoKwh*valorKwh;
    }

    public void Conta() {
        if (consumoKwh>0 && valorKwh>0) {
            System.out.printf("Consumo: %.2f kWh%n", consumoKwh);
            System.out.printf("Valor por kWh: R$ %.4f%n", valorKwh);
            System.out.printf("Valor total a pagar: R$ %.2f%n", calculoTotal());
        }
    }
}

