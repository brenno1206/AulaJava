package com.mycompany.aula20250221;

import java.util.Scanner;

public class Aula20250221 {
    
    public static void menu() {
        System.out.printf("==========================================\n");
        System.out.printf("\t\t%s\n", "CALCULADORA");
        System.out.printf("==========================================\n");
        System.out.println("\t[1] Adição (+)");
        System.out.println("\t[2] Subtração (-)");
        System.out.println("\t[3] Multiplicação (*)");
        System.out.println("\t[4] Divisão (/)");
        System.out.println("\t[0] Sair");
        System.out.printf("==========================================\n");
        System.out.printf("Escolha uma opção: ");
    }
    
    public static void somar(int a, int b) {
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }
    public static void subtrair(int a, int b) {
        System.out.printf("%d - %d = %d\n", a, b, a - b);
    }
    public static void multiplicar(int a, int b) {
        System.out.printf("%d * %d = %d\n", a, b, a * b);
    }
    public static void dividir(int a, int b) {
        if (b == 0) {
            System.out.println("A divisão por 0 não é definida na matemática");
        } else {
            System.out.printf("%d / %d = %d\n", a, b, a / b);
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;
        int num1 = 0;
        int num2 = 0;
        
        do {
            menu();
            opcao = scanner.nextInt();
            
            if (opcao > 0 && opcao < 5) {
                System.out.printf("Digite o primeiro número: ");
                num1 = scanner.nextInt();
                System.out.printf("Digite o segundo número: ");
                num2 = scanner.nextInt();
            }
            
            switch (opcao) { 
                case 0:
                    System.out.println("Saindo da calculadora... 👋");
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
                    System.out.println("Opção inválida! Digite um número entre 0 e 4.");
                    break;
            }
            
        } while(opcao != 0);
        scanner.close();
    }
}
