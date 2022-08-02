package edu.claudio.firstweek;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatchExample {
	

	public static void main(String[] args) {
		
		try {

			//criando o objeto scanner
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

			System.out.println("Digite seu nome");
			String nome = scanner.next();
			scanner.nextLine();

			System.out.println("Digite seu sobrenome");
			String sobrenome = scanner.next();
			scanner.nextLine();

			System.out.println("Digite sua idade");
			int idade = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Digite sua altura");
			double altura = scanner.nextDouble();
			scanner.nextLine();


			//imprimindo os dados obtidos pelo usuario
			System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
			System.out.println("Tenho " + idade + " anos ");
			System.out.println("Minha altura é " + altura + "cm ");
			scanner.close();
		}
		catch(InputMismatchException  e) {
			System.out.println(" No campo idade é necessário colocar um número inteiro, por exemplo (43)."
					+ "\n No campo altura é necessário colocar um número com pontos, por exemplo (1.53)");
		}
	}
}