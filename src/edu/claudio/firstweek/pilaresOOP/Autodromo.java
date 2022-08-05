package edu.claudio.firstweek.pilaresOOP;

public class Autodromo {
	
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("897897");
		//jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("467647");
		//z400.ligar();
		
		//Veiculo coringa = jeep;
		Veiculo coringa = z400;
		
		coringa.ligar();
	}
	
}
