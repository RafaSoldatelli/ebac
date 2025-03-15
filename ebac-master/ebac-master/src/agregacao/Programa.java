package agregacao;

public class Programa {

    public static void main(String[] args){
        Produto produto = criarProduto(1L, 10d, "TV");
        Produto produtoCel = criarProduto(2L, 1000d, "Celular");

        Vendedor vendedor = criarVendedor("Rafael", 10d);

        Comprador comprador = criarComprador("Rafael", 1010d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produto);
        venda.add(produtoCel);

        venda.concretizarVenda();
        System.out.println(venda);
        venda.cancelarVenda();
        venda = null;
        System.out.println(venda);
    }

    private static Comprador criarComprador(String nome, double verba) {
        Comprador comprador = new Comprador();
        comprador.setVerba(verba);
        comprador.setNome(nome);
        return comprador;
    }

    private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(comissao);
        vendedor.setNome(nome);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }
}
