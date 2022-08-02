package ContaTerminal;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception{

		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira sua conta: ");
		int numero = entrada.nextInt();
		// System.out.println("Conta: " + numero);

		entrada.nextLine();

		System.out.println("Insira sua Agência: ");
		String agencia = entrada.nextLine();
		// System.out.println("Agência: " + agencia);
		entrada.nextLine();

		System.out.println("Insira seu nome: ");
		String nome = entrada.nextLine();
		// System.out.println("Nome: " + nome);
		entrada.nextLine();


		System.out.println("Insira seu saldo: ");
		double saldo = entrada.nextDouble();
		// System.out.println("Saldo: " + saldo);
		entrada.nextLine();
		entrada.close();

		System.out.println(" Olá " + nome + "! \n Obrigado por criar uma conta no nosso banco, \n sua agência é "
				+ agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

	}

}

