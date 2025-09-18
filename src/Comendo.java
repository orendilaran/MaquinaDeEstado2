public class Comendo extends Estado {

    public Comendo() {

    }

    public void enter(Juca juca) {
        System.out.println("Bateu uma fome...");
    }

    public void update(Juca juca) {

        juca.setHungry(juca.getHungry() - 5);
        System.out.println("Comendo...");
        juca.mostrarStatus();


        if (juca.getHungry() <= 0) {
            juca.setHungry(0);
            System.out.println("Ufa! Já estou cheio...");
            juca.setEstadoAtual(new Trabalhando());
        }

    }

}