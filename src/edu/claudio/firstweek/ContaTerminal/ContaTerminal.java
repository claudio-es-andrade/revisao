package ContaTerminal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
	
    /**
    * @param args
    * @throws Exception
    */
	public static void main(String[] args) {
    	//TODO: Conhecer e importar a classe Scanner:
		try{
			Scanner entrada = new Scanner(System.in);
	        
	        // Exibir as mensagens para o nosso usuario
	        // Obter pela classe Scanner os valores digitados no terminal.
	        System.out.println(" Por favor, digite o número da Agência !");
	        int numero = entrada.nextInt();
	        System.out.println(" ");
	        entrada.nextLine();

	        System.out.println(" Por favor, digite a Agência:");
	        String agencia = entrada.nextLine();
	        System.out.println(" ");
	        entrada.nextLine();
	        
	        System.out.println(" Por favor, digite o seu Nome!");
	        String nomeCliente = entrada.nextLine();
	        System.out.println(" ");
	        entrada.nextLine();
	        
	        System.out.println(" Por favor, digite o seu saldo");
	        double saldo = entrada.nextDouble();
	        System.out.println(" ");
	        entrada.nextLine();
        
	        System.out.println("Olá " + nomeCliente + ", \nobrigado por criar uma conta em nosso banco, \nsua agência é  "  
	        		+ agencia + ", conta " 
	        		+ numero + " e seu saldo " 
	        		+ saldo   + " já está disponível para saque");

	        entrada.close();
	        
	        }
		catch (InputMismatchException err) {
	        	System.out.println("Erro! O valor digitado não é válido. Tente novamente!");
	        	err.printStackTrace();
	    	}
	        //Exibir a mensagem criada.

	    }
}
