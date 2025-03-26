public class Livro {
   
    public String titulo; 
    public String autor;  
    public int anopublicado; 

  
    public Livro(String titulo, String autor, int anopublicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anopublicado = anopublicado;
    }

    
    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anopublicado);
    }

    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Como Fazer amigos e Influenciar pessoas", "Dale Carnegie", 1936);
        Livro livro2 = new Livro("O detector da verdade do FBI", "John R. Schafer", 2021);

        
        System.out.println("Livro 1:");
        livro1.exibirInfo();
        
        System.out.println("\nLivro 2:");
        livro2.exibirInfo();
    }
}
