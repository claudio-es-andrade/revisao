package aparelho;

import Multimedia.Player;
import Multimedia.WebBrowser;
import Servicos.Telefone;

public class Iphone {
	
	Player vlc      = new Player();
	WebBrowser crom = new WebBrowser();
	Telefone sky    = new Telefone();
	
   public void usandoApps() {
	   vlc.abrir();
	   crom.abrir();
	   sky.abrir();
	   
	   vlc.avancar();;
	   crom.botaoAtualizar(null);;
	   sky.atender();
	   
	   vlc.selecionarAlbum();
	   crom.botaoNovaAba();
	   sky.correioVoz();
   }

}
