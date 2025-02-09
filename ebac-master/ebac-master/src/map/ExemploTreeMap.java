package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesIterandoValores();
    }

    /**
     * Chave nunca se repete
     * Garante que as chaves estarão em ordem ascendente
     * Pode ser retirado do mapa por chave
     */


    public static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "Lúcia Ferreira");
        lista.put(3, "João da Silva");


        System.out.println(lista);
        System.out.println("");
    }

    public static void exemploListaSimplesIterandoValores() {
        System.out.println("**** exemploListaSimplesIterandoValores ****");
        Map<Integer, String> lista = new TreeMap<>();
        lista.put(1, "João da Silva");
        lista.put(2, "Antonio Sousa");
        lista.put(4, "Lúcia Ferreira");
        lista.put(3, "Joao da Silva");


        for (Integer value : lista.keySet()) {
            System.out.println(value);
        }
    }
}
