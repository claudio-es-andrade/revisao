package edu.claudio.firstweek.Pilha.LIFO;

public class No {
	private int dado;
	private No refNo = null;
	
	public No() {
		super();
	}

	public No(int dado) {
		super();
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No reNo) {
		this.refNo = reNo;
	}

	@Override
	public String toString() {
		return "No [dado=" + dado + "]";
	}
	
	
	
}
