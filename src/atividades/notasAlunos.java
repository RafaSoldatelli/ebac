package atividades;

import java.util.Scanner;

public class notasAlunos {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = s.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = s.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = s.nextFloat();
        System.out.println("Digite a quarta nota: ");
        float nota4 = s.nextFloat();

        float notaTotal = (nota1 + nota2 + nota3 + nota4) / 4;

        if(notaTotal >= 7) {
            System.out.println("Total: " + notaTotal);
            System.out.println("Aprovado!");
        } else if(notaTotal == 5) {
            System.out.println("Total: " + notaTotal);
            System.out.println("Recuperação!");
        } else  {
            System.out.println("Total: " + notaTotal);
            System.out.println("Reprovado!");
        }
    }
}
