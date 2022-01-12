package src;
    // clase jugador almacena el nombre y estadistica del jugador en el juego
    public class Jugador {
        private String nameUser;
        private int score=0;
        private int maximo_score=0;
        private int premio;
        //metodo constructor de la clase, solo se pasa el nombre los demas atributos se construyen a medida que transcurre el juego
        public Jugador(String nameUser) {
            this.nameUser = nameUser;
        }

        //metodos getters and setters
        public String getNameUser() {
            return nameUser;
        }
        public void setNameUser(String nameUser) {
            this.nameUser = nameUser;
        }                
        public void setScore(){
            this.score++;
            this.maximo_score=score;
        }
        public int getScore(){ 
            return this.score;
        }
        public void setPremio(){
            this.premio=this.score*1000;
        }
        public int getPremio() {
            return this.premio; 
        }
        public int getMaximoScore(){
            return this.maximo_score;
        }
        
        
    }