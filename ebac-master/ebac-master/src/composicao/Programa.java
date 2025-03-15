package composicao;

public class Programa {

    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setCodigo(10L);
        banco.setNome("Banco Soldatelli");

        ContaCorrente cc = new ContaCorrente();
        cc.getBanco(banco);
        cc.setSaldo(10d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.getBanco(banco);
        cp.getSaldo(10d);
    }
}
