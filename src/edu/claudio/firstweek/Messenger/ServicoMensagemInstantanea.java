package edu.claudio.firstweek.Messenger;

public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem(); 
// {
//  		validarConectadoInternet();
//  		System.out.println("Enviando mensagem");
//  		salvarHistoricoMensagem();
//	}
	public abstract void receberMensagem(); 
//	{
//		System.out.println("Recebendo mensagem");
//	}
	// De Publico para Privado
	// De privado para Protected
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a Internet");
	}
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico da mensagem");
	}
	
}
