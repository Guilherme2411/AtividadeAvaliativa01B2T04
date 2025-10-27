package AtividadeBicicleta;

public class BicicletaAlugada {
    private int hora;
    private double valorHora;


    public BicicletaAlugada(int horas,double valorHora) {
    	  if (horas>=1 && valorHora > 0) {
              this.hora=horas;
              this.valorHora=valorHora;
          } else {
              if (horas<1) {
                  System.out.println("a quantidade de horas deve ser pelo menos 1");
              }
              if (valorHora<=0) {
                  System.out.println("o valor por hora deve ser maior que 0");
              }
          }
      }
    public double calcularValor() {
        return hora*valorHora;
    }
    public void exibirAluguel() {
        if (hora>=1 && valorHora> 0) {
            System.out.printf("Horas alugadas: %d%n", hora);
            System.out.printf("Valor por hora: R$ %.2f%n", valorHora);
            System.out.printf("Valor total do aluguel: R$ %.2f%n", calcularValor());
        }
    }
}
