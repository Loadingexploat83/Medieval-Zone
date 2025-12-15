package Armor;

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
	
	public void setDef(int def) {
		this.def = def;
	}
	public abstract String toString();
}
