package org.claudioESandrade.aspect;

import  org.claudioESandrade.bank.*;
import org.aspectj.*;
import org.aspectj.lang.*;
import org.aspectj.lang.reflect.*;

public aspect Valor {
	pointcut uniqueLog(): call(* *.sacar(double valor) );
	before(double valor) : uniqueLog() { 
		if (valor < 0) { 
			System.out.println(" Retirada não permitida: limite de valor excedido. ");
			throw new IllegalArgumentException();
			throw new AccountNegativeException();
		}
		else
			System.out.println(" Aguarde que o saque será realizado...");
			
		
	}
	pointcut uniqueLog(): call(*  *.transferir(double valor) );
	before(double valor) : uniqueLog() { 
		if (valor < 0) { 
			System.out.println(" Retirada não permitida: limite de valor excedido. ");
			throw new IllegalArgumentException();
			throw new AccountNegativeException();
		}
		else
			System.out.println(" Aguarde a realização da transferência...");
			
		
	}
}
