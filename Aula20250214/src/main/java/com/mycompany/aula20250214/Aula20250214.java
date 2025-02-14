
package com.mycompany.aula20250214;

import java.util.Scanner;

public class Aula20250214 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\n\n\n ===============================");
        System.out.println("|\t\tMENU            |");
        System.out.println(" ===============================");
        System.out.println("|\t 1)+(Adição)            |");
        System.out.println("|\t 2)-(Subtração)         |");
        System.out.println("|\t 3)*(Multipliacação)    |");
        System.out.println("|\t 4)/(Divisão)           |");
        System.out.println("|\t 0)Sair                 |");
        System.out.println(" ===============================");
        System.out.print("Digite a opção desejada: ");
        
        int operacao = scan.nextInt();
        System.out.print("A operação selecionada foi " + operacao);
        if (operacao == 1) {
            System.out.print("Adição");
        }
        else if (operacao == 2) {}
        else if (operacao == 3) {}
        else if (operacao == 4) {}
        else {}
    }
}
