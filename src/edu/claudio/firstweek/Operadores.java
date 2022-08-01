package edu.claudio.firstweek;

import java.util.Date;

public class Operadores {

	public static void main(String[] args) {
		
		//classe Operadores.java
		String nome = "GLEYSON";
		int idade = 22;
		double peso = 68.5;
		char sexo = 'M';
		boolean doadorOrgao = false;
		Date dataNascimento = new Date();
		
		//classe Operadores.java
		double soma = 10.5 + 15.7;
		int subtração = 113 - 25;
		int multiplicacao = 20 * 7;
		int divisao = 15 / 3;
		double resultado = (10 * 7) + (20/4);
		
		//classe Operadores.java
		String nomeCompleto = "LINGUAGEM" + "JAVA";
				
		//qual o resultado das expressoes abaixo?
		String concatenacao ="?"; 

		concatenacao = 1+1+1+"1";

		concatenacao = 1+"1"+1+1;

		concatenacao = 1+"1"+1+"1";

		concatenacao = "1"+1+1+1;

		concatenacao = "1"+(1+1+1);
				
		//classe Operadores.java
		int numero = 5;
				
		//Imprimindo o numero negativo
		System.out.println(- numero);

		//incrementando numero em mais 1 numero, imprime 6
		numero ++;
		System.out.println(numero);

		//incrementando numero em mais 1 numero, imprime 7
		System.out.println(numero ++);// ops algo de errado não está certo

		System.out.println(numero);// agora sim, numero virou 7

		//ordem de precedencia conta aqui
		System.out.println(++ numero);

		boolean verdadeiro = true;

		System.out.println("Virou " + !verdadeiro);
		//classe Operadores.java
		int numero1 = 1;
		int numero2 = 2;

		if(numero1 > numero2)
			System.out.print("Numero 1 maior que numero 2");

		if(numero1 < numero2)
			System.out.print("Numero 1 menor que numero 2");

		if(numero1 >= numero2)
			System.out.print("Numero 1 maior ou igual que numero 2");

		if(numero1 <= numero2)
			System.out.print("Numero 1 menor ou igual que numero 2");

		if(numero1 != numero2)
			System.out.print("Numero 1 é diferente de numero 2");

		// classe Operadores.java
		boolean condicao1=true;

		boolean condicao2=false;

		if(condicao1 && condicao2)
			System.out.print("Os dois valores precisam ser verdadeiros");;

		if(condicao1 || condicao2)
			System.out.print("Um dos valores precisa ser verdadeiro");

		// classe Operadores.java
		int a, b;
		a = 5;
		b = 6;

			/*
		if(a==b)
		   resultado = "verdadeiro";
		else
		   resultado = "falso";
			 */

		String verificacaoFinal = (a==b) ? "verdadeiro" : "false";
		int valorFinal = (a==b) ? 1 : 0;

		System.out.println("Verdadeiro ou Falso: " + verificacaoFinal);
		System.out.println("Valor Final : " + valorFinal);

	}

}
