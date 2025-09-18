public class Jucax {
    int hungry = 0;
    int fatigue = 0;
    Trabalhando estadoAtual; 

    public Jucax ( int hungryInicial, int fatigueInicial, Trabalhando estadoAtual){
        this.hungry = hungryInicial;
        this.fatigue = fatigueInicial;
        estadoAtual = new Trabalhando(this); 
    }
 
    public Trabalhando getStatus() {
            return estadoAtual;
        }

    public void setEstadoAtual(Trabalhando novoEstado) {
            System.out.println("!!! MUDANÇA DE ESTADO: " + this.estadoAtual + " -> " + novoEstado + " !!!");
            this.estadoAtual = novoEstado;
        }

    public void mostrarStatus(){
        this.hungry = Math.max(0, this.hungry);
        this.fatigue = Math.max(0, this.fatigue);
        System.out.println("--- Status do Juca ---");
        System.out.println("Fome: " + this.hungry);
        System.out.println("Fadiga: " + this.fatigue);
        System.out.println("Juca está: " + this.estadoAtual);
        System.out.println("---------------------------");

}
}