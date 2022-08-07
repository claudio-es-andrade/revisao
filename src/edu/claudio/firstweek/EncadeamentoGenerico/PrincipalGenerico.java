package edu.claudio.firstweek.EncadeamentoGenerico;

import edu.claudio.firstweek.Encadeamento.No;

public class PrincipalGenerico {
	
	public static void main(String[] args) {

		NoGenerico<String> no1 = new NoGenerico<>("Conteudo no1");
		NoGenerico<String> no2 = new NoGenerico<>("Conteudo no2");
		no1.setProximoNo(no2);
		NoGenerico<String> no3 = new NoGenerico<>("Conteudo no3");
		no2.setProximoNo(no3);
		NoGenerico<String> no4 = new NoGenerico<>("Conteudo no4");
		no3.setProximoNo(no4);
		//no1->no2->no3->no4->null
		System.out.println("no1->no2->no3->no4->null");
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no2);

		System.out.println("no1->no2->no3->no4->null");
		System.out.println(no1);
		System.out.println(no1.getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	}
	
}
