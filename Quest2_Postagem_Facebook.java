public class Quest2_Postagem_Facebook {

    public static void main(String[] args){

        Quest2_post vegan = new Quest2_post("'coma mais vegatais!'", "https://www.instagram.com");

        vegan.Dar_curtida();
        vegan.Dar_curtida();
        vegan.Dar_curtida();

        System.out.println("Quantidade de curtidas: "+vegan.getNumeroCurtidas());

        vegan.compartilhar();
        vegan.compartilhar();

        System.out.println("Quantidade de compartilhamentos: "+vegan.getNumeroCompartilhamento());

    }
}
