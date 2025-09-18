public class Trabalhando extends Estado {


    public Trabalhando() {

    }

    public void enter(Juca juca) {
        System.out.println("Juca começou a trabalhar");
    }

    public void update(Juca juca) {

        juca.setHungry(juca.getHungry() + 2);
        juca.setFatigue(juca.getFatigue() + 5);
        juca.mostrarStatus();

        if (juca.getFatigue() > 50) {
            juca.setEstadoAtual(new Dormindo());
        } else if (juca.getHungry() > 10) {
            juca.setEstadoAtual(new Comendo());
        }
    }
}