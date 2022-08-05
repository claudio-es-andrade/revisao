package banco;

//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
public abstract class Conta implements Iconta{
	
	
	private static final int AGENCIA_PADRAO = 1;
	private int SEQUENCIAL = 1;
	
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return AGENCIA_PADRAO;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Iconta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()  )  );
		System.out.println(String.format("CPF: %s", this.cliente.getCpf()  )  );
		System.out.println(String.format("Data de Nascimento: %s", this.cliente.getDataDeNascimento()  )  );
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		
	}
	
	
}
