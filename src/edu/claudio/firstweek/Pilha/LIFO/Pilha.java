package edu.claudio.firstweek.Pilha.LIFO;

public class Pilha {
	
	private No refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public No top() {
		
		return refNoEntradaPilha;
	}
	
	public void push(No novoNo) {
		No refeAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refeAuxiliar);
	}
	
	public No pop() {
		if(!this.isEmpty()  ) {
			No noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		else {
			return null;
		}
	}
	
	
	public boolean isEmpty() {
		
//		if(refeEntradaPilha == null) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
		return refNoEntradaPilha == null ? true: false; 
	}
	
	@Override
	public String toString() {
		
		String stringRetorno = "----------------------------\n";
		stringRetorno       += "           Pilha            \n";
		stringRetorno       += "----------------------------\n";
		
		No noAuxiliar = refNoEntradaPilha;
		
		while (true) {
			if(noAuxiliar != null) {
				stringRetorno += "{  No [ dado = " + noAuxiliar.getDado() +" ]  }\n";
				noAuxiliar = noAuxiliar.getRefNo();
				
			}
			else {
				break;
			}
		}
		stringRetorno +=  "----------------------------\n";
		return stringRetorno;
	}
	
}
