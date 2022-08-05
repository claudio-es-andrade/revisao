package Multimedia;

import aparelho.TelefoneHardware;

public class Player extends TelefoneHardware {
	
	public void tocar() {
		System.out.println("Início da faixa...");
	}
	public void pausar() {
		System.out.println("Pausando...");
	}
	public void parar() {
		System.out.println("Parando...");
	}
	public void avancar() {
		System.out.println("Avançando...");
	}
	public void voltar() {
		System.out.println("Voltando...");
	}
	public void selecionar() {
		System.out.println("Selecionando...");
	}
	public void abrir() {
		System.out.println("Abrindo o album...");
	}
	
	public void fechar() {
		System.out.println("Fechando o album...");
	}
	
	public void selecionarAlbum() {
		selecionar();
		System.out.println("Escolhendo o album...");
	}
	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		System.out.println("Iniciou o player...");
	}
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		System.out.println("Desligou conexão...");
		
	}
	
	@Override
	public void removendo() {
		// TODO Auto-generated method stub
		System.out.println("Removeu músicas da pasta temporária...");
		
	}
	@Override
	public void bloquear() {
		// TODO Auto-generated method stub
		System.out.println("Bloqueio da tela para o player continuar com a playlist...");
		
	}
	
	
}
