public class Dormindo extends EstadosAbstract {

    public Dormindo(Juca juca) {
        super(juca);
    }
    public void update() {
        System.out.println("Juca está dormindo... ZzzZz");
        juca.fatigue -= 10;
        juca.hungry +=1;
        atual = dormir;
    }

    
    public String getNomeDoEstado() {
        return "Dormindo";
    }
}