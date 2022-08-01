package edu.claudio.firstweek;

import java.util.Scanner;

public class AboutMeScanner{

public static void main(String[] args) {
    
    try (Scanner entrada = new Scanner(System.in)) {
		System.out.println("Digite seu nome: ");
		String nome = entrada.next();
		
		System.out.println("Digite agora o seu sobrenome: ");
		String sobrenome = entrada.next();
		
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();

		System.out.println("Digite a sua altura: ");
		double altura = entrada.nextDouble();

		System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " " + "anos.");
		System.out.println("Minha altura é " + altura + " metros." );
	}
    
}

}