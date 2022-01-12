package src;


public class Premio {
    private int premioObtenido;

   static int calcular_premio(int score,Jugador jugador){
       return (jugador.getScore()*1000);
    }
}
