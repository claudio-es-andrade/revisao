package org.claudioESandrade.bank.implementation;

import org.claudioESandrade.bank.Cliente;
import org.claudioESandrade.bank.Conta;

public class ContaInvestimento extends Conta {

    double valor = 0.0;

    public ContaInvestimento(Cliente cliente) {
        super();
    }

    @Override
    public void depositar(double valor) {
        this.valor += valor;
        System.out.println(" *** Depositando R$ " + valor + " na Conta Investimento *** " );
    }

    @Override
    public void sacar(double valor) {
        this.valor -= valor;
        System.out.println(" *** Sacando R$ " + valor + " da Conta Investimento *** " );
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.valor -= valor;
        System.out.println(" *** Transferindo R$ " + valor + " da Conta Investimento *** " );
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" *** Extrato Conta Investimento *** : R$" + this.valor );

    }
}
