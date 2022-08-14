package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrimeiroExercicioProposto { //  Cores do Arco Íris: vermelha, laranja, amarela, verde, azul, azul-escuro e violeta
	
	public static void main(String[] args) {
		
		HashSet<String> myarcoiris = new HashSet<String>() {{ 
			add(new String("vermelho"     ));
			add(new String("laranja"      ));
			add(new String("amarela"      ));
			add(new String("verde"        ));
			add(new String("azul"         ));
			add(new String("azul-escuro"  ));
			add(new String("violeta"      ));
		}};
		
		int iteracao = 0;
		System.out.println(" Cores do Arco Iris: ");
		for (String cores  : myarcoiris) {
			System.out.println( cores  );
			iteracao++;
			
		}
		System.out.println(" Quantidade de cores: " + iteracao);
		
		TreeSet<String> myarcoiris2 = new TreeSet<>(myarcoiris);
		System.out.println(" No conjunto TreeSet a ordenação fica: " + myarcoiris2 );
		System.out.println(" Primeiro Item: " + myarcoiris2.first() );
		System.out.println(" Último Item: " + myarcoiris2.last() );
		System.out.println(" Ordem Natural para TreeSet: " + myarcoiris2    );
		System.out.println(" Ordem Inversa para TreeSet: " + myarcoiris2.descendingSet()   );
		
		LinkedHashSet<String> myarcoiris3 = new LinkedHashSet<>(myarcoiris);
		
		ArrayList<String> myarcoiris4 = new ArrayList<>(myarcoiris3);
		
		Collections.reverse(myarcoiris4);
		System.out.println("Ordem Inversa da Original: " +  myarcoiris4 );
		
		System.out.println("Todas as cores que começam com a letra ”v”: ");
        for (String corV: myarcoiris4) {
            if(corV.startsWith("v")) System.out.println(corV);
        }
		
        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        
        Iterator<String> contador = myarcoiris4.iterator();
        while (contador.hasNext()) {
            if (!contador.next().startsWith("v")) contador.remove();
        }
        System.out.println(myarcoiris4);
        
        System.out.println("Limpando o conjunto: ");
        myarcoiris4.clear();

        System.out.println("Verificando se ainda há o conjunto: " + myarcoiris4.isEmpty());
        
		
	}
}
