public interface Estado {

    void trabalhando (Main main, Jucax juca);

	void comendo (Main main, Jucax juca);

	void dormindo (Main main, Jucax juca);

	String getStatus();
}
