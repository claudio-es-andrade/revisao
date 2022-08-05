package edu.claudio.firstweek.ImprimeCopiaDigitaliza.Multifuncional;

import edu.claudio.firstweek.ImprimeCopiaDigitaliza.Copiadora.Copiadora;
import edu.claudio.firstweek.ImprimeCopiaDigitaliza.Digitalizadora.Digitalizadora;
import edu.claudio.firstweek.ImprimeCopiaDigitaliza.Impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void digitalizar() {
		// TODO Auto-generated method stub
		System.out.println("DIGITALIZANDO NA MULTIFUNCIONAL...");
	}

	@Override
	public void copiar() {
		// TODO Auto-generated method stub
		System.out.println("COPIANDO NA MULTIFUNCIONAL...");
	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("IMPRIMINDO NA MULTIFUNCIONAL...");
	}
	

}
