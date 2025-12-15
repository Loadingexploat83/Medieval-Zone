package consumibles;
import characters.*;

public class PociondeFuerza extends Consumible {

    private int aumentoDanio;
    private int turnos;

    public PociondeFuerza() {
        super("Poción de Fuerza");
        this.aumentoDanio = 3;
        //this.turnos = 2;
    }

    @Override
<<<<<<< HEAD
    public void usar(Character objetivo) {
        objetivo.aumentarDanio(aumentoDanio);
=======
    public void usar(Enemy objetivo) {
        
    	//objetivo.aumentarDanio(aumentoDanio, turnos);
>>>>>>> branch 'master' of https://github.com/Loadingexploat83/Medieval-Zone.git
    }
}
