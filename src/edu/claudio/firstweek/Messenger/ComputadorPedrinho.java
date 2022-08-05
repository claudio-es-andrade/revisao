package edu.claudio.firstweek.Messenger;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
//		//abrindo MSN Messenger
//		MSNMessenger msn              = new MSNMessenger();
//		FacebookMessenger fcb    = new FacebookMessenger();
//		Telegram tlg             = new Telegram();
		//Metodos Privados
		//msn.validarConectadoInternet();
		//msn.salvarHistoricoMensagem();
		
		String appEscolhido = "msn";
		
		if( appEscolhido.equals("msn") )
			smi = new MSNMessenger();
		else if ( appEscolhido.equals("fcb") )
			smi = new FacebookMessenger();
		else if ( appEscolhido.equals("tlg") ) 
		 	smi = new Telegram();
		
		smi.enviarMensagem();
		smi.receberMensagem();
//		msn.enviarMensagem();
//		msn.receberMensagem();
//		
//		fcb.enviarMensagem();
//		fcb.receberMensagem();
//		
//		tlg.enviarMensagem();
//		tlg.receberMensagem();

	}

}
