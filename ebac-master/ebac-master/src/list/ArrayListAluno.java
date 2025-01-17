package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAluno {

    public static void main(String args[]) {
        exemploListaSimplesOrdenadaComparatorAluno();
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("**** exemploListaSimplesOrdenadaComparatorAluno ****");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 20);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 30);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 10);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista sem ordenação" + lista);
        Collections.sort(lista);
        System.out.println("Lista com ordenação" + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota" + lista);

        System.out.println("");
    }
}
