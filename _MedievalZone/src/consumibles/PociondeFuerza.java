package consumibles;


public class PociondeFuerza extends Consumible {

    private int aumentoDanio;
    private int turnos;

    public PociondeFuerza() {
        super("Poción de Fuerza");
        this.aumentoDanio = 3;
        //this.turnos = 2;
    }

    @Override
    public void usar(Character objetivo) {
        objetivo.aumentarDanio(aumentoDanio);
    }
}
