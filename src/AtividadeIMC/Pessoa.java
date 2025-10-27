package AtividadeIMC;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        if(nome==null||nome.trim().isEmpty()){
            System.out.println("O nome nao pode estar vazio");
        }else if(peso<=0) {
            System.out.println("O peso deve ser maior que zero");
        }else if(altura<=0) {
            System.out.println("A altura deve ser maior que zero");
        }else{
            this.nome=nome;
            this.peso= peso;
            this.altura=altura;
        }
    }

    public double calculoIMC(){
        return peso/(altura*altura);
    }

    public String classificacaoIMC() {
        double imc=calculoIMC();

        if (imc<18.5) {
            return "Abaixo do peso";
        }else if(imc < 24.9) {
            return "Peso normal";
        }else if(imc < 29.9) {
            return "Sobrepeso";
        }else if(imc < 34.9) {
            return "Obesidade grau 1";
        }else if(imc < 39.9) {
            return "Obesidade grau 2";
        }else {
            return "Obesidade grau 3";
        }
    }

    public void mostrarPessoa() {
        if (nome!=null){ 
            System.out.printf("Nome: %s%nIMC: %.2f%nClassificação: %s%n",
                              nome,calculoIMC(),classificacaoIMC());
        }
    }
}

