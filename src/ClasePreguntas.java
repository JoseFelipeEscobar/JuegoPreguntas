package src;

public class ClasePreguntas {

    
public static Pregunta[] objeto(){ 
    Pregunta vector[]= {
        new Pregunta("Cual es el lenguaje que ha revolucionado la web?", new Respuesta[] {
            new Respuesta("Javascript", 'A', true),
                new Respuesta("Ruby", 'B', false),
                new Respuesta("Python", 'C', false),
                new Respuesta("PHP", 'D', false),
                
        }),
        new Pregunta("Cuál es la flor nacional de Japón? ", new Respuesta[] {
            new Respuesta("flor de cerezo", 'A', true),
                new Respuesta("flor de loto", 'B', false),
                new Respuesta("orquidea", 'C', false),
                new Respuesta("Rosa", 'D', false),
                
        }),
        new Pregunta("¿Cuál es el nombre de pila del aventurero Bear Grylls? ", new Respuesta[] {
            new Respuesta(" Johnny ", 'A', false),
                new Respuesta("Edward", 'B', true),
                new Respuesta("Jason", 'C', false),
                new Respuesta("Tonny", 'D', false),
                
        }),
        new Pregunta("¿Qué popular serie de Netflix nos habla sobre la vida del narcotraficante Pablo Escobar Gaviria? ", new Respuesta[] {
            new Respuesta("The Boys", 'A', false),
                new Respuesta("house of cards", 'B', false),
                new Respuesta("narcos", 'C', true),
                new Respuesta("casa de papel", 'D', false),
                
        }),

        
    };
    return (vector);

    }
}