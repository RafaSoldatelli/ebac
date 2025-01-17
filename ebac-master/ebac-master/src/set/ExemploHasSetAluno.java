package set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author rafael.rosa
 */

public class ExemploHasSetAluno {
    
    public static void main(String[] args) {
        exemploRemover();
        exemploConsultando();
        exemploListaSimples();
    }

    private static void exemploRemover(){
        System.out.println("**** exemploRemover ****");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antônio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antônio Sousa", "OpenOffice", 0);
        
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        conjunto.remove(a);

        System.out.println(conjunto);  
        System.out.println("");

        for (Aluno aluno : conjunto) {
            System.out.println(aluno);
         }
    }

    private static void exemploConsultando() {
        System.out.println("**** exemploConsultando ****");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antônio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antônio Sousa", "OpenOffice", 0);
        Aluno e = new Aluno("teste", "Edge", 0);
        
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto.contains(e));
        System.out.println("");

        
    }

    /**
     * Para não repetir objetos na lista de alunos é necessário que a classe Aluno tenha o método equals() e hashCode() implementados
     */

    private static void exemploListaSimples() {
        System.out.println("**** exemploListaSimples ****");
        Set<Aluno> conjunto = new HashSet<Aluno>();

        Aluno a = new Aluno("João da Silva", "Linux básico", 0);
        Aluno b = new Aluno("Antônio Sousa", "OpenOffice", 0);
        Aluno c = new Aluno("Lúcia Ferreira", "Internet", 0);
        Aluno d = new Aluno("Antônio Sousa", "OpenOffice", 10);
        Aluno e = new Aluno("teste", "Edge", 0);
        
        conjunto.add(a);
        conjunto.add(b);
        conjunto.add(c);
        conjunto.add(d);

        System.out.println(conjunto);  
        System.out.println("");
    }
}
