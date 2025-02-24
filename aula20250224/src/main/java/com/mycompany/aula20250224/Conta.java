package com.mycompany.aula20250224;

import java.util.Scanner;

public class Conta {
    int numero;
    String dono = new String();
    double saldo;
    double limite;
    
    Scanner scan = new Scanner(System.in);
    
    void imprimir() {
        System.out.println("Número: " + numero);
        System.out.println("Dono: " + dono);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
    }
    
    void sacar() {
        double saque = 0;
        System.out.println("Quanto voce quer sacar?");
        saque = scan.nextDouble();
        if(saldo - saque < 0) {
            System.out.println("Inválido. Tentativa de saque maior que o saldo disponível.");
            return;
        }
        saldo -= saque;
        System.out.println("Valor do saque: " + saque);
        System.out.println("Seu saldo final e de: " + saldo);
    }
    
    void depositar() {
        double deposito = 0;
        System.out.println("Quanto voce quer depositar?");
        deposito = scan.nextDouble();
        if((saldo + deposito) > limite) {
            System.out.println("Invalido. Valor excede o Limite.");
            return;
        }
        saldo += deposito;
        System.out.println("Valor do deposito: " + deposito);
        System.out.println("Seu saldo final e de: " + saldo);
    }
}
