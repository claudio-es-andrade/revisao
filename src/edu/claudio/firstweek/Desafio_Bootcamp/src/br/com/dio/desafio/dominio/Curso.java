package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargahoraria;

    public Curso() {
    }

    public int getCargahoraria(int i) {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Título:'" + getTitulo() + '\'' +
                ", Descrição:'" + getDescricao() + '\'' +
                ", Carga Horária:" + cargahoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargahoraria;
    }
}
