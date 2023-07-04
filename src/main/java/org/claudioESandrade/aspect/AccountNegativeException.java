package org.claudioESandrade.aspect;

public class AccountNegativeException extends Exception{
			
	public void AccountNegativeException(){
		System.out.println("Procedimento cancelado devido a conta possuir valor negativo");
	}
		
}
