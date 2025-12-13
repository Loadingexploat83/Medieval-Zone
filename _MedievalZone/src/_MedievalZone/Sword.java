package _MedievalZone;

public class Sword extends Weapon {
	
	private static int mult = 5;
	private static int baseDmg = 10;
	private static int baseWeight = 20;
	
	public Sword() {
		super(baseDmg,baseWeight);
	}
	
	public Sword(int mod) {
		super(baseDmg,baseWeight);
		modDmg(mod*mult);
		modWeight(mod*mult);
		
	}
	
	@Override
	public String toString() {
		return "This Weapon is a Sword With "+ getDmg() +" Attack and "+ getWeight()+ " Weight";
	}

}
