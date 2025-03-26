import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        
        while (true) {
            System.out.println("********** MENU GERENCIAL **********");
            System.out.println("1 - add produto");
            System.out.println("2 - atualizar produto");
            System.out.println("3 - remover produto");
            System.out.println("4 - relatório");
            System.out.println("5 - Sair");
            System.out.print("escolha uma opção:");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("digite o código do produto: ");
                    String codigo = scanner.nextLine();
                    System.out.print("digite o preço do produto: R$");
                    double preco = scanner.nextDouble();
                    System.out.print("digite a quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    Produto produto = new Produto(nome, codigo, preco, quantidade);
                    produtos.add(produto);
                    System.out.println("produto adicionado");
                    break;
                
                case 2: 
                    System.out.print("digite o código do produto para atualizar: ");
                    String codigoAtualizar = scanner.nextLine();
                    Produto produtoAtualizar = null;

                   
                    for (Produto p : produtos) {
                        if (p.getCodigo().equals(codigoAtualizar)) {
                            produtoAtualizar = p;
                            break;
                        }
                    }

                    if (produtoAtualizar != null) {
                        System.out.print("digite o novo nome do produto (ou pressione Enter para manter): ");
                        String novoNome = scanner.nextLine();
                        if (!novoNome.isEmpty()) {
                            produtoAtualizar.setNome(novoNome);
                        }

                        System.out.print("digite o novo preço do produto (ou pressione Enter para manter): R$");
                        String precoStr = scanner.nextLine();
                        if (!precoStr.isEmpty()) {
                            produtoAtualizar.setPreco(Double.parseDouble(precoStr));
                        }

                        System.out.print("digite a nova quantidade em estoque (ou pressione Enter para manter): ");
                        String quantidadeStr = scanner.nextLine();
                        if (!quantidadeStr.isEmpty()) {
                            produtoAtualizar.setQuantidadeEmEstoque(Integer.parseInt(quantidadeStr));
                        }

                        System.out.println("produto atualizado");
                    } else {
                        System.out.println("produto não encontrado.");
                    }
                    break;
                
                case 3: 
                    System.out.print("digite o código do produto para remover: ");
                    String codigoRemover = scanner.nextLine();
                    Produto produtoRemover = null;

                    for (Produto p : produtos) {
                        if (p.getCodigo().equals(codigoRemover)) {
                            produtoRemover = p;
                            break;
                        }
                    }

                    if (produtoRemover != null) {
                        produtos.remove(produtoRemover);
                        System.out.println("produto removido");
                    } else {
                        System.out.println("produto não encontrado.");
                    }
                    break;
                
                case 4: 
                    System.out.println("********** RELATÓRIO DE ESTOQUE **********");
                    double valorTotalEstoque = 0;
                    for (Produto p : produtos) {
                        System.out.println(p);
                        valorTotalEstoque += p.calcularValorTotal();
                    }
                    System.out.println("valor total: R$" + valorTotalEstoque);
                    break;
                
                case 5: // Sair
                    System.out.println("saindo");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("opção inválida.");
            }
        }
    }
}
