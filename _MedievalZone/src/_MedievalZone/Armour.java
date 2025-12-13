package _MedievalZone;

public abstract class Armour {
	
	private int def;
	
	public Armour(int def) {
		this.def = def;
	}
	public void modDef(int mod) {
		this.def += mod;
	}
	
	public int getDef() {
		return def;
	}
	
	public abstract String toString();
}
