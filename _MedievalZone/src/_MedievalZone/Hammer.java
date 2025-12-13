package _MedievalZone;

public class Hammer extends Weapon {
	
	private static int mult = 30;
	private static int baseDmg = 40;
	private static int baseWeight = 50;

	public Hammer() {
		super(baseDmg,baseWeight);
	}
	
	public Hammer(int mod) {
		super(baseDmg,baseWeight);
		modDmg(mod*mult);
		modWeight(mod*mult);
	}

	@Override
	public String toString() {
		return "This Weapon is a Hammer With "+ getDmg() +" Attack and "+ getWeight()+ " Weight";
	}

}
