public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, String codigo, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double calcularValorTotal() {
        return preco * quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Código: " + codigo + " | Preço: R$" + preco + " | Estoque: " + quantidadeEmEstoque;
    }
}
