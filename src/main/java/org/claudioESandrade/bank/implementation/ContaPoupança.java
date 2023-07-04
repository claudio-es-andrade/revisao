package org.claudioESandrade.bank.implementation;

import org.claudioESandrade.bank.Cliente;
import org.claudioESandrade.bank.Conta;

public class ContaPoupança extends  Conta {

    double valor = 0.0;

    public ContaPoupança(Cliente cliente) {
        super();
    }

    public void depositar(double valor){
        this.valor = valor;
        System.out.println(" *** Depositando R$ " + valor + " na Conta Poupança *** " );
    }

    public void sacar(double valor){
        this.valor -= valor;
        System.out.println(" *** Sacando R$ " + valor + " da Conta Poupança *** " );
    }

    public void transferir(double valor, Conta destino){
        this.valor -= valor;
        System.out.println(" *** Transferindo R$ " + valor + " da Conta Poupança *** " );
    }

    public void imprimirExtrato() {
        System.out.println(" *** Extrato Conta Poupança *** :  R$" + this.valor );
    }
}
