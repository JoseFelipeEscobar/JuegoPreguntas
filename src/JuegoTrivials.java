package src;
import java.util.Scanner;

/**
 * java doc
 * @author Jose Felipe Escobar Ballesta
 * adaptacion de Trivial Pursuit game
 * 
 */

public class JuegoTrivials 
{
    public static void main( String[] args ){
        // se captura el nombre del jugador
        Scanner sc=new Scanner(System.in);
        System.out.println(" ingrese su nombre de jugador");
        String name = sc.nextLine();
        Jugador jugador=new Jugador(name);
        int jugar= 1;// control de flujo para salir del juego
        while (jugar!=0){
            // se crea un array con las preguntas y posibles repuestas, ademas de los valores de si son verdaderas o no
            Pregunta [] preguntas = ClasePreguntas.objeto();
            //aqui se crea un ciclo que va a generar las preguntas
            for (Pregunta p: preguntas) {
                p.preguntar(jugador);
            }
            //despues de terminar el ciclo 
            System.out.println(jugador.getNameUser()+" tu eres el gandador y tu premio es:  $"+jugador.getPremio());
            System.out.println("tu score es  "+jugador.getScore());
            System.out.println("si deseas salir del juego oprime cero 0: ");
            jugar =sc.nextInt();
            if (jugar==0){System.out.print("adios vuelve pronto");
            System.out.println(" tu maximo escore es "+jugador.getMaximoScore());
            }
    }
    }
}