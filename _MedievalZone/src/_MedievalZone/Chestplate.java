package _MedievalZone;

public class Chestplate extends Armour {
	private static int mult = 5;
	private static int base = 50;
	
	public Chestplate() {
		super(base);
	}
	public Chestplate(int mod) {
		super(base);
		modDef(mod*mult);
	}
	
	@Override
	public String toString() {
		return "This Chestplate def value is " + getDef();
	}

}
