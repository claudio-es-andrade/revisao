package map;

import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.TreeMap;

public class NumeroDeJogadasDoDado {
	
	private String valorUm      = "NUMERO UM  ";
	private String valorDois    = "NUMERO DOIS  ";
	private String valorTres    = "NUMERO TRES  ";
	private String valorQuatro  = "NUMERO QUATRO  "; 
	private String valorCinco   = "NUMERO CINCO  ";
	private String valorSeis    = "NUMERO SEIS  ";
	
	private Integer quantidadeDeJogos ;
	
	
	public void setQuantidadeDeJogos(Integer quantidadeDeJogos) {
		this.quantidadeDeJogos = quantidadeDeJogos;
	}
	
	
	
	public NumeroDeJogadasDoDado(Integer quantidadeDeJogos) {
		super();
		this.quantidadeDeJogos = quantidadeDeJogos;
		TreeMap<String , Integer> valoresEncontrados = new TreeMap<>(jogarDado(quantidadeDeJogos));
		System.out.println(valoresEncontrados);
		
	}



	public TreeMap<String, Integer> jogarDado(Integer quantidadeDeJogos){
		
		TreeMap<String , Integer> valoresEncontrados = new TreeMap<>();
		
		this.quantidadeDeJogos = quantidadeDeJogos;
		
		int somatorioUm = 0;
		int somatorioDois = 0;
		int somatorioTres = 0;
		int somatorioQuatro = 0;
		int somatorioCinco = 0;
		int somatorioSeis = 0;
		int quantidadeJogada = this.quantidadeDeJogos;
		
		for (int i = 1; i <= quantidadeJogada; i++) {
            int valorEncontrado  = gerarNumerosInteirosAleatorios(1 , 6);
            switch(valorEncontrado) {
            	case (1):{
            		valoresEncontrados.put( this.valorUm , somatorioUm++);
            		break;
            	}
            	case (2):{
            		valoresEncontrados.put(this.valorDois , somatorioDois++);
            		break;
            	}
            	case (3):{
            		valoresEncontrados.put(this.valorTres , somatorioTres++);
            		break;
            	}
            	case (4):{
            		valoresEncontrados.put(this.valorQuatro , somatorioQuatro++);
            		break;
            	}
            	case (5):{
            		valoresEncontrados.put(this.valorCinco  , somatorioCinco++);
            		break;
            	}
            	case (6):{
            		valoresEncontrados.put(this.valorSeis , somatorioSeis++);
            		break;
            	}
            
            }
            
        }
            return valoresEncontrados;
    }
	
	public int gerarNumerosInteirosAleatorios(int min, int max) {
    	Random random = new Random();
    	int valorEncontrado = random.nextInt((max + 1) - min) + min;
  		return valorEncontrado;
    }



	@Override
	public int hashCode() {
		return Objects.hash(quantidadeDeJogos, valorCinco, valorDois, valorQuatro, valorSeis, valorTres, valorUm);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumeroDeJogadasDoDado other = (NumeroDeJogadasDoDado) obj;
		return Objects.equals(quantidadeDeJogos, other.quantidadeDeJogos)
				&& Objects.equals(valorCinco, other.valorCinco) && Objects.equals(valorDois, other.valorDois)
				&& Objects.equals(valorQuatro, other.valorQuatro) && Objects.equals(valorSeis, other.valorSeis)
				&& Objects.equals(valorTres, other.valorTres) && Objects.equals(valorUm, other.valorUm);
	}
	
}
