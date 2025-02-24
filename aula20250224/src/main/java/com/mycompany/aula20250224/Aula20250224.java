package com.mycompany.aula20250224;

public class Aula20250224 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Conta mc = new Conta();
        
        mc.dono = "Jose";
        mc.limite = 5000;
        mc.numero = 1234;
        mc.saldo = 4000;
        
        mc.sacar();
        mc.depositar();
    }
}
