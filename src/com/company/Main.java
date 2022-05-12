package com.company;

public class Main {

    public static void main(String[] args) {
	ContaPoupanca c = new ContaPoupanca(1234);
    c.setSaldo(2000);
    c.deposita(4000);
    c.saca(500);
    c.deposita(300);
    c.tiraExtrato();
    }
}
