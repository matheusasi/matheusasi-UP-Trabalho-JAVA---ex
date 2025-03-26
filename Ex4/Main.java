
public class Main {
    public static void main(String[] args) {
       
        Jogador jogador1 = new Jogador("Luiz", 100, 1);
        Jogador jogador2 = new Jogador("Mafe", 200, 3);

       
        System.out.println("informações do Jogador 1:");
        jogador1.exibirInformacoes();
        System.out.println("\ninformações do Jogador 2:");
        jogador2.exibirInformacoes();

       
        jogador1.aumentarPontuacao(50);
        jogador1.subirNivel();
        jogador2.aumentarPontuacao(150);
        jogador2.subirNivel();

       
        System.out.println("\natualizado:");
        System.out.println("\ninformações do Jogador 1:");
        jogador1.exibirInformacoes();
        System.out.println("\ninformações do Jogador 2:");
        jogador2.exibirInformacoes();
    }
}
