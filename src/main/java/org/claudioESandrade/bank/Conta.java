package org.claudioESandrade.bank;

public abstract class Conta {
    Cliente cliente;

    String dataDeAbertura;

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public abstract void transferir(double valor, Conta destino);

    public abstract void imprimirExtrato();
}
