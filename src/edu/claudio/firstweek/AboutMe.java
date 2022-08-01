package edu.claudio.firstweek;

public class AboutMe{

public static void main(String[] args) {
    
    String nome = args [0];
    String sobrenome = args[1];
    int idade = Integer.parseInt(args[2]);
    double altura = Double.parseDouble(args[3]);

    System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade + " " + "anos.");
    System.out.println("Minha altura é " + altura + " metros." );
    
}

}