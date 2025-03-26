import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Pizza pizzaEscolhida;
    private String enderecoEntrega;
    private boolean cancelado;

    public Pedido(Pizza pizzaEscolhida, String enderecoEntrega) {
        this.pizzaEscolhida = pizzaEscolhida;
        this.enderecoEntrega = enderecoEntrega;
        this.cancelado = false;
    }

    public void cancelar() {
        this.cancelado = true;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public Pizza getPizzaEscolhida() {
        return pizzaEscolhida;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    @Override
    public String toString() {
        return "pizza: " + pizzaEscolhida.getNome() + " | endereço: " + enderecoEntrega + " | valor: " + pizzaEscolhida.getValor() + " R$ | cancelado: " + (cancelado ? "sim" : "não");
    }
}
