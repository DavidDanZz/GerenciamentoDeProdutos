package model;

public class Produto {
	public int id;
	public String nome;
	public double preco;
	public int quantidadeEstoque;

	public Produto(int id, String nome, double preco, int quantidadeEstoque) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public void adicionarEstoque(int quantidade) {
		if (quantidade <= 0) {
			System.out.println("Quantidade Inválida, a quantidade deve ser maior que 0");
		} else {
			quantidadeEstoque += quantidade;
			System.out.println("Unidade de Produto " + nome + "Adicionadas ao estoque.");
		}
	}

	public void removerEstoque(int quantidade) {
		if (quantidade <= 0) {
			System.out.println("Quantidade inválida. A quantidade deve ser maior que zero.");
		} else if (quantidade > quantidadeEstoque) {
			System.out.println("Quantidade insuficiente em estoque. A quantidade disponível é de " + quantidadeEstoque
					+ " unidades.");
		} else {
			quantidadeEstoque -= quantidade;
			System.out.println(quantidade + " unidades do produto " + nome + " removidas do estoque.");
		}

	}

	public double calcularValorTotal(int quantidade) {
		return preco * quantidade;
	}

}
