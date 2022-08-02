package edu.claudio.firstweek;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
	
	 public static void main(String[] args) {

		 try {
			 Number valor = Double.valueOf("a1.75");
			 valor = NumberFormat.getInstance().parse("a1.75");
			 System.out.println(valor);
			 
		 } catch (NumberFormatException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
			 System.out.println(" Deixe apenas os números. Remova todas as letras juntas dos números para ocorrer a conversão de valores");
			 
		 }catch(ParseException e) {
			 e.printStackTrace();
			 System.out.println(" Deixe apenas os números. Remova todas as letras juntas dos números para ocorrer a conversão de valores");
			 
		 }

	 }

}