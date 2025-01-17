package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {

    public static void main(String args[]) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploListaNumeros();
    }

    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");

        lista.remove(0);
        System.out.println(lista);

        boolean contem = lista.contains("João da Silva");
        System.out.println(contem);

        System.out.println(lista.get(0));
       
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("**** exemploListaSimplesOrdemAscendente ****");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaNumeros() {
        System.out.println("**** exemploListaNumeros ****");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);
        System.out.println((numeros));
    }
}
