package consumibles;
import characters.*;

public class PociondeFuerza extends Consumible {

    private int aumentoDanio;
    private int turnos;

    public PociondeFuerza() {
        super("Poción de Fuerza");
        this.aumentoDanio = 3;
        this.turnos = 3;
    }

    @Override

    public void usar(Enemy objetivo) {
    	
    	objetivo.aumentarDanio(aumentoDanio, turnos);
    	
    }
   
    
    
}

