package consumibles;



public class PociondeArmadura extends Consumible {

    private int aumentoDefensa;
    private int turnos;

    public PociondeArmadura() {
        super("Poción de Armadura");
        this.aumentoDefensa = 5;
        //this.turnos = 2;
    }

    @Override
    public void usar(Character objetivo) {
        objetivo.aumentarDefensa(aumentoDefensa);
    }
}
