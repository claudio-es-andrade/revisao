package org.claudioESandrade.main;

import org.claudioESandrade.bank.Cliente;
import org.claudioESandrade.bank.Conta;
import org.claudioESandrade.bank.implementation.ContaCorrente;
import org.claudioESandrade.bank.implementation.ContaInvestimento;
import org.claudioESandrade.bank.implementation.ContaPoupança;

public class Principal {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "123456789-23" , "Rua X", "26/12/1976");

        Conta cc = new ContaCorrente(joao);
        cc.depositar(500.0);
        cc.sacar(1000.0);
        cc.transferir(10.0, cc);

        Conta pp = new ContaPoupança(joao);
        pp.depositar(100.0);
        pp.sacar(1000.0);
        pp.transferir(10.0, cc);

        Conta ci = new ContaInvestimento(joao);
        ci.depositar(1000.0);
        ci.sacar(3000.0);
        ci.transferir(10.0, cc);





        cc.imprimirExtrato();
        pp.imprimirExtrato();
        ci.imprimirExtrato();
    }
}
