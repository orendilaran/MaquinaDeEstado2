public class Comendo extends EstadosAbstract {

    public Comendo(Juca juca) {
        super(juca);
    }
    
    public void update() {
         System.out.println("Juca está comendo...");
            juca.hungry -= 5;
            atual = comer;
    }

    
    public String getNomeDoEstado() {
        return "Comendo";
    }
}