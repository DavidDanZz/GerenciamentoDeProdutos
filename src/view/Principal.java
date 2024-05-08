package view;
import model.Produto;

public class Principal {
	public static void main(String [] args) {
		
		Produto produto = new Produto(1, "Camiseta", 29.99, 50);

        produto.adicionarEstoque(20);

        produto.removerEstoque(10);

        int quantidadeCompra = 5;
        double valorTotal = produto.calcularValorTotal(quantidadeCompra);
        System.out.println("Valor total da compra de " + quantidadeCompra + " unidades de " 
                            + produto.getNome() + ": R$" + valorTotal);
    }
		
		
		
		
}
