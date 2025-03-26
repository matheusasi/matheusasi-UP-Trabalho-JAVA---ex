import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pizza> menuPizzas = new ArrayList<>();
        menuPizzas.add(new Pizza("margherita", 30.0, new String[]{"tomate", "mussarela", "manjericão"}));
        menuPizzas.add(new Pizza("calabresa", 35.0, new String[]{"calabresa", "mussarela", "cebola"}));
        menuPizzas.add(new Pizza("frango com catupiry", 40.0, new String[]{"frango", "catupiry", "queijo"}));

        // Lista de pedidos
        List<Pedido> pedidos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        while (rodando) {
            System.out.println("----- PIZZARIA -----");
            System.out.println("1. ver Menu");
            System.out.println("2. fazer Pedido");
            System.out.println("3. cancelar Pedido");
            System.out.println("4. relatório de Pedidos");
            System.out.println("5. sair");
            System.out.print("escolha uma opção:");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("----- MENU -----");
                    for (int i = 0; i < menuPizzas.size(); i++) {
                        System.out.println((i + 1) + ". " + menuPizzas.get(i));
                    }
                    break;

                case 2:
                    System.out.println("escolha uma pizza:");
                    for (int i = 0; i < menuPizzas.size(); i++) {
                        System.out.println((i + 1) + ". " + menuPizzas.get(i));
                    }
                    int escolhaPizza = scanner.nextInt() - 1;
                    scanner.nextLine(); 
                    if (escolhaPizza >= 0 && escolhaPizza < menuPizzas.size()) {
                        System.out.print("digite o endereço de entrega: ");
                        String endereco = scanner.nextLine();
                        Pedido novoPedido = new Pedido(menuPizzas.get(escolhaPizza), endereco);
                        pedidos.add(novoPedido);
                        System.out.println("pedido realizado");
                    } else {
                        System.out.println("opção inválida");
                    }
                    break;

                case 3:
                    System.out.println("escolha um pedido para cancelar:");
                    for (int i = 0; i < pedidos.size(); i++) {
                        if (!pedidos.get(i).isCancelado()) {
                            System.out.println((i + 1) + ". " + pedidos.get(i));
                        }
                    }
                    int cancelarPedido = scanner.nextInt() - 1;
                    scanner.nextLine(); 
                    if (cancelarPedido >= 0 && cancelarPedido < pedidos.size() && !pedidos.get(cancelarPedido).isCancelado()) {
                        pedidos.get(cancelarPedido).cancelar();
                        System.out.println("pedido cancelado");
                    } else {
                        System.out.println("opção inválida ou pedido já cancelado");
                    }
                    break;

                case 4:
                    System.out.println("----- RELATÓRIO -----");
                    int totalPedidos = 0;
                    double somaValores = 0;
                    for (Pedido pedido : pedidos) {
                        if (!pedido.isCancelado()) {
                            totalPedidos++;
                            somaValores += pedido.getPizzaEscolhida().getValor();
                        }
                    }
                    double mediaPreco = (totalPedidos > 0) ? somaValores / totalPedidos : 0;
                    System.out.println("total de pedidos: " + totalPedidos);
                    System.out.println("média de preço: " + mediaPreco + " R$");
                    break;

                case 5:
                
                    rodando = false;
                    System.out.println("saindo");
                    break;

                default:
                    System.out.println("opção inválida");
            }
        }

        scanner.close();
    }
}
