public class Quest2_post {

    private String text, link;
    private int numeroCurtidas, numeroCompartilhamento;

    public Quest2_post(String text, String link){

        this.text = text;
        this.link = link;

    }

    public void Dar_curtida(){
        this.numeroCurtidas+=1;
    }
    public int getNumeroCurtidas(){
        return this.numeroCurtidas;
    }

    public void compartilhar(){
        this.numeroCompartilhamento+=1;
    }
    public int getNumeroCompartilhamento(){
        return this.numeroCompartilhamento;
    }
}