package banco;


public class Principal {

	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.setNome("João");
		joao.setCpf("123456789-23");
		joao.setDataDeNascimento("26/12/1976");
		
		
		Iconta cc = new ContaCorrente(joao);
		cc.depositar(500);
		
		Iconta poupanca = new ContaPoupanca(joao);
		cc.transferir(30, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
