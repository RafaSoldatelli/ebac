package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExemploHashMap {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesIterandoValores();
        exemploListaSimplesIterandoChaves();
        exemploListaSImplesIterandoChaveValor();
    }

    /**
     * Chave nunca se repete, é um ID que pode ser utilizado para remover da lista
     */

    public static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Joao da Silva");
        lista.put(4, "Lúcia Ferreira");

        lista.remove(3);

        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploListaSimplesIterandoValores() {
        System.out.println("**** exemploListaSimplesIterandoValores ****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Joao da Silva");
        lista.put(4, "Lúcia Ferreira");

        for (String value : lista.values()) {
            System.out.println(value);
        }
    }

    public static void exemploListaSimplesIterandoChaves() {
        System.out.println("**** exemploListaSimplesIterandoChaves ****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Joao da Silva");
        lista.put(4, "Lúcia Ferreira");

        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }
    }

    public static void exemploListaSImplesIterandoChaveValor() {
        System.out.println("**** exemploListaSImplesIterandoChaveValor ****");
        Map<Integer, String> lista = new HashMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(3, "Joao da Silva");
        lista.put(4, "Lúcia Ferreira");

        System.out.println("** for comum **");
        Set<Map.Entry<Integer, String>> entry = lista.entrySet();
        for (Map.Entry<Integer, String> e : entry) {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Valor: " + e.getValue());
        }

        System.out.println("** forEach stream **");
        lista.entrySet().forEach(e -> {
            System.out.println("Chave: " + e.getKey());
            System.out.println("Chave: " + e.getValue());
        });

        System.out.println("** forEach stream 1 **");
        lista.keySet().forEach(System.out::println);
        lista.values().forEach(System.out::println);

        System.out.println("** forEach stream 2 **");
        lista.values().stream().forEach(System.out::println);

        System.out.println("** forEach stream 2 **");
        lista.values().stream().forEach(System.out::println);

        System.out.println("** forEach stream 3 **");
        lista.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("** iterator **");
        for (Map.Entry<Integer, String> entry1 : lista.entrySet()) {
            System.out.println("Chave: " + entry1.getKey());
            System.out.println("valor: " + entry1.getValue());
        }
    }
}