package src;


public class Respuesta {
    private String respuesta;
    private char letra;
    private boolean correcta;

//clase constructora recibe como parametro una cadena que contiene la respuesta,la letra de la pregunta, y un boolean de si es correcta la respuesta

    public Respuesta(String respuesta, char letra, boolean correcta) {
        this.respuesta = respuesta;
        this.letra = letra;
        this.correcta = correcta;
    }

    public String getRespuesta() {
        return respuesta;
    }
    public char getLetra() {
        return letra;
    }

    public boolean esCorrecta() {
        return this.correcta;
    }
}