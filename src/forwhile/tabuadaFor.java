package forwhile;

import java.util.Scanner;

public class tabuadaFor {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número para gerar a tabuada: ");
        int number = s.nextInt();
        for (int i = 0; i <=10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }
    }
}
