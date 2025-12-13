package _MedievalZone;

public class Hammer extends Weapon {
	
	private int mult = 30;

	public Hammer() {
		super(40, 50);
	}
	
	public Hammer(int mod) {
		super(40,50);
		modDmg(mod*mult);
		modWeight(mod*mult);
	}

	@Override
	public String toString() {
		return "This Weapon is a Hammer With "+ getDmg() +" Attack and "+ getWeight()+ " Weight";
	}

}
