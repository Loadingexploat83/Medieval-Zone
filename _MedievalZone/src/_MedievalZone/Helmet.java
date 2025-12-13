package _MedievalZone;

public class Helmet extends Armour {
	
	//base
	private static int mult = 5;
	private static int base = 20;
	
	public Helmet() {
		super(base);
	}
	
	public Helmet(int mod) {
		super(base);
		modDef(mod*mult);
	}
	
	
	
	@Override
	public String toString() {
		return "This helmets def value is " + getDef();
	}

}
