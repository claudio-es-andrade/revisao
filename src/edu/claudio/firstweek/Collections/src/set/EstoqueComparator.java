package set;

import java.util.Comparator;

import set.ProdutoComparable;

public class EstoqueComparator implements Comparator<ProdutoComparable>{

	
	@Override
	public int compare(ProdutoComparable produto1, ProdutoComparable produto2) {

        int estoqueQuantidade = Integer.compare(produto1.getQuantidade(), produto2.getQuantidade());
        int ordemCodigo = Integer.compare(produto1.getCodigo(), produto2.getCodigo());
        
		
		if(estoqueQuantidade != 0 ) {
			return estoqueQuantidade;
		}
		else {
			return ordemCodigo;
		}
		
	}
}
