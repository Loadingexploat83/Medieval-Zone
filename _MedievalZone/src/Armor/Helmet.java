package Armor;

public class Helmet extends Armour {
	
	//base
	private static int mult = 5;
	private static int base = 20;
	private int view = 10;
	
	public Helmet() {
		super(base);
	}
	
	public Helmet(int mod) {
		super(base);
		modDef(mod*mult);
		this.view += mod*mult;
	}
	
	//para aumentar la posiblidad del buscar
	public int observe() {
		return this.view;
	}
	
	
	@Override
	public String toString() {
		return "This helmets def value is " + getDef();
	}

}
