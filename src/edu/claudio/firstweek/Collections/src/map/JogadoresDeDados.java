package map;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.TreeMap;
import map.NumeroDeJogadasDoDado;

public class JogadoresDeDados {
	private String nomeJogador;
	private Integer numeroDeJogadas;
	
	public JogadoresDeDados(String nomeJogador, Integer numeroDeJogadas) {

		this.nomeJogador = nomeJogador;
		this.numeroDeJogadas = numeroDeJogadas;
		
		System.out.println(" Estatisticas das Jogadas do Dado do  " + nomeJogador);
		NumeroDeJogadasDoDado resultadoGeral = new NumeroDeJogadasDoDado(numeroDeJogadas);
	
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public Integer getNumeroDeJogadas() {
		return numeroDeJogadas;
	}

	public void setNumeroDeJogadas(Integer numeroDeJogadas) {
		this.numeroDeJogadas = numeroDeJogadas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeJogador, numeroDeJogadas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JogadoresDeDados other = (JogadoresDeDados) obj;
		return Objects.equals(nomeJogador, other.nomeJogador) && Objects.equals(numeroDeJogadas, other.numeroDeJogadas);
	}

	@Override
	public String toString() {
		return "Classe Jogadores de Dados \n { Nome do Jogador: " + nomeJogador + ", Número de Jogadas: " + numeroDeJogadas + "} \n";
	}	
	
}
