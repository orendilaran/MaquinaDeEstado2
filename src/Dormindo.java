public class Dormindo extends Estado {

    public Dormindo() {

    }
    public void enter(Juca juca) {
        System.out.println("Bateu um sono...");
    }

    public void update(Juca juca) {

        juca.setHungry(juca.getHungry() + 1);
        juca.setFatigue(juca.getFatigue() - 10);
        juca.mostrarStatus();

        if (juca.getFatigue() <= 0) {
            juca.setFatigue(0);
            System.out.println("Acordei renovado!");
        }
        if (juca.getHungry() <= 10 && juca.getFatigue() <= 0) {
            juca.setEstadoAtual(new Trabalhando());
            System.out.println("Hora de ir para o trabalho!");
        } else if (juca.getHungry() > 10 && juca.getFatigue() <= 0) {
            juca.setEstadoAtual(new Comendo());
            System.out.println("Bateu uma fome...");
        }
    }
}
