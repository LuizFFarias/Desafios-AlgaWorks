import java.util.Arrays;

public class Cardapio {
    ItemCardapio[] itens;
    ItemCardapio[] novosItens;

    void adicionarItem(ItemCardapio item) {
        // TODO implementar inclusão de item do cardápio
        if (itens == null){
            itens = new ItemCardapio[]{item};
        } else {
            this.itens = Arrays.copyOf(itens, itens.length + 1);
            itens[itens.length - 1] = item;
        }

    }

    void removerItem(int indice) {
        // TODO implementar exclusão de item do cardápio da posição informada
        novosItens = new ItemCardapio[itens.length - 1];
        System.arraycopy(itens, 0, novosItens, 0, indice);
        System.arraycopy(itens, indice + 1, novosItens, indice, novosItens.length - indice);
        itens = novosItens;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        // TODO implementar código para imprimir na console os itens
        //  do cardápio que estiverem entre o preço mínimo e máximo
        System.out.println("----- Itens Cadastrados -----");
        for (ItemCardapio item : itens) {
            if (item.preco >= precoMinimo && item.preco <= precoMaximo){
                System.out.printf("%s R$: %.2f\n", item.descricao, item.preco);
            }
        }
    }
}
