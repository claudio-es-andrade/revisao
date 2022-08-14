package Set;

import java.time.LocalDate;
import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{
	
	private String nome;
	private Integer anoDeCriacao;
	private String ide;
	
	
	
	
	public LinguagemFavorita() {
		super();
	}
	public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
		super();
		this.nome = nome;
		this.anoDeCriacao = anoDeCriacao;
		this.ide = ide;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAnoDeCriacao() {
		return anoDeCriacao;
	}
	public void setAnoDeCriacao(Integer anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}
	public String getIde() {
		return ide;
	}
	public void setIde(String ide) {
		this.ide = ide;
	}
	@Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }
	
	@Override
	public int hashCode() {
		return Objects.hash(anoDeCriacao, ide, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinguagemFavorita other = (LinguagemFavorita) obj;
		return Objects.equals(anoDeCriacao, other.anoDeCriacao) && Objects.equals(ide, other.ide)
				&& Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "CLASSE LinguagemFavorita { Nome: " + nome + ", Ano de Criação: " + anoDeCriacao + ", IDE: " + ide + "}";
	}
	
	

}
