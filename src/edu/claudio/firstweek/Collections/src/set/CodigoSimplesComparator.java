package set;

import java.util.Comparator;

public class CodigoSimplesComparator implements Comparator<ProdutoSimples>{
		@Override
		public int compare(ProdutoSimples produtoSimplesPrecoComparator1, ProdutoSimples produtoSimplesPrecoComparator2) {
			return produtoSimplesPrecoComparator1.getCodigo() - produtoSimplesPrecoComparator2.getCodigo() ;
		}
}
