package composicao;

public class ContaPoupanca {
    private Banco banco;
    private Double saldo;

    public Double getSaldo(double saldo) {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Banco getBanco(Banco banco) {
        return this.banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
