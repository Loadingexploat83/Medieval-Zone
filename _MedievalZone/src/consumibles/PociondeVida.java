package consumibles;
import characters.*;

public class PociondeVida extends Consumible {

    private int curacion;

    public PociondeVida() {
        super("Poción de Vida");
        this.curacion = 15;
    }

    @Override
    public void usar(Enemy objetivo) {
        
    	//objetivo.curar(curacion);
    }
}
