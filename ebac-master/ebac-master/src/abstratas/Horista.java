package abstratas;

public class Horista extends Empregado{

    private Double precoHora;
    private Double horaTrabalhada;

    @Override
    public Double vencimento() {
        return precoHora * horaTrabalhada;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(Double horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }
}
