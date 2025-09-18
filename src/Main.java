public class Main {
        public static void main(String[] args) throws InterruptedException {
            Juca juca = new Juca(0,0);

            // Loop infinito para simular os ticks da vida do Juca
            while (true) {
                juca.update();
                Thread.sleep(3000); // Pausa de 1 segundo entre cada tick para podermos observar
            }
        }
    }