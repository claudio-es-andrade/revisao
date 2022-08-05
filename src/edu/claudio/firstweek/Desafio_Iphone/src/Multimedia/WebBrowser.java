package Multimedia;

import aparelho.TelefoneHardware;

public class WebBrowser extends TelefoneHardware {
	
	private String endereco;
	
	public void digitarEndereco(String endereco) {
		System.out.println("Digitando o endereço...");
	}
	public void botaoAtualizar(String endereco) {
		System.out.println("Atualizando a página...");
	}
	public void zoomInZoomOut() {
		pinch();
		doubleTap();
		System.out.println("Aumentando ou diminuindo o tamanho da tela...");
	}
	public void pinch() {
		// TODO Auto-generated method stub
		System.out.println("Usando os dedos como uma pinça para aumentar ou diminuir a tela...");
		
	}
	public void doubleTap() {
		// TODO Auto-generated method stub
		System.out.println("Dois tapas seguidos com o dedo para aumentar e diminuir o tamanho da tela...");
	}
	
	public void botaoNovaAba() {
		System.out.println("Abrindo uma nova aba do navegador...");
	}
	
	public void verEmail() {
		avancar();
		voltar();
		selecionar();
		
		System.out.println("Verificando Emails... ");
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
	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando de carregar página...");
		
	}
	@Override
	public void parar() {
		// TODO Auto-generated method stub
		System.out.println("Parando de carregar página...");
		
	}
	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		System.out.println("Abrindo o aplicativo...");
		
	}
	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		System.out.println("Fechando...");
	}
	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando a navegação com página em branco... ");
		
	}
	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		System.out.println("Desconectar serviços e manter página...");
		
	}
	@Override
	public void removendo() {
		// TODO Auto-generated method stub
		System.out.println("Removendo acumulado do cache...");
		
	}
	@Override
	public void bloquear() {
		// TODO Auto-generated method stub
		System.out.println("Bloqueio de sites sugeridos...");
		
	}
	
}
