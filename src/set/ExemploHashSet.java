package set;

import java.util.*;

/**
 * HashSet não tem ordem
 * O acesso aos dados é mais rápido que em um TreeSet, mas nada garante que os dados estejam ordenados.
 * Não repete valores na lista
 * 
 * @author rafael.rosa
 * 
 */

public class ExemploHashSet {
    public static void main(String[] args) {
        exemploNovo();
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploNovo() {
        System.out.println("**** exemploNovo ****");
        Set<Integer> inteiros = new HashSet<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);

        System.out.println(inteiros);
        System.out.println("");
    }

    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Set<String> lista = new HashSet<>();

        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        lista.add("João da Silva");
        
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("**** exemploListaSimplesOrdemAscendente ****");
        Set<String> lista = new HashSet<String>();

        lista.add("João da Silva");
        lista.add("Antônio Sousa");
        lista.add("Lúcia Ferreira");
        //Colletions.sort(lista);

        System.out.println(lista);
        System.out.println("");
    }
}
