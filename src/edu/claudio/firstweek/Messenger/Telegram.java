package edu.claudio.firstweek.Messenger;

public class Telegram extends ServicoMensagemInstantanea{
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
//	// De Publico para Privado
//	private void validarConectadoInternet() {
//		System.out.println("Validando se está conectado a Internet");
//	}
//	private void salvarHistoricoMensagem() {
//		System.out.println("Salvando o historico da mensagem");
//	}
	
}
