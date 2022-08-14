package Set;

import java.util.Comparator;

public class IdeComparator implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
		
		int ideFavorita = o1.getIde().compareTo(o2.getIde()  );
		int linguagemNome = o1.getNome().compareTo(o2.getNome() );
		int dataCriacao = Integer.compare(o1.getAnoDeCriacao(), o2.getAnoDeCriacao());
		
		if(ideFavorita != 0 ) {
			return ideFavorita;
		}
		else if(linguagemNome !=0 ) {
			return linguagemNome;
		}
		else {
			return dataCriacao;
		}
	}
	

}
