public class Quest3_simulador {

    public static void main(String[] args){

        Quest3_aviao_simulador aviao = new Quest3_aviao_simulador(900, 10);

        System.out.println("Velocidade: "+aviao.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+aviao.getAltitude()+" Km\n");

        aviao.AltitudeMe(1);
        aviao.VelocidadeMe(100);

        System.out.println("Velocidade: "+aviao.getVelocidade()+" Km/h");
        System.out.println("Altitude: "+aviao.getAltitude()+" Km");
    }
}

    

