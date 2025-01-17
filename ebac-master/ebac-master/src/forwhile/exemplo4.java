package forwhile;

import java.util.Scanner;

public class exemplo4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar a tabuada de algum número? ");
        String resposta = s.next();

        while(resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Qual é o número da tabuada?");
            int num = s.nextInt();
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }
            System.out.println("Deseja gerar novamente a tabuada de algum número? ");
            resposta = s.next();
        }
        System.out.println("Obrigado. ");
    }
}
