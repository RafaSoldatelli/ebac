package set;

import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSetAluno {
    public static void main(String[] args) {
        ExemploListaSimples();
    }

    public static void ExemploListaSimples(){
        Set<Aluno> conjunto = new TreeSet<>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Maria da Silva", "Linux básico", 0);
        Aluno c = new Aluno("Antônio Sousa", "OpenOffice", 0);
        
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);

        System.out.println(conjunto);

    }

}
