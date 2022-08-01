package edu.claudio.firstweek;

public class Metodos {
	private double num1;
	private double num2;
	
	//LOGICA - FINALIDADE DO MÉTODO
	public double somar(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
		
		double total = num1 + num2;
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c;
		a = 20.8;
		b = 30.0;
		
		Metodos metodoc = new Metodos();
		c = metodoc.somar(a, b);
		System.out.println("Soma Total: " + c);
		dizerOla("Joao");
		
	}

	public static void dizerOla(String nome){
		
		String seuNome = nome;
		System.out.println("Muito Prazer " + seuNome );
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
	}
}
