
public class Main {
    public static void main(String[] args) {
      
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("Luiz Henrique", "4199484848");
        Contato contato2 = new Contato("Matheus Pedroso", "4199998878");
        Contato contato3 = new Contato("Lucas Bitten", "4199898989");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        System.out.println("contatos");
        agenda.listarContatos();

        System.out.println("\nbuscando contato de Luiz Henrique:");
        Contato resultado = agenda.buscarContatoPorNome("Luiz Henrique");
        if (resultado != null) {
            System.out.println("número encontrado: " + resultado);
        } else {
            System.out.println("número não encontrado.");
        }

        System.out.println("\nremovendo o contato de Matheus Pedroso");
        boolean removido = agenda.removerContato("Matheus Pedroso");
        if (removido) {
            System.out.println("número removido.");
        } else {
            System.out.println("número não encontrado.");
        }

        System.out.println("\ncontatos restantes:");
        agenda.listarContatos();
    }
}
