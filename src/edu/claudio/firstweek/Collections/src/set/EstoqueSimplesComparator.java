package set;

import java.util.Comparator;

public class EstoqueSimplesComparator implements Comparator<ProdutoSimples>{

		@Override
		public int compare(ProdutoSimples produto1, ProdutoSimples produto2) {

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
