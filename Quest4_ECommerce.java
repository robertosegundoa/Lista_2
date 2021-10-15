public class Quest4_ECommerce {

    public static void main(String[] args){

        Quest4_Produto_Ecommerce produt1 = new Quest4_Produto_Ecommerce("Feijão de Mineiro", 10, 1000.00);

        System.out.println("Produto: "+produt1.getNomeProduto());
        System.out.println("Preco: "+produt1.getPrecoProduto());

        produt1.Comprar(1);

        System.out.println("Quantidade em estoque: "+produt1.getQuantidadeProduto());

        produt1.Comprar(1);

        System.out.println("Quantidade em estoque: "+produt1.getQuantidadeProduto());

        produt1.Comprar(9);

        System.out.println("Quantidade em estoque: "+produt1.getQuantidadeProduto());
    }
}
    

