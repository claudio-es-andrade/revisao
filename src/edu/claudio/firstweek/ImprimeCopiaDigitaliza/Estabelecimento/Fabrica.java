package edu.claudio.firstweek.ImprimeCopiaDigitaliza.Estabelecimento;

import edu.claudio.firstweek.ImprimeCopiaDigitaliza.Copiadora.Copiadora;
import edu.claudio.firstweek.ImprimeCopiaDigitaliza.Digitalizadora.Digitalizadora;
import edu.claudio.firstweek.ImprimeCopiaDigitaliza.Impressora.DeskJet;
import edu.claudio.firstweek.ImprimeCopiaDigitaliza.Impressora.Impressora;
import edu.claudio.firstweek.ImprimeCopiaDigitaliza.Impressora.LaserJet;
import edu.claudio.firstweek.ImprimeCopiaDigitaliza.Multifuncional.Multifuncional;

public class Fabrica {
	
	public static void main(String[] args) {
//		Impressora impressora1 = new DeskJet();
//		Impressora impressora2 = new LaserJet();
//		Impressora impressora3 = new Multifuncional();
//		
//		impressora1.imprimir();
//		impressora2.imprimir();
//		impressora3.imprimir();
		
		Multifuncional em = new Multifuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
	

}
