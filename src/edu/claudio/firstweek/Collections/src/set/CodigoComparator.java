package set;

import java.util.Comparator;

public class CodigoComparator implements Comparator<ProdutoComparable>{

	@Override
	public int compare(ProdutoComparable produtoCodigoComparator1, ProdutoComparable produtoCodigoComparator2) {
		return  produtoCodigoComparator1.getCodigo() - produtoCodigoComparator2.getCodigo() ;
	}

}
