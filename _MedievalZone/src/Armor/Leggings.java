package Armor;

public class Leggings extends Armour {
	
	private static int mult = 5;
	private static int base = 30;
	private int speed = 2;
	
	public Leggings() {
		super(base);
	}
	
	public Leggings(int mod) {
		super(base);
		modDef(mod*mult);
		this.speed += mod;
	}
	
	//ability to make yourself have the starting turn;
	public int legSpeed() {
		return this.speed;
	}
	

	@Override
	public String toString() {
		return "This Leggings def value is " + getDef();
	}

}
