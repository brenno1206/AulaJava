package com.mycompany.aula20250217;

import java.util.Scanner;

public class Aula20250217 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;
        int num1 = 0;
        int num2 = 0;
        
        do {

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

            opcao = scanner.nextInt(); // Captura a opção digitada pelo usuário
            if (opcao != 0) {
                System.out.printf("Digite o primeiro número: ");
                num1 = scanner.nextInt();
                System.out.printf("Digite o segundo número: ");
                num2 = scanner.nextInt();
            }
            // Validação da opção
            switch (opcao) { 
                case 0:
                    System.out.println("Saindo da calculadora... 👋");
                    break;
                case 1:
                    System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
                    break;
                case 2:
                    System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
                    break;
                case 3:
                    System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
                    break;
                case 4:
                    System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número entre 0 e 4.");
                    break;
            }
        } while(opcao != 0);
        scanner.close();
    }
}