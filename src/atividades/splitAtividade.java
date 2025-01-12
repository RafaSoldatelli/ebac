package atividades;

import java.util.Arrays;
import java.util.Scanner;

   /**
    * Exemplo usando diretamente um Array uma entrada para cada nome
    */

public class splitAtividade {
    public static void main(String args[]) {
        ExemploSplit();
        ExemploArray();
        ExemploSplitSexo();
    }

    private static void ExemploArray() {
        System.out.println("**** ExemploArray ****");
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa: ");
        String pessoa1 = s.nextLine();
        System.out.println("Digite o nome da segunda pessoa: ");
        String pessoa2 = s.nextLine();
        System.out.println("Digite o nome da terceira pessoa: ");
        String pessoa3 = s.nextLine();
    
        String[] pessoas = {pessoa1, pessoa2, pessoa3};

        Arrays.sort(pessoas);
        System.out.println(Arrays.toString(pessoas));
        System.out.println("");
        // s.close();
    }
    
    
    /**
     * Exemplo usando split, não podemos fechar o Scanner, pois ele é fechado no main
     */

    private static void ExemploSplit() {
        System.out.println("**** ExemploSplit ****");
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome das pessoas separadas por vírgula: ");
        String pessoas = s.nextLine();

        String[] pessoasArray = pessoas.split(",");
        Arrays.sort(pessoasArray);
        
        System.out.println(Arrays.toString(pessoasArray));
        System.out.println("");

        // s.close();
    }

    private static void ExemploSplitSexo() {
        System.out.println("**** ExemploSplitSexo ****");
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome e o sexo das pessoas separadas por hífen, e vígula para um novo nome/sexo: ");
        String pessoas = s.nextLine();

        String[] pessoasArray = pessoas.split(",");
        Arrays.sort(pessoasArray);
        
        System.out.println(Arrays.toString(pessoasArray));
        System.out.println("");

        s.close();
    }
}
