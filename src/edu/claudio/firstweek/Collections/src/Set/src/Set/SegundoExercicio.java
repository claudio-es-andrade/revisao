package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SegundoExercicio {
	public static void main(String[] args) {
		
		execute();
		
	}

	public static void execute() {
		
		HashSet<LinguagemFavorita> minhasLinguagens01 = new HashSet<>();
		
		minhasLinguagens01.add(new LinguagemFavorita("C", 1972, "Code Blocks") );
		minhasLinguagens01.add(new LinguagemFavorita("Python", 1991, "VS Code") );
		minhasLinguagens01.add(new LinguagemFavorita("Java", 1991, "Eclipse") );
		
		System.out.println(" Conjunto na Ordem de Inserção");
		LinkedHashSet<LinguagemFavorita> minhasLinguagens02 = new LinkedHashSet<>(minhasLinguagens01);
		
		for (LinguagemFavorita alinguagemPreferida : minhasLinguagens02) {
			System.out.println(alinguagemPreferida);
		}
		
		System.out.println(" Conjunto na Ordem Natural (Nome - Alfabética)");
		TreeSet<LinguagemFavorita> minhasLinguagens03 = new TreeSet<>(minhasLinguagens01);
		for (LinguagemFavorita aPreferidaOrdenada : minhasLinguagens03) {
			System.out.println(aPreferidaOrdenada);
		}
		
		System.out.println(" Conjunto na Ordem da IDE Preferida (Alfabética)");
		TreeSet<LinguagemFavorita> minhasLinguagensIDE = new TreeSet<>(new IdeComparator() );
		minhasLinguagensIDE.addAll(minhasLinguagens01);
		for (LinguagemFavorita idePreferidaOrdenada : minhasLinguagensIDE) {
			System.out.println(idePreferidaOrdenada);
		}
		
		System.out.println(" Conjunto na Ordem da Data de Criaçao e do Nome da Linguagem Preferida (Alfabética)");
		TreeSet<LinguagemFavorita> dataLinguagens = new TreeSet<>(new AnoCriacaoComparator() );
		dataLinguagens.addAll(minhasLinguagens03);
		for (LinguagemFavorita dataDeCriacaoOrdenada : dataLinguagens) {
			System.out.println(dataDeCriacaoOrdenada);
		}
	}
	
}
