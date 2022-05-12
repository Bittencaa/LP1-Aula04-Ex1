package com.company;

public class ContaCorrente extends ContaBancaria{
    int qtdTransacoes, numeroTransacoes;

    public ContaCorrente(int senha) {
        super(senha);
    }

    @Override
    public void saca(double valor) {
        double saldoAtual = getSaldo();
        if (saldoAtual >= valor) {
            saldoAtual = saldoAtual - valor;
            setSaldo((float) saldoAtual);
            System.out.println("Saque efetuado com sucesso!");
            numeroTransacoes++;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void deposita(double valor) {
        double saldoAtual = getSaldo();
        saldoAtual = saldoAtual + valor;
        setSaldo((float) saldoAtual);
        System.out.println("Depósito efetuado com sucesso!");
        numeroTransacoes++;
    }

    @Override
    public void tiraExtrato() {
        System.out.println("Número da conta: " + getNumero());
        System.out.println("O seu saldo atual é: " + getSaldo());
        System.out.println("Foram efetuadas " + numeroTransacoes + " transações");
    }
}
