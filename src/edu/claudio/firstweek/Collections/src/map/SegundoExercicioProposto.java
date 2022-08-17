package map;

import java.util.Random;
import java.util.TreeMap;

public class SegundoExercicioProposto {
	public static void main(String[] args) {
		
		TreeMap<String , Integer> dadoJogadoVariasVezes = new TreeMap<>();
		dadoJogadoVariasVezes = jogarDado();
		System.out.println("Quantidade Jogada: " + dadoJogadoVariasVezes);
	    
	}
	public static TreeMap<String , Integer> jogarDado(){
		
		TreeMap<String , Integer> valoresEncontrados = new TreeMap<>();
		
		int somatorioUm = 0;
		int somatorioDois = 0;
		int somatorioTres = 0;
		int somatorioQuatro = 0;
		int somatorioCinco = 0;
		int somatorioSeis = 0;
		int quantidadeJogada = 106;
		for (int i = 0; i < quantidadeJogada; i++) {
            int valorEncontrado  = gerarNumerosInteirosAleatorios(1 , 6);
            switch(valorEncontrado) {
            	case (1):{
            		valoresEncontrados.put("Número 1: ", somatorioUm++);
            		break;
            	}
            	case (2):{
            		valoresEncontrados.put("Número 2: ", somatorioDois++);
            		break;
            	}
            	case (3):{
            		valoresEncontrados.put("Número 3: ", somatorioTres++);
            		break;
            	}
            	case (4):{
            		valoresEncontrados.put("Número 4: ", somatorioQuatro++);
            		break;
            	}
            	case (5):{
            		valoresEncontrados.put("Número 5: ", somatorioCinco++);
            		break;
            	}
            	case (6):{
            		valoresEncontrados.put("Número 6: ", somatorioSeis++);
            		break;
            	}
            
            }
            
        }
            return valoresEncontrados;
    }
	
	public static int gerarNumerosInteirosAleatorios(int min, int max) {
    	Random random = new Random();
    	int valorEncontrado = random.nextInt((max + 1) - min) + min;
  		return valorEncontrado;
    }
	
	
}
