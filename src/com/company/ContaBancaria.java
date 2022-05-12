package com.company;

import java.util.Scanner;

public abstract class ContaBancaria {
    int senha, numero;
    float saldo;

    public ContaBancaria (int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public abstract void saca(double valor);
    public abstract void deposita(double valor);
    public abstract void tiraExtrato();
    public void alterarSenha(int novaSenha) {
        int senhaInserida;
        Scanner scan = new Scanner(System.in);
        System.out.println("Confirme a senha atual: ");
        senhaInserida = scan.nextInt();
        if (senhaInserida == getSenha()){
            setSenha(novaSenha);
            System.out.println("Senha alterada com sucesso!");
        } else{
            System.out.println("Senha incorreta");
        }
    }

}

