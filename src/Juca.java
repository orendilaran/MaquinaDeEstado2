public class Juca {
    int hungry = 0;
    int fatigue = 0;
    Estado estadoAtual;


    public Juca(int hungryInicial, int fatigueInicial){
        this.hungry = hungryInicial;
        this.fatigue = fatigueInicial;
        this.estadoAtual = new Trabalhando();
        System.out.println("--- Juca foi criado! ---");
        // Executa a ação de entrada do primeiro estado
        this.estadoAtual.enter(this);
    }
    public void update() {
        //Um update que serve para todos os updates das classes de estado
        this.estadoAtual.update(this);

    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hunger) {
        // Garante que a fome nunca seja negativo
        this.hungry = Math.max(0, hunger);
    }

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        // Garante que o cansaço nunca seja negativo.
        this.fatigue = Math.max(0, fatigue);
    }

    public Estado getEstadoAtual() {
        return estadoAtual;
    }


    public void setEstadoAtual(Estado novoEstado) {
        System.out.println("!!! MUDANÇA DE ESTADO: " + this.estadoAtual + " -> " + novoEstado + " !!!");
        this.estadoAtual = novoEstado;

        this.estadoAtual.enter(this);
    }

    public void mostrarStatus() {
        System.out.println("--- Status do Juca ---");
        System.out.println("Fome: " + this.hungry);
        System.out.println("Fadiga: " + this.fatigue);
        System.out.println("Juca está: " + this.estadoAtual);
        System.out.println("---------------------------");
    }

}