package Servicos;

import aparelho.TelefoneHardware;

public class Telefone extends TelefoneHardware{
	
	private String user;
	private String numero;
	private String contato;
	
	public void ligar(){
		
		if (numero == null )
			selecionar();
		else 
			digitarNumero();

		System.out.println("Ligando ...");
	}
	public void atender(){
		System.out.println("Atendendo a ligação...");
		
	}
	public void iniciar(){
		System.out.println("Iniciou a conversa...");
	}
	public void desligar() {
		System.out.println("Acabou a conversa...");
	}
	public void correioVoz() {
		System.out.println("Iniciou a conversa...");
	}
	
	public void digitarNumero() {
		System.out.println("Digitando os números do telefone...");
	}
	
	public void selecionar() {
		System.out.println("Verificando o contato na agenda...");
	}
	
	public void inserir() {
		System.out.println("Inserindo o contato na agenda...");
	}
	public void removendo() {
		System.out.println("Removendo o contato na agenda...");
	}
	
	public void bloquear() {
		if (numero == "Serviço telefonico Indesejado")
			System.out.println("Bloqueando o numero no telefone...");
	}
	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando...");
		
	}
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("Parando...");
		
	}
	@Override
	public void voltar() {
		// TODO Auto-generated method stub
		System.out.println("Voltando tela anterior...");
	}
	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		System.out.println("Abrindo Agenda....");
		
	}
	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		System.out.println("Fechando Aplicativo...");
		
	}
	
}
