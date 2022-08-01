import java.util.Scanner;

public class teste001 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, PROD;
		
		System.out.println("Insira o valor do primeiro numero: ");
		A = sc.nextInt();
		System.out.println("Insira o valor do segundo numero: ");
		B = sc.nextInt();
		 //TODO: Complete os espaços em branco com uma possível solução para o desafio 
		PROD =  A * B;  

		System.out.println("PROD = " +   PROD  );
	}
}

