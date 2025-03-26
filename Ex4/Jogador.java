
public class Jogador {
  
    private String nome;
    private int pontuacao;
    private int nivel;

   
    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public void subirNivel() {
        this.nivel++;
    }


    public void exibirInformacoes() {
        System.out.println("nome: " + nome);
        System.out.println("pontuação: " + pontuacao);
        System.out.println("nível: " + nivel);
    }
}
