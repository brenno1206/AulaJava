package com.mycompany.aula20250228;

public class Aula20250228 {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        
        Cliente joao = new Cliente();
        Conta cjoao = new Conta();
        Cliente maria = new Cliente();
        Conta cmaria = new Conta();
        
        joao.cpf = "1";
        joao.nome = "joao";
        joao.sobrenome = "joao";
        
        cjoao.numero = 12;
        cjoao.limite = 1000;
        cjoao.saldo = 3000;
        cjoao.titular = joao;
        
        joao.conta = cjoao;
        
        maria.cpf = "2";
        maria.nome = "maria";
        maria.sobrenome = "maria";
        
        cmaria.numero = 14;
        cmaria.limite = 500;
        cmaria.saldo = 2000;
        cmaria.titular = maria;
        
        maria.conta = cmaria;
        
        joao.conjuge = maria;
        joao.conjuge.conta.limite = joao.conta.limite;
        
        System.out.println("LIMITE MARIA: " + cmaria.limite);
    }
}