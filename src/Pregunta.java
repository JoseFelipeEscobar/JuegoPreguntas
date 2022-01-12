package src;
import java.util.Scanner;


class Pregunta {
    private String pregunta;
    private Respuesta[] respuestasPosibles;
    public Pregunta(String pregunta, Respuesta[] respuestasPosibles) {
        this.pregunta = pregunta;
        this.respuestasPosibles = respuestasPosibles;
    }
    // la funcion principal que se encarga de preguntar 
    public void preguntar(Jugador jugador) {
        System.out.println(this.pregunta);
        char letraCorrecta = 'A';
        for (Respuesta opcion: this.respuestasPosibles) {
            if (opcion.esCorrecta()) letraCorrecta = opcion.getLetra();
            System.out.print(String.valueOf(opcion.getLetra()) + ")" + opcion.getRespuesta() + " ");
        }
        System.out.println("\nElige: ");
        Scanner sc = new Scanner(System.in);
        char letraElegidaPorElUsuario = sc.next().toUpperCase().charAt(0);
        if (letraElegidaPorElUsuario == letraCorrecta){
            System.out.println("Correcto");
            jugador.setScore();
            jugador.setPremio();
        }
        if (letraElegidaPorElUsuario != 'A' || letraElegidaPorElUsuario!='B'|| letraElegidaPorElUsuario!='C' || letraElegidaPorElUsuario!='D'){
            return;
        }


        System.out.println("Incorrecto, la respuesta correcta era " + String.valueOf(letraCorrecta));
        }

    
    public String getPregunta() {
        return pregunta;
    }

}
