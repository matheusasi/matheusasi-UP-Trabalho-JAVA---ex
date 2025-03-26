public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0.0; 
    }

    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("acelerando, velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("o aumento deve ser positivo.");
        }
    }

    public void frear(double decremento) {
        if (decremento > 0) {
            if (velocidadeAtual - decremento >= 0) {
                velocidadeAtual -= decremento;
                System.out.println("desacelerando velocidade atual: " + velocidadeAtual + " km/h");
            } else {
                velocidadeAtual = 0;
                System.out.println("o carro parou. velocidade atual: 0 km/h");
            }
        } else {
            System.out.println("a redução deve ser positiva.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("info do carro:");
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
        System.out.println("placa: " + placa);
        System.out.println("velocidade atual: " + velocidadeAtual + " km/h");
    }
}
