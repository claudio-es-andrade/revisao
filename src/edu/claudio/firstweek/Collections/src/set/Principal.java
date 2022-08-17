package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import Set.src.Set.EstoqueComparator;
import Set.src.Set.PrecoComparator;

public class Principal {

	public static void main(String[] args) {
		
		HashSet<ProdutoComparable> meusProdutos = new HashSet<>();
		
		meusProdutos.add(new ProdutoComparable(23, "Casaco", "Roupa de Inverno",  300, 50.00 ) );
		meusProdutos.add(new ProdutoComparable(45, "Piscina", "Item de Construcao",  5, 2500.00) );
		meusProdutos.add(new ProdutoComparable(212, "Moto", "Veiculos",  10, 8500.00) );
		meusProdutos.add(new ProdutoComparable(88, "Parafusos", "Maquinarios",  10000, 1.50) );
		meusProdutos.add(new ProdutoComparable(56, "Arroz", "Alimentacao",  300, 25.00) );
		meusProdutos.add(new ProdutoComparable(58, "Arroz Integral", "Alimentacao",  300, 25.00) );
		
		System.out.println("Como HashSet:(Sem ordem) \n" + meusProdutos);
		
		LinkedHashSet<ProdutoComparable> meuProds = new LinkedHashSet<>(meusProdutos);
		System.out.println("Como LinkedHashSet:(Sem Ordem Também) \n" + meuProds);
		
		TreeSet<ProdutoComparable> myProducts = new TreeSet<>(meusProdutos);
		System.out.println("Como TreeSet:(Ordem pelo Nome) \n" + myProducts);
		
		ArrayList<ProdutoComparable> esteProdutos = new ArrayList<>(meusProdutos);
		System.out.println("Como ArrayList:(Sem Ordem) \n" + esteProdutos);
				
		LinkedList<ProdutoComparable> thoseProducts = new LinkedList<>(meusProdutos);
		System.out.println("Como LinkedList:(Ordem de Insercao) \n" + thoseProducts);

		System.out.println(" Realizando Pesquisas ");
		System.out.println("Como ArrayList:(Ordem por NOME) \n"  );
		
		Collections.sort(esteProdutos);
		for (ProdutoComparable produtinho : esteProdutos) {
			System.out.println(" Produto: " + produtinho);
			
		}
		
		System.out.println(" Realizando Pesquisas ");
		System.out.println("Como LinkedList:(Ordem por NOME) \n"  );
		
		Collections.sort(thoseProducts);
		for (ProdutoComparable produtinho : thoseProducts) {
			System.out.println(" Produto: " + produtinho);
			
		}
		System.out.println(" Realizando Pesquisas ");
		System.out.println("Como TreeSet:(Ordem por QUANTIDADE) \n"  );
		
		
		TreeSet<ProdutoComparable> produtoPorEstoque = new TreeSet<>(new EstoqueComparator() );
		produtoPorEstoque.addAll(myProducts);
		
		for (ProdutoComparable produtinho : produtoPorEstoque) {
			System.out.println(" Produto: " + produtinho);
			
		}
		
		System.out.println(" Realizando Pesquisas ");
		System.out.println("Como TreeSet:(Ordem por Preço) \n"  );
		
		TreeSet<ProdutoComparable> produtoPorPreco = new TreeSet<>(new PrecoComparator() );
		produtoPorPreco.addAll(myProducts);
		
		for (ProdutoComparable produtinho : produtoPorPreco) {
			System.out.println(" Produto: " + produtinho);
			
		}
		
		System.out.println(" Realizando Pesquisas ");
		System.out.println("Como TreeSet:(Ordem por Codigo) \n"  );
		
		TreeSet<ProdutoComparable> produtoPorCodigo = new TreeSet<>(new CodigoComparator() );
		produtoPorCodigo.addAll(myProducts);
		
		for (ProdutoComparable produtinho : produtoPorCodigo) {
			System.out.println(" Produto: " + produtinho);
			
		}
		System.out.println("-----------------------------------------------------");
		System.out.println(" Utilizando a classe ProdutoSimples (Sem Comparable)" );
		HashSet<ProdutoSimples> meusProdutosSimples = new HashSet<>();
		
		meusProdutosSimples.add(new ProdutoSimples(23, "Casaco", "Roupa de Inverno",  300, 50.00 ) );
		meusProdutosSimples.add(new ProdutoSimples(45, "Piscina", "Item de Construcao",  5, 2500.00) );
		meusProdutosSimples.add(new ProdutoSimples(212, "Moto", "Veiculos",  10, 8500.00) );
		meusProdutosSimples.add(new ProdutoSimples(88, "Parafusos", "Maquinarios",  10000, 1.50) );
		meusProdutosSimples.add(new ProdutoSimples(56, "Arroz", "Alimentacao",  300, 25.00) );
		meusProdutosSimples.add(new ProdutoSimples(58, "Arroz Integral", "Alimentacao",  300, 25.00) );
		
		System.out.println("Como HashSet:(Sem ordem) \n" + meusProdutosSimples);
		
		System.out.println("-----------------------------------------------------");
		System.out.println(" Realizando Pesquisas na Classe Produto Simples (Sem Comparable)");
		
		ArrayList<ProdutoSimples> esteProdutosSimples = new ArrayList<>(meusProdutosSimples);
		System.out.println("Como ArrayList:(Sem Ordem) \n" + esteProdutosSimples);
				
		LinkedList<ProdutoSimples> thoseSimpleProducts = new LinkedList<>(meusProdutosSimples);
		System.out.println("Como LinkedList:(Ordem de Insercao) \n" + thoseSimpleProducts);
		
		System.out.println(" Realizando Pesquisas na Classe ProdutoSimples (Sem Comparable)");
		TreeSet<ProdutoComparable> myTreeSimpleProducts = new TreeSet<>();
		myTreeSimpleProducts.addAll(meusProdutos);
		System.out.println("Como TreeSet:(Ordem pelo Nome) \n" + myTreeSimpleProducts);
		
//		System.out.println(" Realizando Pesquisas na Classe ProdutoSimples (Sem Comparable)");
//		System.out.println("Como ArrayList:(Ordem por NOME) \n"  );
//		
//		TreeSet<ProdutoSimples> produtoSimplesPorNome = new TreeSet<>(meusProdutosSimples);
//		System.out.println(produtoSimplesPorNome.toString());
		
//      Não funcionará por não ser COMPARABLE		
//		Collections.sort(esteProdutosSimples);
//		for (ProdutoSimples produtinhoSimples : esteProdutosSimples) {
//			System.out.println(" Produto: " + produtinhoSimples);
//			
//		}
//		
//		System.out.println(" Realizando Pesquisas ");
//		System.out.println("Como LinkedList:(Ordem por NOME) \n"  );
//		
//		Collections.sort(thoseSimpleProducts);
//		for (ProdutoSimples produtinhoSimples : thoseSimpleProducts) {
//			System.out.println(" Produto: " + produtinhoSimples);
//			
//		}
		
	
		System.out.println("-----------------------------------------------------");
		System.out.println(" Realizando Pesquisas na Classe Produto Simples (Sem Comparable)");
		System.out.println("Como TreeSet:(Ordem por QUANTIDADE) \n"  );
		
		
		TreeSet<ProdutoSimples> produtoSimplesPorEstoque = new TreeSet<>(new EstoqueSimplesComparator() );
		produtoSimplesPorEstoque.addAll(meusProdutosSimples);
		
		for (ProdutoSimples produtinhoSimples : produtoSimplesPorEstoque) {
			System.out.println(" Produto: " + produtinhoSimples);
			
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println(" Realizando Pesquisas na Classe Produto Simples (Sem Comparable)");
		System.out.println("Como TreeSet:(Ordem por Preço) \n"  );
		
		TreeSet<ProdutoSimples> produtoSimplesPorPreco = new TreeSet<>(new PrecoSimplesComparator() );
		produtoSimplesPorPreco.addAll(meusProdutosSimples);
		
		for (ProdutoSimples produtinhoSimples : produtoSimplesPorPreco) {
			System.out.println(" Produto: " + produtinhoSimples);
			
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println(" Realizando Pesquisas na Classe Produto Simples (Sem Comparable)");
		System.out.println("Como TreeSet:(Ordem por Codigo) \n"  );
		
		TreeSet<ProdutoSimples> produtoSimplesPorCodigo = new TreeSet<>(new CodigoSimplesComparator() );
		produtoSimplesPorCodigo.addAll(meusProdutosSimples);
		
		for (ProdutoSimples produtinhoSimples : produtoSimplesPorCodigo) {
			System.out.println(" Produto: " + produtinhoSimples);
			
		}
		
		
	}

}
