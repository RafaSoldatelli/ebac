package atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class colecoesParte2 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // Cria duas listas para armazenar os nomes
        List<String> grpMasculino = new ArrayList<>();
        List<String> grpFeminino = new ArrayList<>();

        // Instrução para controle de fluxo e encerramento do programa, implementado para conseguir ler vários nomes sem reiniciar o programa
        while(true){
            System.out.println("Digite o nome (ou digite 'fim' para encerrar):");
            String nome = s.nextLine();

            if(nome.equalsIgnoreCase("fim")){
                break;
            }

            System.out.println("Digite o sexo (M para masculino ou F para feminino): ");
            String sexo = s.nextLine();

            if (sexo.equalsIgnoreCase("F")) {
                grpFeminino.add(nome);
            } else if (sexo.equalsIgnoreCase("M")) {
                grpMasculino.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor digite 'Masculino' ou 'Feminino'");
            }
        }
        System.out.println("Grupo Masculino: " + grpMasculino);
        System.out.println("Grupo Feminino: " + grpFeminino);


    }
}
