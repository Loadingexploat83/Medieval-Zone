package consumibles;
import characters.*;

public class PociondeArmadura extends Consumible {

    private int aumentoDefensa;
    private int turnos;

    public PociondeArmadura() {
        super("Poción de Armadura");
        this.aumentoDefensa = 5;
        //this.turnos = 2;
    }

    @Override
<<<<<<< HEAD
    public void usar(Character objetivo) {
        objetivo.aumentarDefensa(aumentoDefensa);
=======
    public void usar(Enemy objetivo) {
        objetivo.Guard(aumentoDefensa/*, turnos*/);
>>>>>>> branch 'master' of https://github.com/Loadingexploat83/Medieval-Zone.git
    }
}
