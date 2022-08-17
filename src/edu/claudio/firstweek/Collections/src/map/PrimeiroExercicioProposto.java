package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PrimeiroExercicioProposto {
//	Estado = PE - População = 9.616.621
//	Estado = AL - População = 3.351.543
//	Estado = CE - População = 9.187.103
//	Estado = RN - População = 3.534.265
	
	public static void main(String[] args) {
		
		HashMap<String, Integer > populacaoNordeste = new HashMap<>() {{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
		}};
		
		populacaoNordeste.put("RN", 3534265);
		System.out.println(" População do Nordeste: " + populacaoNordeste);
		populacaoNordeste.put("RN", 3534165);
		System.out.println(" População do Nordeste: " + populacaoNordeste);
		
		System.out.println("Conferindo se há o Estado PB: (Verdadeiro) ou (Falso)" + populacaoNordeste.containsKey("PB"));
		populacaoNordeste.put("PB", 4039277);
		System.out.println(" População de PE (Pernambuco): " + populacaoNordeste.get("PE"));
		System.out.println(" População do Nordeste: " + populacaoNordeste);
		
		System.out.println("Exiba o modelo mais econômico e seu consumo: ");
//		Lista dos Estados em Ordem Alfabética	
		
		Map<String, Integer > populacaoNordesteAlfabetica = new TreeMap<>(populacaoNordeste);
		System.out.println(" População do Nordeste: (Ordem Alfabética)" + populacaoNordesteAlfabetica);

//		Estado menos Populoso
        Integer estadosVazios = Collections.min(populacaoNordeste.values());
        Set<Map.Entry<String, Integer>> entradaMenor = populacaoNordeste.entrySet();
        String menorEstado = "";

        for (Entry<String, Integer> entry : entradaMenor) {
            if (entry.getValue().equals(estadosVazios )) {
                menorEstado = entry.getKey();
                System.out.println("Estado menos populoso: " + menorEstado + " - " + estadosVazios);
            }
        }

//		Estado mais Populoso
        Integer estadosPopulosos = Collections.max(populacaoNordeste.values());
        Set<Map.Entry<String, Integer>> entradaMaior = populacaoNordeste.entrySet();
        String maiorEstado = "";

        for (Entry<String, Integer> entry : entradaMaior) {
            if (entry.getValue().equals(estadosPopulosos )) {
                maiorEstado = entry.getKey();
                System.out.println("Estado mais populoso: " + maiorEstado + " - " + estadosPopulosos);
            }
        }
        
//		Soma da Populacao dos Estados      		
        Iterator<Integer> contador = populacaoNordeste.values().iterator();
        Double somatorio = 0d;
        while(contador.hasNext()){
            somatorio += contador.next();
        }
        System.out.println("População do Nordeste: " + somatorio);

        System.out.println("Média de população por Estado: " + (somatorio/populacaoNordeste.size()));
        
        System.out.println("Estados com população menor que 40000000: ");
        Iterator<Integer> contador2 = populacaoNordeste.values().iterator();
        while(contador2.hasNext()){
            if(contador2.next() <= 4000000 ) contador2.remove();
        }
        System.out.println(populacaoNordeste);
        
        System.out.println("Apagando o dicionario. ");
        populacaoNordeste.clear();
        System.out.println(populacaoNordeste);

        System.out.println("Confirindo a lista vazia: (Verdadeiro) ou (Falso) " + populacaoNordeste.isEmpty());
        
        
	}
	
	
}
