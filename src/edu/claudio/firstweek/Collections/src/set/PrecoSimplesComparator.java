package set;

import java.util.Comparator;

public class PrecoSimplesComparator implements Comparator<ProdutoSimples>{
	@Override
	public int compare(ProdutoSimples produtoSimplesPrecoComparator1, ProdutoSimples produtoSimplesPrecoComparator2) {
		return (int) ((int) produtoSimplesPrecoComparator1.getPreco() - produtoSimplesPrecoComparator2.getPreco()) ;
	}
}
