public class Trabalhando extends EstadosAbstract {



    public Trabalhando(Jucax juca) {
        super();
        this.juca = juca;
    }


    public String getNomeDoEstado() {
        return "Trabalhando";
    }

    @Override
    public void dormindo(Main main, Jucax jucaa) {
       
    }

    @Override
    public String getStatus() {
        // Return a status string
        return "Juca está trabalhando.";
    }

    @Override
    public void trabalhando(Main main, Jucax juca) {
         juca.hungry += 2;
        juca.fatigue += 5;
        System.out.println("Juca está trabalhando");

    }

    @Override
    public void comendo(Main main, Jucax juca) {

        
    }
}