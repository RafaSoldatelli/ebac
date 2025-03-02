package abstratas;

public class Programa {

    public static void main (String args[]) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Rafael");
        empregado.setSobrenome("Soldatelli da Rosa");
        empregado.setSalario(5000d);
        imprimir(empregado);
//        System.out.println("Empregado: " + empregado.getNome() + " " + empregado.getSobrenome() + "\nSalário: " + empregado.vencimento());
//        System.out.println(" ");

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("Gato");
        comissionado.setNome("Samuel");
        comissionado.setSobrenome("O Gato");
        comissionado.setTotalVenda(1000d);
        comissionado.setTotalComissao(5d);
        imprimir(comissionado);
//        System.out.println("Comissionado: " + comissionado.getNome() + " " + comissionado.getSobrenome() + "\nSalário: " + comissionado.vencimento());
//        System.out.println(" ");

        Horista horista = new Horista();
        horista.setCpf("2");
        horista.setNome("Gabriele");
        horista.setHoraTrabalhada(220d);
        horista.setPrecoHora(23.5d);
        imprimir(horista);
//        System.out.println("Horista: " + horista.getNome() + " " + horista.getSobrenome() + "\nSalário: " + horista.vencimento());
    }

    public static void imprimir(Empregado empregado){
        if(empregado instanceof Horista) {
            Horista hor = (Horista) empregado;
            System.out.println("Vlr Hora: " + hor.getPrecoHora());
        } else if (empregado instanceof Comissionado) {
            Comissionado comis = (Comissionado) empregado;
            System.out.println("Comissão: " + comis.getTotalComissao());
        }
        System.out.println(empregado.getNome() + " Tem salário: " + empregado.vencimento());
    }
}
