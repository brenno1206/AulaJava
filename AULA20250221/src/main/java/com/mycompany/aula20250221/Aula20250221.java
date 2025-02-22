package com.mycompany.aula20250221;

import java.util.Scanner;

public class Aula20250221 {
    
   public static void criarCalculadora() {
        System.out.println("=================================");
        System.out.println("===============MENU==============");
        System.out.println("=================================");
        System.out.println("\t 1) Adição");
        System.out.println("\t 2) Subtração");
        System.out.println("\t 3) Multiplicação");
        System.out.println("\t 4) Divisão");
        System.out.println("\t 0) Sair");
        System.out.println("=================================");
    }

    public static void somar(int a, int b) {
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }
    public static void subtrair(int a, int b) {
        System.out.printf("%d - %d = %d\n", a, b, a - b);
    }
    public static void multiplicar(int a, int b) {
        System.out.printf("%d x %d = %d\n", a, b, a * b);
    }
    public static void dividir(int a, int b) {
        if( b == 0) {
            System.out.println("A divisão por 0 não é definida na matemática");
            return;
        }
        System.out.printf("%d / %d = %d\n", a, b, a / b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int operacao = 1;
        int num1 = 0;
        int num2 = 0;
        do {
            criarCalculadora();
            System.out.print("Digite a operação desejada: ");
            operacao = scan.nextByte();
            
            if (operacao > 0 && operacao < 5 ) {
                System.out.print("Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.print("Digite o segundo número: ");
                num2 = scan.nextInt();
            }
            
            switch (operacao) {
                case 0:
                    System.out.println("Saindo . . .");
                    break;
                case 1:
                    somar(num1,num2);
                    break;
                case 2:
                    subtrair(num1,num2);
                    break;
                case 3:
                    multiplicar(num1,num2);
                    break;
                case 4:
                    dividir(num1,num2);
                    break;
                default:
                    System.out.println("A número escolhido não se faz presente na calculadora.");
                    break;
            }
         
        
        } while (operacao != 0);
        scan.close();
    }
}
