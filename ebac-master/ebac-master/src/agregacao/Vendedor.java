package agregacao;

public class Vendedor {
    private Double comissao;
    private String nome;

    public Double getComissao(Double comissao) {
        return this.comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void vende(){
        System.out.println("Vender");
    }
}
