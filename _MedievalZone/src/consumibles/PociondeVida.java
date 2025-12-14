package consumibles;

public class PociondeVida extends Consumible {

    private int curacion;

    public PociondeVida() {
        super("Poción de Vida");
        this.curacion = 15;
    }

    @Override
    public void usar(Character objetivo) {
        objetivo.curar(curacion);
    }
}
