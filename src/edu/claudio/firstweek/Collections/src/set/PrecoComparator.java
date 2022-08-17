package set;

import java.util.Comparator;

import set.ProdutoComparable;

public class PrecoComparator implements Comparator<ProdutoComparable>{

	@Override
	public int compare(ProdutoComparable produtoPrecoComparator1, ProdutoComparable produtoPrecoComparator2) {
		return (int) ((int) produtoPrecoComparator1.getPreco() - produtoPrecoComparator2.getPreco()) ;
	}
}
 