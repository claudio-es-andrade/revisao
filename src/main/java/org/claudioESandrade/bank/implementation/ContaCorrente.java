package org.claudioESandrade.bank.implementation;

import org.claudioESandrade.bank.Cliente;
import org.claudioESandrade.bank.Conta;

public class ContaCorrente extends Conta {

    double valor = 0.0;

    public ContaCorrente(Cliente cliente) {
        super();
    }

    @Override
    public void depositar(double valor) {
        this.valor += valor;
        System.out.println(" *** Depositando R$ " + valor + " na Conta Corrente *** " );
    }

    public void sacar(double valor) {
        this.valor -= valor;
        System.out.println(" *** Sacando R$ " + valor + " da Conta Corrente *** " );
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.valor -= valor;
        System.out.println(" *** Transferindo R$ " + valor + " da Conta Corrente *** " );
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" *** Extrato Conta Corrente *** : R$" + this.valor  );

    }
}
