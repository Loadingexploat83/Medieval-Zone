package _MedievalZone;

public class Leggings extends Armour {
	
	private static int mult = 5;
	private static int base = 30;
	
	public Leggings() {
		super(base);
	}
	
	public Leggings(int mod) {
		super(base);
		modDef(mod*mult);
	}
	

	@Override
	public String toString() {
		return "This Leggings def value is " + getDef();
	}

}
