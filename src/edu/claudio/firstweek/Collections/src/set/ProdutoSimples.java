package set;

import java.util.Objects;

public class ProdutoSimples {
	
	private Integer    codigo;
	private String     nome;
	private String     descricao;
	private Integer        quantidade;
	private Double     preco;
	
	public ProdutoSimples() {
		super();
	}
	
	public ProdutoSimples(int codigo, String nome, String descricao, int quantidade, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo, descricao, nome, preco, quantidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoSimples other = (ProdutoSimples) obj;
		return codigo == other.codigo && Objects.equals(descricao, other.descricao) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco)
				&& quantidade == other.quantidade;
	}

	@Override
	public String toString() {
		return "Classe Produto Simples \n { Codigo: " + codigo + ", Nome: " + nome + ", Descricao: " + descricao + ", Quantidade: "
				+ quantidade + ", Preco: " + preco + " } \n";
	}

}
