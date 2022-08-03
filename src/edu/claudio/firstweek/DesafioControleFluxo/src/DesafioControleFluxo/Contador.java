package DesafioControleFluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		try {
			Scanner terminal = new Scanner(System.in);
			
			System.out.println("Insira o primeiro paramêtro");
			int parametroUm = terminal.nextInt();
			
			System.out.println("Insira o segundo paramêtro");
			int parametroDois = terminal.nextInt();
			
			contar(parametroUm, parametroDois);
			terminal.close();
		}
		catch (InputMismatchException err) {
        	System.out.println("Erro! O valor digitado não é válido. Tente novamente!");
        	err.printStackTrace();
    	}
		catch(ParametrosInvalidosException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		
		int contagem = parametroDois - parametroUm;
		
		if (parametroDois < parametroUm) {
			//System.out.println("O segundo parâmetro deve ser MAIOR que o primeiro");
			throw new ParametrosInvalidosException();
		}
		else{
			for (int limite = 1; limite <= contagem; limite++) {
				System.out.println("Imprimindo o número " + limite);
			}
		}
		
		
		
		
	}

}
