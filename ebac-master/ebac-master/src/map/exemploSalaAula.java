package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exemploSalaAula {

    public static void main(String args[]){
        Map<Integer, List<Aluno>> listaSala = new HashMap<>();

        List<Aluno> alunosSala1 = criarTurma("Sala 1", 11);
        listaSala.put(1, alunosSala1);

        List<Aluno> alunosSala2 = criarTurma("Sala 2", 31);
        listaSala.put(2, alunosSala2);

        for(Integer salaId : listaSala.keySet()) {
            System.out.println("Alunos da Sala " + salaId + ":");
            imprimirAlunosSala(listaSala.get(salaId));
        }

//        imprimirAlunosSala(listaSala.get(1));
//        imprimirAlunosSala(listaSala.get(2));
    }

    private static List<Aluno> criarTurma(String sala, int count) {
        List<Aluno> alunos = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Aluno aluno = new Aluno("Nome aluno" + i, sala);
            alunos.add(aluno);
        }
        return alunos;
    }

    private static void imprimirAlunosSala(List<Aluno> alunos) {
        System.out.println("for java 7 API stream");
        alunos.forEach(aluno -> System.out.println("Nome: " + aluno.getNome()  + " " + "Sala: " + aluno.getSala()));
        System.out.println("");
    }
}
