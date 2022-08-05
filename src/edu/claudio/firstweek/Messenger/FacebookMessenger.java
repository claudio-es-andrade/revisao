package edu.claudio.firstweek.Messenger;

public class FacebookMessenger extends ServicoMensagemInstantanea{
	
	public void enviarMensagem() {
		 validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
		 salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
//	// De Publico para Privado
//	private void validarConectadoInternet() {
//		System.out.println("Validando se está conectado a Internet");
//	}
//	private void salvarHistoricoMensagem() {
//		System.out.println("Salvando o historico da mensagem");
//	}
}
