public class Main {

    public static void main(String[] args) throws InterruptedException {
        Trabalhando Teste;
        Teste = new Trabalhando(null);
 
      
        Jucax juca = new Jucax(0, 0, new Trabalhando(null));
        juca.estadoAtual =;
        while (true) {
            System.out.println("Current State: " + juca.getStatus());
            

            // Lógica de transição (antigo Gerenciador)
            verificarTransicoes(juca);

            Thread.sleep(1000);
        }
    }

    // O Gerenciador pode ser um método estático aqui para simplificar
    public static void verificarTransicoes(Juca juca) {
        Estados estadoAtual = juca.getEstadoAtual();

        if (juca.fadiga > 50 && EstadosAbstract.atual = EstadosAbstract.trabalhar) {
            juca.setEstadoAtual(new Dormindo(juca));
        } else if (juca.fome > 30 && estadoAtual instanceof Trabalhando) {
            juca.setEstadoAtual(new Comendo(juca));
        } else if (juca.fome <= 0 && estadoAtual instanceof Comendo) {
            juca.setEstadoAtual(new Trabalhando(juca));
        } else if (juca.fadiga <= 0 && juca.fome <= 0 && !(estadoAtual instanceof Trabalhando)) {
            juca.setEstadoAtual(new Trabalhando(juca));
        }
    }
}