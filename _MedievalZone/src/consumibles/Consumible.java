package consumibles;



public abstract class Consumible {

    protected String nombre;

    public Consumible(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    
    public abstract void usar(Character objetivo);

    @Override
    public String toString() {
        return nombre;
    }
}
