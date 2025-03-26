public class Main {
    public static void main(String[] args) {
       
        Carro meuCarro = new Carro("Porsche 911", "Silver", 1978, "AZZ319");

        meuCarro.exibirInformacoes();

        meuCarro.acelerar(50.0);

        meuCarro.frear(30.0);

        meuCarro.exibirInformacoes();
    }
}
