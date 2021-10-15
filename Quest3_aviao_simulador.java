public class Quest3_aviao_simulador {

    private int velocidade, altitude;

    public Quest3_aviao_simulador(int velocidade, int altitude){

        this.velocidade = velocidade;
        this.altitude = altitude;

    }
    public void VelocidadeAu(int Aumentar){
        this.velocidade += Aumentar;
    }
    public void VelocidadeMe(int diminuir){
        this.velocidade -= diminuir;
    }
    public int getVelocidade(){
        return this.velocidade;
    }

    public void AltitudeAu (int mais){
        this.altitude += mais;
    }
    public void AltitudeMe (int menos){
        this.altitude -= menos;
    }
    public int getAltitude(){
        return this.altitude;
    }
}

